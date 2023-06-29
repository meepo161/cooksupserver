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

    fun findByIngredient(ingredientsList: List<Ingredient>?): List<Recipe> {
        val list = mutableListOf<Recipe>()
        ingredientsList?.forEach { ingredient ->
            list.addAll(recipeCollection.find(Recipe::ingredients contains ingredient).map { it.toJSON() }.toList())
        }
        return list
    }
}