package com.cooksup

import com.cooksup.model.*
import com.cooksup.plugins.configureRouting
import com.cooksup.plugins.configureSerialization
import io.ktor.server.cio.*
import io.ktor.server.engine.*


fun main(args: Array<String>) {
    checkData()
    embeddedServer(CIO, port = 80, host = "0.0.0.0") {
        configureSerialization()
        configureRouting()
    }.start(wait = true)
}

fun checkData() {
    IngredientRepository.init()
    RecipeRepository.init()
}