package com.cooksup.model

import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.litote.kmongo.Id

@Serializable
data class PersonDto(
    val id: String? = null,
    val name: String,
    val email: String,
    val password: String,
)

data class Person(
    @BsonId
    val id: Id<Person>? = null,
    val name: String,
    val email: String,
    val password: String,
)
