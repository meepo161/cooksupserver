package com.cookup

import io.ktor.server.engine.*
import io.ktor.server.cio.*
import com.cookup.plugins.*

fun main() {
    embeddedServer(CIO, port = 8080, host = "0.0.0.0") {
        configureSerialization()
        configureRouting()
    }.start(wait = true)
}
