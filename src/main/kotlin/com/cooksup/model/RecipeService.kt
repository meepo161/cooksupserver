package com.cooksup.model

import com.cooksup.client
import com.mongodb.BasicDBObject
import org.bson.types.ObjectId
import org.litote.kmongo.*
import org.litote.kmongo.id.toId

class RecipeService {
    val database = client.getDatabase("recipe")
    val recipeCollection = database.getCollection<RecipeDB>()

    fun create(recipeDB: RecipeDB): Id<RecipeDB>? {
        recipeCollection.insertOne(recipeDB)
        return recipeDB.id
    }

    fun findAll(): List<RecipeDB> {
        return recipeCollection.find().toList()
    }

    fun findAllWithIds(listIds: List<String>): List<Recipe> {
        val listRecipes = mutableListOf<Recipe>()
        listIds.forEach { id ->
            recipeCollection.findOne(RecipeDB::id eq ObjectId(id).toId())?.let { listRecipes.add(it.toJSON()) }
        }
        return listRecipes.toList()
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
        try {
            val count = 200
            val time = System.currentTimeMillis()
            val list = mutableListOf<Recipe>()
            val variations = generateVariations(ingredientsList!!)

            variations.forEach { variation ->
                if (list.size < count) {
                    recipeCollection.find(Recipe::ingredients all variation).limit(200).map { it.toJSON() }
                        .map { it }.forEach {
                            if (list.size < count) {
                                list.add(it)
                            }
                        }
                }
            }
            println(list[0].id)
            return list
        } catch (e: Exception) {
            e.printStackTrace()
            return listOf()
        }
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