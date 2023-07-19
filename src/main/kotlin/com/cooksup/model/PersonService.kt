package com.cooksup.model

import com.cooksup.client
import org.bson.types.ObjectId
import org.litote.kmongo.*
import org.litote.kmongo.id.toId

class PersonService {
    private val database = client.getDatabase("person")
    private val personCollection = database.getCollection<Person>()

    fun create(person: Person): Id<Person>? {
        personCollection.insertOne(person)
        return person.id
    }

    fun updateById(id: String, request: String): Boolean =
        findById(id)
            ?.let { person ->
                val newList = person.favourite.toMutableList()
                newList.add(request)
                val updateResult = personCollection.replaceOne(person.copy(favourite = newList))
                updateResult.modifiedCount == 1L
            } ?: false

    fun findAll(): List<Person> {
        return personCollection.find().toList()
    }

    fun findById(id: String): Person? {
        val bsonId: Id<Person> = ObjectId(id).toId()
        return personCollection
            .findOne(Person::id eq bsonId)
    }

    fun findByEmail(email: String): Person? {
        return personCollection.findOne(Person::email eq email)
    }

    fun findUser(personData: List<String>?): Person? {
        return personCollection.findOne(and(Person::email eq personData!![0], Person::password eq personData[1]))
    }
}