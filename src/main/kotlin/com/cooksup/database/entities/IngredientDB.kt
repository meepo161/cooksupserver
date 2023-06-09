package com.cooksup.database.entities

import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.IntIdTable

object IngredientsDB : IntIdTable() {
    val name = varchar("name", 65535)
    val group = varchar("group", 65535)
}

class IngredientDB(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<IngredientDB>(IngredientsDB)
    var name by IngredientsDB.name
    var group by IngredientsDB.group
    override fun toString(): String {
        return name
    }
}
