package com.cooksup.model

import kotlinx.serialization.Serializable

fun Field.toFields(): Fields =
    Fields(
        id = this.id.toString(),
        fields = this.fields
    )

fun Fields.toField(): Field =
    Field(
        fields = this.fields
    )

@Serializable
data class ErrorResponseField(val message: String) {
    companion object {
        val NOT_FOUND_RESPONSE = ErrorResponsePerson("Field was not found")
        val BAD_REQUEST_RESPONSE = ErrorResponsePerson("Invalid request")
        val ALL_READY_RESPONSE = ErrorResponsePerson("All ready exists")
    }
}