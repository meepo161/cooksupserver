package com.cooksup.model

import com.cooksup.client
import org.litote.kmongo.*

class FieldService {
    val database = client.getDatabase("fields")
    private val fieldCollection = database.getCollection<Field>()

    fun create(field: Field): Id<Field>? {
        fieldCollection.insertOne(field)
        return field.id
    }

    fun findAll(): List<Field> {
        return fieldCollection.find().toList()
    }
}