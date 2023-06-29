package com.cooksup.model

import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.litote.kmongo.Id

@Serializable
data class Ingredient(
    val name: String,
    val description: String = "",
    val pic: String = "",
    val nutrition: Nutrition = Nutrition(),
    val history: String = "",
    val benefitAndHarm: String = "",
    val taste: String = "",
    val howTo: String = "",
    val howLong: String = ""
)

data class IngredientDB(
    @BsonId
    val id: Id<IngredientDB>? = null,
    val name: String,
    val description: String = "",
    val pic: String = "",
    val nutrition: Nutrition = Nutrition(),
    val history: String = "",
    val benefitAndHarm: String = "",
    val taste: String = "",
    val howTo: String = "",
    val howLong: String = ""
)
