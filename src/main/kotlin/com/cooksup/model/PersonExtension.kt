package com.cooksup.model

import kotlinx.serialization.Serializable

fun Person.toDto(): PersonDto =
    PersonDto(
        id = this.id.toString(),
        name = this.name,
        email = this.email,
        password = this.password
    )

fun PersonDto.toPerson(): Person =
    Person(
        name = this.name,
        email = this.email,
        password = this.password
    )

@Serializable
data class ErrorResponsePerson(val message: String) {
    companion object {
        val NOT_FOUND_RESPONSE = ErrorResponsePerson("Person was not found")
        val BAD_REQUEST_RESPONSE = ErrorResponsePerson("Invalid request")
        val ALL_READY_RESPONSE = ErrorResponsePerson("All ready exists")
    }
}