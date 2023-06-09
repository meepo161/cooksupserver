package com.cooksup.model

import com.cooksup.database.entities.IngredientsDB
import com.cooksup.utils.loadFromJson
import com.cooksup.utils.saveToJsonFile
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction
import java.nio.file.Paths

object IngredientRepository {
    val ingredients = mutableListOf<Ingredient>()

    fun add(ingredient: Ingredient) {
        ingredients.add(ingredient)
    }

    fun init() {
        try {
            ingredients.addAll(loadFromJson(Paths.get("ingredients_group.json")))
        } catch (_: Exception) {
        }
    }

    fun save() {
        saveToJsonFile(
            Paths.get("ingredients_group.json"),
            ingredients
        )
    }

    fun getIngredientsByPage(page: Int): List<Ingredient> {
        return transaction {
            IngredientsDB.selectAll().limit(20, offset = 20L * page).map {
                Ingredient(
                    it[IngredientsDB.name],
                    it[IngredientsDB.group]
                )
            }
        }
    }
}
