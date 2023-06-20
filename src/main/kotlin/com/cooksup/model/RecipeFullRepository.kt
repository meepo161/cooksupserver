package com.cooksup.model

import com.cooksup.utils.loadFromJson
import com.cooksup.utils.saveToJsonFile
import java.nio.file.Paths

object RecipeFullRepository {
    val recipes1 = mutableListOf<RecipeFull>()

    //    val recipes2 = mutableListOf<RecipeFull>()
//    val recipes3 = mutableListOf<RecipeFull>()
    val recipesFiltered = mutableSetOf<RecipeFull>()
    val recipesFilteredFromText = mutableListOf<RecipeFull>()

    fun add(recipe: RecipeFull) {
        recipes1.add(recipe)
    }

    fun addFilteredFromText(recipeFiltered: RecipeFull) {
        recipesFilteredFromText.add(recipeFiltered)
    }

    fun init() {
        try {
            recipes1.addAll(loadFromJson(Paths.get("recipe_full_0_30.json")))
//            recipes2.addAll(loadFromJson(Paths.get("recipe_full_30_60.json")))
//            recipes3.addAll(loadFromJson(Paths.get("recipe_full_60_90.json")))
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

//    fun getRecipesByPage(page: Int): List<Ingredient> {
//        return transaction {
//            IngredientsDB.selectAll().limit(20, offset = 20L * page).map {
//                Ingredient(
//                    it[IngredientsDB.name],
//                    it[IngredientsDB.group]
//                )
//            }
//        }
//    }

    fun initFilteredFromText(name: String): MutableList<RecipeFull> {
        try {
            recipesFilteredFromText.clear()
            recipes1.filter { recipe ->
                recipe.name.lowercase().contains(name.lowercase())
            }.forEach {
                println(it)
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

    fun generateVariations(ingredients: List<Ingredient>): List<List<Ingredient>> {
        val variations = mutableListOf<List<Ingredient>>()

        if (ingredients.isNotEmpty()) {
            for (i in 0 until ingredients.size) {
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
