package com.cooksup

import com.cooksup.model.IngredientRepository
import com.cooksup.model.RecipeFullRepository
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
//    RecipesRepository.init()
    RecipeFullRepository.init()
//    initDB()

//    IngredientRepository.ingredients.forEach {
//        transaction {
//            IngredientDB.new {
//                name = it.name.replace("%", "процент")
//                group = it.group
//            }
//        }
//    }
//
//    RecipeFullRepository.recipes.forEach {
//        transaction {
//            RecipeDB.new {
//                name = it.name
//                ingredients = it.ingredients.map { it.name }.toString()
//            }
//        }
//    }
}
