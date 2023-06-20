package com.cooksup.plugins

import com.cooksup.model.Ingredient
import com.cooksup.model.IngredientRepository
import com.cooksup.model.RecipeFull
import com.cooksup.model.RecipeFullRepository
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/ingredients") {
//            val page = context.parameters["page"]?.toIntOrNull() ?: 0
            call.respond(
                IngredientRepository.ingredients
            )
        }
        get("/recipe_full1") {
            call.respond(
                RecipeFullRepository.recipes1
            )
        }
        get("/recipe_filtered_from_text") {
            val result = context.parameters["name"]
            println(result)
            call.respond(RecipeFullRepository.initFilteredFromText(result!!))
        }
//        get("/recipe_full2") {
//            call.respond(
//                RecipeFullRepository.recipes2
//            )
//        }
//        get("/recipe_full3") {
//            call.respond(
//                RecipeFullRepository.recipes3
//            )
//        }
        get("/recipe_filtered") {
            val result =
                context.parameters["ingredients"]?.split(",")?.map { it.trim().replace("]", "").replace("[", "") }
                    ?.map {
                        Ingredient(it)
                    }
            call.respond(
                RecipeFullRepository.initFiltered(result!!)
            )
        }
        static("ingredients_pics") { // web path
            files("ingredients") // folder from where to serve files
        }
        static("recipes_pics") { // web path
            files("recipes") // folder from where to serve files
        }
    }
}
