package com.cooksup.model

import com.cooksup.database.entities.IngredientsDB
import com.cooksup.utils.loadFromJson
import com.cooksup.utils.saveToJsonFile
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction
import java.nio.file.Paths

object RecipesRepository {
    val recipes = mutableListOf<Recipes>()

    fun add(recipe: Recipes) {
        recipes.add(recipe)
    }

    fun init() {
        try {
            recipes.addAll(loadFromJson(Paths.get("recipes.json")))
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun save() {
        saveToJsonFile(
            Paths.get("recipes.json"),
            recipes
        )
    }
}
