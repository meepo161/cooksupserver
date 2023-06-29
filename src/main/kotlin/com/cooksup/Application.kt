package com.cooksup

import com.cooksup.model.IngredientRepository
import com.cooksup.model.RecipeRepository
import com.cooksup.plugins.configureRouting
import com.cooksup.plugins.configureSerialization
import io.ktor.server.cio.*
import io.ktor.server.engine.*
import org.litote.kmongo.Id
import org.litote.kmongo.KMongo
import org.litote.kmongo.getCollection


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