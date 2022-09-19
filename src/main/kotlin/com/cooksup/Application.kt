package com.cooksup

import com.cooksup.model.recipes
import io.ktor.server.engine.*
import io.ktor.server.cio.*
import com.cooksup.plugins.*

fun main() {
    checkData()
    embeddedServer(CIO, port = 8080, host = "0.0.0.0") {
        configureSerialization()
        configureRouting()
    }.start(wait = true)
}

fun checkData() {
    recipes
}
