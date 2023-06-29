package com.cooksup.model

import com.cooksup.utils.loadFromJson
import com.cooksup.utils.saveToJsonFile
import java.nio.file.Paths

object RecipeRepository {
    val recipes1 = mutableListOf<Recipe>()
    private val recipesFiltered = mutableSetOf<Recipe>()
    private val recipesFilteredFromText = mutableListOf<Recipe>()

    fun add(recipe: Recipe) {
        recipes1.add(recipe)
    }

    private fun addFilteredFromText(recipeFiltered: Recipe) {
        recipesFilteredFromText.add(recipeFiltered)
    }

    fun init() {
        try {
            recipes1.addAll(loadFromJson(Paths.get("recipe_full_new.json")))
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun initFilteredFromText(request: String): MutableList<Recipe> {
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

//    fun initFiltered(list: List<Ingredient>): MutableList<Recipe> {
//        println(list)
//        try {
//            recipesFiltered.clear()
//            val variations = generateVariations(list)
//            var recipesCount = 0
//            variations.forEach { variation ->
//                recipes1.filter { recipe ->
//                    recipe.ingredients.map(Ingredient::name).containsAll(variation.map { it.name })
//                }.forEach {
//                    if (recipesCount++ < 400) {
//                        recipesFiltered.add(it)
//                        println(it.name)
//                    }
//                }
//            }
//        } catch (e: Exception) {
//            e.printStackTrace()
//        }
//        return recipesFiltered.toMutableList()
//    }

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
}
