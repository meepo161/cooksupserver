package com.cooksup

import org.litote.kmongo.KMongo

object Singleton {
    val client = KMongo.createClient("mongodb://avem:avem123avem456@localhost:27017")
//    val client = KMongo.createClient()
}