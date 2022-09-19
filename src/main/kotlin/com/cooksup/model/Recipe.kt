package com.cooksup.model

import kotlinx.serialization.Serializable

@Serializable
data class Recipe(
    val quantityIngredients: List<Measure>,
    val ingredients: List<Ingredient> = quantityIngredients.map { it.ingredient },
    val servings: Int = 1,
    val instructions: List<String>,
)
