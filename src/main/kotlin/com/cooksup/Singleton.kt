package com.cooksup

import org.litote.kmongo.KMongo

object Singleton {
    val client = KMongo.createClient("mongodb://localhost:27017")
}