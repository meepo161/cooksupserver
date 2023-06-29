package com.cooksup.model

import kotlinx.serialization.Serializable

fun IngredientDB.toJSON(): Ingredient =
    Ingredient(
        name = this.name,
        description = this.description,
        pic = this.pic,
        nutrition = this.nutrition,
        history = this.history,
        benefitAndHarm = this.benefitAndHarm,
        taste = this.taste,
        howTo = this.howTo,
        howLong = this.howLong
    )

fun Ingredient.toDB(): IngredientDB =
    IngredientDB(
        name = this.name,
        description = this.description,
        pic = this.pic,
        nutrition = this.nutrition,
        history = this.history,
        benefitAndHarm = this.benefitAndHarm,
        taste = this.taste,
        howTo = this.howTo,
        howLong = this.howLong
    )

@Serializable
data class ErrorResponseIngredient(val message: String) {
    companion object {
        val NOT_FOUND_RESPONSE = ErrorResponsePerson("Ingredient was not found")
        val BAD_REQUEST_RESPONSE = ErrorResponsePerson("Invalid request")
    }
}