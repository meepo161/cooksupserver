package com.cooksup

import com.cooksup.model.*
import com.cooksup.plugins.configureRouting
import com.cooksup.plugins.configureSerialization
import com.mongodb.client.MongoClient
import io.ktor.server.cio.*
import io.ktor.server.engine.*
import org.litote.kmongo.KMongo

var DEBUG = false

lateinit var client: MongoClient
fun main(args: Array<String>) {
    DEBUG = true
    if (DEBUG) {
        checkData()
    }
//    client = KMongo.createClient()
        client = KMongo.createClient("mongodb://avem:avem123avem456@localhost:27017")
    embeddedServer(CIO, port = 80, host = "0.0.0.0") {
        configureSerialization()
        configureRouting()
    }.start(wait = true)
}

fun checkData() {
    IngredientRepository.init()
    RecipeRepository.init()
}