package com.cooksup

import com.cooksup.model.Ingredient
import com.cooksup.model.Recipes
import com.cooksup.model.ingredients
import com.cooksup.model.recipes
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
        runBlocking {
            client.get("http://127.0.0.1:8080/ingredients").apply {
                assertEquals(HttpStatusCode.OK, status)
                assertEquals(ingredients.toString(), body<List<Ingredient>>().toString())
            }
            client.get("http://127.0.0.1:8080/recipes").apply {
                assertEquals(HttpStatusCode.OK, status)
                assertEquals(recipes.toString(), body<List<Recipes>>().toString())
            }
        }
    }
}
