package com.cooksup.model

import com.cooksup.Singleton.client
import org.bson.types.ObjectId
import org.litote.kmongo.*
import org.litote.kmongo.id.toId

class IngredientService {
    val database = client.getDatabase("ingredient")
    val ingredientCollection = database.getCollection<IngredientDB>()

    fun create(ingredientDB: IngredientDB): Id<IngredientDB>? {
        ingredientCollection.insertOne(ingredientDB)
        return ingredientDB.id
    }

    fun findAll(): List<IngredientDB> {
        return ingredientCollection.find().toList()
    }

    fun findById(id: String): IngredientDB? {
        val bsonId: Id<IngredientDB> = ObjectId(id).toId()
        return ingredientCollection.findOne(IngredientDB::id eq bsonId)
    }
}