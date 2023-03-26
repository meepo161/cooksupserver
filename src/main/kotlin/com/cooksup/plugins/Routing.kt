package com.cooksup.plugins

import com.cooksup.model.Ingredient
import com.cooksup.model.IngredientRepository
import com.cooksup.model.RecipeFullRepository
import com.cooksup.model.RecipesRepository
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
        get("/recipes") {
            call.respond(
                RecipesRepository.recipes
            )

        }
        get("/recipe_full") {
            call.respond(
                RecipeFullRepository.recipes
            )
        }
        get("/recipe_filtered") {
            val result =
                context.parameters["ingredients"]?.split(",")?.map { it.trim().replace("]", "").replace("[", "") }
                    ?.map {
                        Ingredient(it)
                    }
            result!!.forEach {
                println(it.name)
            }
            call.respond(
                RecipeFullRepository.initFiltered(result)
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
