package com.cooksup.model

import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.litote.kmongo.Id

@Serializable
data class Fields(
    val id: String? = null,
    val fields: List<String> = listOf()
)

data class Field(
    @BsonId
    val id: Id<Field>? = null,
    val fields: List<String> = listOf(),
)