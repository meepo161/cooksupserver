package com.cooksup.model

import kotlinx.serialization.Serializable

@Serializable
data class Step(
    val text: String,
    val pic: String
)
