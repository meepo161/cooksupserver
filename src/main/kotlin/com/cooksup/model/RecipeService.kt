package com.cooksup.model

import com.mongodb.BasicDBObject
import org.bson.types.ObjectId
import org.litote.kmongo.*
import org.litote.kmongo.id.toId

class RecipeService {
    val client = KMongo.createClient()
    val database = client.getDatabase("recipe")
    val recipeCollection = database.getCollection<RecipeDB>()

    fun create(RecipeDB: RecipeDB): Id<RecipeDB>? {
        recipeCollection.insertOne(RecipeDB)
        return RecipeDB.id
    }

    fun findAll(): List<RecipeDB> {
        return recipeCollection.find().toList()
    }

    fun findById(id: String): RecipeDB? {
        val bsonId: Id<RecipeDB> = ObjectId(id).toId()
        return recipeCollection.findOne(RecipeDB::id eq bsonId)
    }

    fun findByName(nameRequest: String): List<Recipe> {
        val regexQuery = BasicDBObject()
        regexQuery["name"] =
            BasicDBObject("${MongoOperator.regex}", "$nameRequest.*").append("${MongoOperator.options}", "i")
        return recipeCollection.find(regexQuery).map { it.toJSON() }.toList()
    }


    //    fun initFiltered(list: List<Ingredient>): MutableList<Recipe> {
//        println(list)
//        try {
//            recipesFiltered.clear()
//            val variations = generateVariations(list)
//            var recipesCount = 0
//            variations.forEach { variation ->
//                recipes1.filter { recipe ->
//                    recipe.ingredients.map(Ingredient::name).containsAll(variation.map { it.name })
//                }.forEach {
//                    if (recipesCount++ < 400) {
//                        recipesFiltered.add(it)
//                        println(it.name)
//                    }
//                }
//            }
//        } catch (e: Exception) {
//            e.printStackTrace()
//        }
//        return recipesFiltered.toMutableList()
//    }

    fun findByIngredient(ingredientsList: List<Ingredient>?): List<Recipe> {
        val list = mutableListOf<Recipe>()
        try {
            val variations = generateVariations(ingredientsList!!)
            variations.forEach { variation ->
                list.addAll(recipeCollection.find(Recipe::ingredients all variation).limit(400).map { it.toJSON() })
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        val recipesList = mutableListOf<Recipe>()
        list.forEachIndexed { index, recipe ->
            if (index < 400) {
                recipesList.add(recipe)
            }
        }
        return recipesList
    }


    fun generateVariations(ingredients: List<Ingredient>): List<List<Ingredient>> {
        val variations = mutableListOf<List<Ingredient>>()
        if (ingredients.isNotEmpty()) {
            for (i in ingredients.indices) {
                val variation = mutableListOf<Ingredient>()
                for (j in i until (i + ingredients.size)) {
                    val index = j % ingredients.size
                    variation.add(ingredients[index])
                    variations.add(variation.toList())
                }
            }
        }

        return variations.sortedBy { it.size }.reversed()
    }
}