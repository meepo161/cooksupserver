package com.cooksup.model

import com.cooksup.database.entities.IngredientsDB
import com.cooksup.database.entities.RecipeDB
import com.cooksup.utils.loadFromJson
import com.cooksup.utils.saveToJsonFile
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction
import java.nio.file.Paths

object RecipeFullRepository {
    val recipes = mutableListOf<RecipeFull>()
    val recipesFiltered = mutableListOf<RecipeFull>()

    fun add(recipe: RecipeFull) {
        recipes.add(recipe)
    }

    fun addFiltered(recipeFiltered: RecipeFull) {
        recipesFiltered.add(recipeFiltered)
    }

    fun init() {
        try {
            recipes.addAll(loadFromJson(Paths.get("recipe_full.json")))
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun getRecipesByPage(page: Int): List<Ingredient> {
        return transaction {
            IngredientsDB.selectAll().limit(20, offset = 20L * page).map {
                Ingredient(
                    it[IngredientsDB.name],
                    it[IngredientsDB.color]
                )
            }
        }
    }

    fun initFiltered(list: List<Ingredient>): MutableList<RecipeFull> {
        try {
            recipesFiltered.clear()
            var i = 0
            recipes.filter { recipe ->
                recipe.ingredients.map(Ingredient::name).containsAll(list.map { it.name })
            }.forEach {
                i++
                addFiltered(it)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return recipesFiltered
    }

    fun save() {
        saveToJsonFile(
            Paths.get("recipe_full.json"),
            recipes
        )
    }

    fun saveFiltered() {
        saveToJsonFile(
            Paths.get("recipe_filtered.json"),
            recipesFiltered
        )
    }
}
