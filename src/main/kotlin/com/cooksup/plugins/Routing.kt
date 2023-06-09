package com.cooksup.plugins

import com.cooksup.model.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Application.configureRouting() {
    val personService = PersonService()
    val ingredientService = IngredientService()
    val recipeService = RecipeService()
//    IngredientRepository.ingredients.forEach {
//        ingredientService.create(it.toDB())
//    }
//    RecipeRepository.recipes1.forEach {
//        recipeService.create(it.toDB())
//    }

    routing {
        static("/static") {
            resources("files")
        }
        route("/person") {
            post {
                val request = call.receive<PersonDto>()
                val person = request.toPerson()
                if (personService.findAll().filter { it.email == person.email }.isEmpty()) {
                    personService.create(person)
                        ?.let { userId ->
                            call.response.headers.append("My-User-Id-Header", userId.toString())
                            call.respond(HttpStatusCode.Created)
                        } ?: call.respond(HttpStatusCode.BadRequest, ErrorResponsePerson.BAD_REQUEST_RESPONSE)
                } else {
                    call.respond(HttpStatusCode.BadRequest, ErrorResponsePerson.ALL_READY_RESPONSE)
                }
            }
            get {
                val peopleList = personService.findAll().map(Person::toDto)
                call.respond(PersonDto("ОСУЖДАЮ", "ОСУЖДАЮ", "ОСУЖДАЮ", "ОСУЖДАЮ"))
            }
            get("/auth/{id}") {
                val id = call.parameters["id"].toString()
                personService.findById(id)
                    ?.let { foundPerson -> call.respond(foundPerson.toDto()) }
                    ?: call.respond(HttpStatusCode.NotFound, ErrorResponsePerson.NOT_FOUND_RESPONSE)
            }
            get("/{data}") {
                val result =
                    call.parameters["data"]?.split(",")?.map { it.trim().replace("]", "").replace("[", "") }
                        ?.map {
                            it
                        }
                call.respond(personService.findUser(result)!!.toDto())
                println(result.toString())
//                personService.findUser(result!!)
//                    ?.let { foundPerson -> call.respond(foundPerson.toDto()) }
//                    ?: call.respond(HttpStatusCode.NotFound, ErrorResponsePerson.NOT_FOUND_RESPONSE)
            }
        }

        get("/ingredients") {
            val ingredientsList = ingredientService.findAll().map(IngredientDB::toJSON)
            call.respond(ingredientsList)
        }

        route("/recipe_filtered_from_text") {
            get("/{name}") {
                var name = call.parameters["name"].toString()
                call.respond(recipeService.findByName(name))
            }
        }
        route("/recipe_filtered") {
            get("/{ingredients}") {
                var result =
                    call.parameters["ingredients"]?.split(",")?.map { it.trim().replace("]", "").replace("[", "") }
                var ingredientList = result?.map {
                    Ingredient(it)
                }
                println("ingredientList $ingredientList")
                println("result $result")
                call.respond(recipeService.findByIngredient(ingredientList))
            }
        }

//        get("/recipe_full1") {
//            call.respond(
//                RecipeRepository.recipes1
//            )
//        }
//        get("/recipe_full2") {
//            call.respond(
//                RecipeRepository.recipes2
//            )
//        }
//        get("/recipe_full3") {
//            call.respond(
//                RecipeRepository.recipes3
//            )
//        }
//        get("/recipe_filtered_from_text") {
//            val result = context.parameters["name"]
//            call.respond(RecipeRepository.initFilteredFromText(result!!))
//        }
//        get("/recipe_filtered") {
//            val result =
//                context.parameters["ingredients"]?.split(",")?.map { it.trim().replace("]", "").replace("[", "") }
//                    ?.map {
//                        Ingredient(it)
//                    }
//            call.respond(
//                RecipeRepository.initFiltered(result!!)
//            )
//        }
        static("ingredients_pics") { // web path
            files("ingredients_pics") // folder from where to serve files
        }
        static("recipes_pics") { // web path
            files("recipes_pics") // folder from where to serve files
        }
    }
}
