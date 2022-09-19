package com.cooksup.plugins

import com.cooksup.model.ingredients
import com.cooksup.model.recipes

import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Application.configureRouting() {
    routing {
        get("/ingredients") {
            call.respond(
                ingredients
            )
        }
        get("/recipes") {
            call.respond(
                recipes
            )
        }
    }
}
