package com.cooksup

import com.cooksup.model.Ingredient
import io.ktor.http.*
import io.ktor.client.request.*
import kotlin.test.*
import com.cooksup.plugins.*
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*
import kotlinx.coroutines.runBlocking

class ApplicationTest {
    lateinit var server: ApplicationEngine
    lateinit var client: HttpClient

    @BeforeTest
    fun init() {
        server = embeddedServer(CIO, port = 8080, host = "0.0.0.0") {
            configureSerialization()
            configureRouting()
        }.start()
        client = HttpClient(io.ktor.client.engine.cio.CIO) {
            install(ContentNegotiation) {
                json()
            }
        }
    }

    @Test
    fun testRoot() {
    }
}
