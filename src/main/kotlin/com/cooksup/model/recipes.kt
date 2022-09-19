package com.cooksup.model

val recipes = listOf(
    Recipe(
        quantityIngredients = listOf(
            Measure(ingredient = getIngredientByName("Картофель"), unit = "г", amount = 84.0),
            Measure(ingredient = getIngredientByName("Колбаса варёная"), unit = "г", amount = 42.0),
            Measure(ingredient = getIngredientByName("Яйцо куриное"), unit = "шт.", amount = 0.5),
            Measure(ingredient = getIngredientByName("Сметана"), toTaste = true),
            Measure(ingredient = getIngredientByName("Огурец"), unit = "шт.", amount = 0.5),
            Measure(ingredient = getIngredientByName("Соль"), toTaste = true),
            Measure(ingredient = getIngredientByName("Квас хлебный"), unit = "л", amount = 0.35),
            Measure(ingredient = getIngredientByName("Укроп"), unit = "г", amount = 8.0),
        ),
        instructions = listOf(
            "Картофель очистить и отварить до готовности. Остудить.",
            "Яйца отварить, остудить и почистить.",
            "Огурцы, яйца, картофель и колбасу нарезать кубиками. Укроп мелко порубить. Смешать все ингредиенты в салатнике.",
            "Посолить, поперчить. Выложить в тарелки.",
            "Залить холодным квасом, посыпать зеленью. Подавать охлажденной со сметаной.",
        )
    )
)
