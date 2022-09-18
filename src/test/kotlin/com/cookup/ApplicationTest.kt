package com.cookup

import com.cookup.model.Ingredient
import io.ktor.http.*
import io.ktor.client.request.*
import kotlin.test.*
import io.ktor.server.testing.*
import com.cookup.plugins.*
import io.ktor.client.call.*

class ApplicationTest {
    @Test
    fun testRoot() = testApplication {
        application {
            configureSerialization()
            configureRouting()
        }
        client.get("/").apply {
            assertEquals(HttpStatusCode.OK, status)
//            assertEquals(listOf(Ingredient("Огурец")), body()) TODO
        }
    }
}
