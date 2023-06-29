package com.cooksup.model

import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.litote.kmongo.Id

@Serializable
data class Recipe(
    val name: String,
    val description: String = "",
    val pic: String = "",
    val nutrition: Nutrition = Nutrition(),
    val time: String = "",
    val servings: Int = 1,
    val quantityIngredients: List<Measure> = listOf(),
    val ingredients: List<Ingredient> = quantityIngredients.map { it.ingredient },
    val instructions: List<Step> = listOf()
)

data class RecipeDB(
    @BsonId
    val id: Id<RecipeDB>? = null,
    val name: String,
    val description: String = "",
    val pic: String = "",
    val nutrition: Nutrition = Nutrition(),
    val time: String = "",
    val servings: Int = 1,
    val quantityIngredients: List<Measure> = listOf(),
    val ingredients: List<Ingredient> = quantityIngredients.map { it.ingredient },
    val instructions: List<Step> = listOf()
)
