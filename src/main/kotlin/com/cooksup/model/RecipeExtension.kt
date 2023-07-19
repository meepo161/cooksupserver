package com.cooksup.model

import kotlinx.serialization.Serializable

fun RecipeDB.toJSON(): Recipe =
    Recipe(
        id = this.id.toString(),
        name = name,
        description = description,
        pic = pic,
        nutrition = nutrition,
        time = time,
        servings = servings,
        quantityIngredients = quantityIngredients,
        ingredients = ingredients,
        instructions = instructions
    )

fun Recipe.toDB(): RecipeDB =
    RecipeDB(
        name = name,
        description = description,
        pic = pic,
        nutrition = nutrition,
        time = time,
        servings = servings,
        quantityIngredients = quantityIngredients,
        ingredients = ingredients,
        instructions = instructions
    )

@Serializable
data class ErrorResponseRecipe(val message: String) {
    companion object {
        val NOT_FOUND_RESPONSE = ErrorResponsePerson("Recipe was not found")
        val BAD_REQUEST_RESPONSE = ErrorResponsePerson("Invalid request")
    }
}