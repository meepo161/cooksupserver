package com.cooksup.database

//import com.cooksup.database.entities.IngredientsDB
//import com.cooksup.database.entities.RecipesDB
//import org.jetbrains.exposed.sql.Database
//import org.jetbrains.exposed.sql.SchemaUtils
//import org.jetbrains.exposed.sql.transactions.TransactionManager
//import org.jetbrains.exposed.sql.transactions.transaction
//import java.sql.Connection
//
//fun initDB() {
//    val dbUrl = "jdbc:postgresql://0.0.0.0:5432/cooksup"
//    val dbUser = "avem"
//    val dbPass = "avem"
//    Database.connect(dbUrl, driver = "org.postgresql.Driver", user = dbUser, password = dbPass)
//    TransactionManager.manager.defaultIsolationLevel = Connection.TRANSACTION_SERIALIZABLE
//
////    transaction {
////        SchemaUtils.create(RecipesDB, IngredientsDB)
////    }
//
//}
