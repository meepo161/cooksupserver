package com.cooksup.model

import com.cooksup.utils.loadFromJson
import com.cooksup.utils.saveToJsonFile
import java.nio.file.Paths

object RecipeRepository {
    val recipes1 = mutableListOf<RecipeFull>()
    private val recipesFiltered = mutableSetOf<RecipeFull>()
    private val recipesFilteredFromText = mutableListOf<RecipeFull>()

    fun add(recipe: RecipeFull) {
        recipes1.add(recipe)
    }

    private fun addFilteredFromText(recipeFiltered: RecipeFull) {
        recipesFilteredFromText.add(recipeFiltered)
    }

    fun init() {
        try {
            recipes1.addAll(loadFromJson(Paths.get("recipe_full_0_30.json")))
            recipes1.addAll(loadFromJson(Paths.get("recipe_full_30_60.json")))
            recipes1.addAll(loadFromJson(Paths.get("recipe_full_60_90.json")))
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun initFilteredFromText(request: String): MutableList<RecipeFull> {
        try {
            recipesFilteredFromText.clear()
            recipes1.filter { recipe ->
                val nameRequest = request.lowercase().split(' ').toSet()
                val nameRecipe = recipe.name.lowercase().split(' ').toSet()
                if (nameRequest.size == 1) {
                    recipe.name.trim().lowercase().contains(request.removeRange(3, request.length).trim().lowercase())
                } else {
                    (nameRequest subtract nameRecipe).isEmpty()
                }
            }.forEach {
                addFilteredFromText(it)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return recipesFilteredFromText
    }

    fun initFiltered(list: List<Ingredient>): MutableList<RecipeFull> {
        println(list)
        try {
            recipesFiltered.clear()
            val variations = generateVariations(list)
            var recipesCount = 0
            variations.forEach { variation ->
                recipes1.filter { recipe ->
                    recipe.ingredients.map(Ingredient::name).containsAll(variation.map { it.name })
                }.forEach {
                    if (recipesCount++ < 400) {
                        recipesFiltered.add(it)
                        println(it.name)
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return recipesFiltered.toMutableList()
    }

    fun save() {
        saveToJsonFile(
            Paths.get("recipe_full.json"),
            recipes1
        )
    }

    fun saveFiltered() {
        saveToJsonFile(
            Paths.get("recipe_filtered.json"),
            recipesFiltered
        )
    }

    private fun generateVariations(ingredients: List<Ingredient>): List<List<Ingredient>> {
        val variations = mutableListOf<List<Ingredient>>()
        if (ingredients.isNotEmpty()) {
            for (i in ingredients.indices) {
                val variation = mutableListOf<Ingredient>()
                for (j in i until (i + ingredients.size)) {
                    val index = j % ingredients.size
                    variation.add(ingredients[index])
                    variations.add(variation.toList())
                }
            }
        }

        return variations.sortedBy { it.size }.reversed()
    }
}
