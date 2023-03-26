package com.cooksup.database.entities

import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.IntIdTable

object RecipesDB : IntIdTable() {
    val name = varchar("name", 65535)
    val ingredients = varchar("ingredients", 65535)
}

class RecipeDB(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<RecipeDB>(RecipesDB)
    var name by RecipesDB.name
    var ingredients by RecipesDB.ingredients
    override fun toString(): String {
        return name
    }
}
