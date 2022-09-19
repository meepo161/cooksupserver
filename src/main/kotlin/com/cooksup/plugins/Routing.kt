package com.cooksup.plugins

import com.cooksup.model.Ingredient

import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respond(
                ingredients()
            )
        }
    }
}

fun ingredients() = listOf(
    Ingredient("Абрикос"),
    Ingredient("Авокадо"),
    Ingredient("Агар-агар"),
    Ingredient("Аджика"),
    Ingredient("Адинамода"),
    Ingredient("Айва"),
    Ingredient("Айран"),
    Ingredient("Алкоголь"),
    Ingredient("Алоэ"),
    Ingredient("Алыча"),
    Ingredient("Аммоний пищевой"),
    Ingredient("Ананас"),
    Ingredient("Ангостура"),
    Ingredient("Анис"),
    Ingredient("Анчоусы"),
    Ingredient("Апельсин"),
    Ingredient("Арахис"),
    Ingredient("Арбуз"),
    Ingredient("Ароматизатор"),
    Ingredient("Артишок"),
    Ingredient("Асафетида"),
    Ingredient("Аспирин"),
    Ingredient("Ассорти мясное"),
    Ingredient("Ассорти овощное"),
    Ingredient("Ассорти орехово-фруктовое"),
    Ingredient("Ассорти фруктовое"),
    Ingredient("Ассорти ягодное"),
    Ingredient("Ацидофилин"),
    Ingredient("Багет"),
    Ingredient("Бадьян"),
    Ingredient("Базилик"),
    Ingredient("Баклажан"),
    Ingredient("Балык"),
    Ingredient("Бальзам"),
    Ingredient("Бальзамик"),
    Ingredient("Бамия"),
    Ingredient("Банан"),
    Ingredient("Барабулька"),
    Ingredient("Баранина"),
    Ingredient("Баранка"),
    Ingredient("Барбарис"),
    Ingredient("Барсук"),
    Ingredient("Бастурма"),
    Ingredient("Батат"),
    Ingredient("Батон"),
    Ingredient("Батончик шоколадный"),
    Ingredient("Бедро куриное"),
    Ingredient("Безе"),
    Ingredient("Бекмес"),
    Ingredient("Бекон"),
    Ingredient("Белок яичный"),
    Ingredient("Белорыбица"),
    Ingredient("Бергамот"),
    Ingredient("Бешамель"),
    Ingredient("Биодобавка"),
    Ingredient("Бисквит"),
    Ingredient("Блин"),
    Ingredient("Бобы"),
    Ingredient("Бобы тонка"),
    Ingredient("Ботва"),
    Ingredient("Боярышник"),
    Ingredient("Бренди"),
    Ingredient("Брокколетти"),
    Ingredient("Брокколи"),
    Ingredient("Брусника"),
    Ingredient("Брынза"),
    Ingredient("Брюква"),
    Ingredient("Бублик"),
    Ingredient("Буженина"),
    Ingredient("Булгур"),
    Ingredient("Булка"),
    Ingredient("Булочка"),
    Ingredient("Бульон"),
    Ingredient("Валериана"),
    Ingredient("Ванилин"),
    Ingredient("Ваниль"),
    Ingredient("Ванильная эссенция"),
    Ingredient("Ванильный сахар"),
    Ingredient("Ванильный стручок"),
    Ingredient("Варенье"),
    Ingredient("Васаби"),
    Ingredient("Вафельные трубочки"),
    Ingredient("Вафли"),
    Ingredient("Вермишель"),
    Ingredient("Вермут"),
    Ingredient("Ветчина"),
    Ingredient("Вешенки"),
    Ingredient("Взбитые сливки"),
    Ingredient("Вино белое полусладкое"),
    Ingredient("Вино белое полусухое"),
    Ingredient("Вино белое сладкое"),
    Ingredient("Вино белое сухое"),
    Ingredient("Вино десертное"),
    Ingredient("Вино игристое сухое"),
    Ingredient("Вино красное полусладкое"),
    Ingredient("Вино красное полусухое"),
    Ingredient("Вино красное сладкое"),
    Ingredient("Вино красное сухое"),
    Ingredient("Вино крепленое"),
    Ingredient("Вино рисовое"),
    Ingredient("Вино розовое полусухое"),
    Ingredient("Вино розовое сухое"),
    Ingredient("Виноград"),
    Ingredient("Виски"),
    Ingredient("Вишня"),
    Ingredient("Вода"),
    Ingredient("Вода газированная"),
    Ingredient("Вода минеральная"),
    Ingredient("Вода розовая"),
    Ingredient("Вода цветочная апельсиновая"),
    Ingredient("Водка"),
    Ingredient("Водоросли"),
    Ingredient("Вымя"),
    Ingredient("Галета"),
    Ingredient("Гарам масала"),
    Ingredient("Гвоздика"),
    Ingredient("Глазурь"),
    Ingredient("Глицерин пищевой"),
    Ingredient("Глутамат натрия"),
    Ingredient("Глюкоза"),
    Ingredient("Глютен"),
    Ingredient("Говядина"),
    Ingredient("Голень куриная"),
    Ingredient("Голубика"),
    Ingredient("Горбуша"),
    Ingredient("Горох"),
    Ingredient("Горошек зеленый"),
    Ingredient("Горчица"),
    Ingredient("Готовая начинка"),
    Ingredient("Готовое блюдо"),
    Ingredient("Гранат"),
    Ingredient("Гранола"),
    Ingredient("Гребешок"),
    Ingredient("Грейпфрут"),
    Ingredient("Гренки"),
    Ingredient("Гриб морской"),
    Ingredient("Гриб чайный"),
    Ingredient("Грибы"),
    Ingredient("Грибы консервированные"),
    Ingredient("Грудинка"),
    Ingredient("Грудка"),
    Ingredient("Грудка индюшки"),
    Ingredient("Грудка куриная"),
    Ingredient("Грудка утиная"),
    Ingredient("Груша"),
    Ingredient("Гуми"),
    Ingredient("Гусь"),
    Ingredient("Дайкон"),
    Ingredient("Детское питание"),
    Ingredient("Джем"),
    Ingredient("Джем абрикосовый"),
    Ingredient("Джем апельсиновый"),
    Ingredient("Джусай"),
    Ingredient("Дичь"),
    Ingredient("Дорадо"),
    Ingredient("Драже"),
    Ingredient("Дрожжи"),
    Ingredient("Душица"),
    Ingredient("Дыня"),
    Ingredient("Ежевика"),
    Ingredient("Ерш"),
    Ingredient("Желатин"),
    Ingredient("Желе"),
    Ingredient("Желирующая смесь"),
    Ingredient("Желток яичный"),
    Ingredient("Желудки куриные"),
    Ingredient("Желудок"),
    Ingredient("Желудок индюшачий"),
    Ingredient("Желудь"),
    Ingredient("Жидкий дым"),
    Ingredient("Жимолость"),
    Ingredient("Жир"),
    Ingredient("Жмых овощной"),
    Ingredient("Жмых фруктовый"),
    Ingredient("Загуститель для сливок"),
    Ingredient("Зайчатина"),
    Ingredient("Закваска"),
    Ingredient("Заменитель сахара"),
    Ingredient("Заменитель сухого молока"),
    Ingredient("Заправка"),
    Ingredient("Зверобой"),
    Ingredient("Зелень"),
    Ingredient("Земляника"),
    Ingredient("Зерно"),
    Ingredient("Зефир"),
    Ingredient("Зира"),
    Ingredient("Зубатка"),
    Ingredient("Иваси"),
    Ingredient("Изюм"),
    Ingredient("Икра красная"),
    Ingredient("Икра минтая"),
    Ingredient("Икра овощная"),
    Ingredient("Икра рыбная"),
    Ingredient("Икра черная"),
    Ingredient("Имбирь"),
    Ingredient("Индейка"),
    Ingredient("Инжир"),
    Ingredient("Ирга"),
    Ingredient("Ириски"),
    Ingredient("Йогурт"),
    Ingredient("Йод"),
    Ingredient("Йошта"),
    Ingredient("Кабачок"),
    Ingredient("Какао сгущенное"),
    Ingredient("Какао тертое"),
    Ingredient("Какао-бобы"),
    Ingredient("Какао-масло"),
    Ingredient("Какао-напиток"),
    Ingredient("Какао-порошок"),
    Ingredient("Кактус"),
    Ingredient("Калина"),
    Ingredient("Калинджи"),
    Ingredient("Кальвадос"),
    Ingredient("Кальмар"),
    Ingredient("Камбала"),
    Ingredient("Кампари"),
    Ingredient("Каннеллони"),
    Ingredient("Каперсы"),
    Ingredient("Капуста белокочанная"),
    Ingredient("Капуста брюссельская"),
    Ingredient("Капуста квашеная"),
    Ingredient("Капуста китайская"),
    Ingredient("Капуста кольраби"),
    Ingredient("Капуста краснокочанная"),
    Ingredient("Капуста кудрявая"),
    Ingredient("Капуста морская"),
    Ingredient("Капуста пекинская"),
    Ingredient("Капуста савойская"),
    Ingredient("Капуста цветная"),
    Ingredient("Капуста японская"),
    Ingredient("Капучино"),
    Ingredient("Каракатица"),
    Ingredient("Карамбола"),
    Ingredient("Карамель"),
    Ingredient("Карась"),
    Ingredient("Карбонад"),
    Ingredient("Кардамон"),
    Ingredient("Каркаде"),
    Ingredient("Карп"),
    Ingredient("Карри"),
    Ingredient("Картофель"),
    Ingredient("Катык"),
    Ingredient("Каша"),
    Ingredient("Каштан"),
    Ingredient("Квас"),
    Ingredient("Кекс ванильный"),
    Ingredient("Кета"),
    Ingredient("Кетчуп"),
    Ingredient("Кефаль"),
    Ingredient("Кефир"),
    Ingredient("Киви"),
    Ingredient("Кижуч"),
    Ingredient("Кизил"),
    Ingredient("Килька"),
    Ingredient("Кинза"),
    Ingredient("Киноа"),
    Ingredient("Кисель"),
    Ingredient("Кислота аскорбиновая"),
    Ingredient("Кислота лимонная"),
    Ingredient("Кишки"),
    Ingredient("Клементин"),
    Ingredient("Клетчатка"),
    Ingredient("Клубника"),
    Ingredient("Клюква"),
    Ingredient("Кляр"),
    Ingredient("Кожа куриная"),
    Ingredient("Кожа рыбная"),
    Ingredient("Кокос"),
    Ingredient("Коктейль морской"),
    Ingredient("Кола"),
    Ingredient("Колбаса"),
    Ingredient("Колбаски"),
    Ingredient("Компот"),
    Ingredient("Конгрио"),
    Ingredient("Кондитерское изделие"),
    Ingredient("Конкилье"),
    Ingredient("Консервы рыбные"),
    Ingredient("Конфеты"),
    Ingredient("Конфитюр"),
    Ingredient("Концентрат"),
    Ingredient("Коньяк"),
    Ingredient("Кора дуба"),
    Ingredient("Корейка"),
    Ingredient("Коренья"),
    Ingredient("Корж"),
    Ingredient("Кориандр"),
    Ingredient("Корица"),
    Ingredient("Корнишоны"),
    Ingredient("Корюшка"),
    Ingredient("Кости"),
    Ingredient("Котлета"),
    Ingredient("Кофе натуральный"),
    Ingredient("Кофе растворимый"),
    Ingredient("Краб"),
    Ingredient("Крабовое мясо"),
    Ingredient("Крабовые палочки"),
    Ingredient("Крапива"),
    Ingredient("Краситель пищевой"),
    Ingredient("Крахмал"),
    Ingredient("Крахмал картофельный"),
    Ingredient("Крахмал кукурузный"),
    Ingredient("Креветки"),
    Ingredient("Крекер"),
    Ingredient("Крем"),
    Ingredient("Крем фреш"),
    Ingredient("Кресс-салат"),
    Ingredient("Кролик"),
    Ingredient("Крошка вафельная"),
    Ingredient("Крошка хлебная"),
    Ingredient("Круассан"),
    Ingredient("Крупа гречневая"),
    Ingredient("Крупа кукурузная"),
    Ingredient("Крупа манная"),
    Ingredient("Крупа овсяная"),
    Ingredient("Крупа перловая"),
    Ingredient("Крупа пшеничная"),
    Ingredient("Крупа ячневая"),
    Ingredient("Крыжовник"),
    Ingredient("Крылья куриные"),
    Ingredient("Кубик бульонный"),
    Ingredient("Кукуруза"),
    Ingredient("Кукурузные палочки"),
    Ingredient("Кумин"),
    Ingredient("Кумкват"),
    Ingredient("Кунжут"),
    Ingredient("Курага"),
    Ingredient("Курица"),
    Ingredient("Куркума"),
    Ingredient("Кус-кус"),
    Ingredient("Кэроб"),
    Ingredient("Лаванда"),
    Ingredient("Лаваш"),
    Ingredient("Лазанья"),
    Ingredient("Лайм"),
    Ingredient("Лангуст"),
    Ingredient("Лапша"),
    Ingredient("Легкое"),
    Ingredient("Легкое говяжье"),
    Ingredient("Лед"),
    Ingredient("Лен"),
    Ingredient("Лепестки"),
    Ingredient("Лепешка"),
    Ingredient("Лечо"),
    Ingredient("Ливер"),
    Ingredient("Ликер"),
    Ingredient("Лимон"),
    Ingredient("Лимонад"),
    Ingredient("Лимонная трава"),
    Ingredient("Лимонник"),
    Ingredient("Липаза"),
    Ingredient("Лист виноградный"),
    Ingredient("Лист вишневый"),
    Ingredient("Лист древесный"),
    Ingredient("Лист капустный"),
    Ingredient("Лист лавровый"),
    Ingredient("Лист малиновый"),
    Ingredient("Лист смородиновый"),
    Ingredient("Лист цветочный"),
    Ingredient("Листья салата"),
    Ingredient("Личи"),
    Ingredient("Лобстер"),
    Ingredient("Лосось"),
    Ingredient("Лук белый"),
    Ingredient("Лук зеленый"),
    Ingredient("Лук красный"),
    Ingredient("Лук репчатый"),
    Ingredient("Лук-порей"),
    Ingredient("Лук-шалот"),
    Ingredient("Любисток"),
    Ingredient("Лягушачьи лапки"),
    Ingredient("Майонез"),
    Ingredient("Майоран"),
    Ingredient("Мак"),
    Ingredient("Макаронные изделия"),
    Ingredient("Малина"),
    Ingredient("Манго"),
    Ingredient("Мангостин"),
    Ingredient("Мандарин"),
    Ingredient("Маракуйя"),
    Ingredient("Маргарин"),
    Ingredient("Маринад"),
    Ingredient("Мармелад"),
    Ingredient("Мартини"),
    Ingredient("Марципан"),
    Ingredient("Маршмеллоу"),
    Ingredient("Маскарпоне"),
    Ingredient("Маслины"),
    Ingredient("Масло арахисовое"),
    Ingredient("Масло виноградной косточки"),
    Ingredient("Масло горчичное"),
    Ingredient("Масло грецкого ореха"),
    Ingredient("Масло кедрового ореха"),
    Ingredient("Масло кокосовое"),
    Ingredient("Масло кукурузное"),
    Ingredient("Масло кунжутное"),
    Ingredient("Масло льняное"),
    Ingredient("Масло миндальное"),
    Ingredient("Масло мятное"),
    Ingredient("Масло оливковое"),
    Ingredient("Масло пальмовое"),
    Ingredient("Масло подсолнечное"),
    Ingredient("Масло рапсовое"),
    Ingredient("Масло растительное"),
    Ingredient("Масло сливочное"),
    Ingredient("Масло соевое"),
    Ingredient("Масло топленое"),
    Ingredient("Масло тыквенное"),
    Ingredient("Масло хлопковое"),
    Ingredient("Масло чесночное"),
    Ingredient("Масло шоколадное"),
    Ingredient("Маслята"),
    Ingredient("Мастика"),
    Ingredient("Матча"),
    Ingredient("Маца"),
    Ingredient("Мацони"),
    Ingredient("Маш"),
    Ingredient("Мед"),
    Ingredient("Меланж"),
    Ingredient("Мелисса"),
    Ingredient("Мидии"),
    Ingredient("Миндаль"),
    Ingredient("Минеола"),
    Ingredient("Минтай"),
    Ingredient("Мисо-паста"),
    Ingredient("Можжевельник"),
    Ingredient("Мозги говяжьи"),
    Ingredient("Мойва"),
    Ingredient("Моллюски"),
    Ingredient("Молоки рыбные"),
    Ingredient("Молоко"),
    Ingredient("Молоко кедровое"),
    Ingredient("Молоко кокосовое"),
    Ingredient("Молоко концентрированное"),
    Ingredient("Молоко миндальное"),
    Ingredient("Молоко сгущенное"),
    Ingredient("Молоко соевое"),
    Ingredient("Молоко сухое"),
    Ingredient("Молоко топленое"),
    Ingredient("Момордика"),
    Ingredient("Морепродукты"),
    Ingredient("Морковь"),
    Ingredient("Мороженое"),
    Ingredient("Морошка"),
    Ingredient("Морской язык"),
    Ingredient("Моцарелла"),
    Ingredient("Мука амарантовая"),
    Ingredient("Мука блинная"),
    Ingredient("Мука гороховая"),
    Ingredient("Мука гречневая"),
    Ingredient("Мука кокосовая"),
    Ingredient("Мука конопляная"),
    Ingredient("Мука кукурузная"),
    Ingredient("Мука кунжутная"),
    Ingredient("Мука льняная"),
    Ingredient("Мука миндальная"),
    Ingredient("Мука нутовая"),
    Ingredient("Мука овсяная"),
    Ingredient("Мука полбяная"),
    Ingredient("Мука пшеничная"),
    Ingredient("Мука ржаная"),
    Ingredient("Мука рисовая"),
    Ingredient("Мука соевая"),
    Ingredient("Мука специальная"),
    Ingredient("Мука цельнозерновая"),
    Ingredient("Мука черемуховая"),
    Ingredient("Мука ячменная"),
    Ingredient("Мусс"),
    Ingredient("Мусс яблочный"),
    Ingredient("Мюсли"),
    Ingredient("Мясо"),
    Ingredient("Мясо криля"),
    Ingredient("Мясо соевое"),
    Ingredient("Мята"),
    Ingredient("Навага"),
    Ingredient("Налим"),
    Ingredient("Напиток"),
    Ingredient("Напиток кисломолочный"),
    Ingredient("Напиток молочный"),
    Ingredient("Напиток овсяный"),
    Ingredient("Наршараб"),
    Ingredient("Нектар"),
    Ingredient("Нектарин"),
    Ingredient("Нога"),
    Ingredient("Нога баранья"),
    Ingredient("Нори"),
    Ingredient("Нуга"),
    Ingredient("Нут"),
    Ingredient("Нутелла"),
    Ingredient("Облепиха"),
    Ingredient("Овес"),
    Ingredient("Овощи"),
    Ingredient("Огурец"),
    Ingredient("Огурец маринованный"),
    Ingredient("Огурец соленый"),
    Ingredient("Окара"),
    Ingredient("Окорок"),
    Ingredient("Окорочок куриный"),
    Ingredient("Окунь"),
    Ingredient("Окунь морской"),
    Ingredient("Оладьи"),
    Ingredient("Оленина"),
    Ingredient("Оливки зеленые"),
    Ingredient("Оливки черные"),
    Ingredient("Ольховый дым"),
    Ingredient("Опара"),
    Ingredient("Опята"),
    Ingredient("Орегано"),
    Ingredient("Орех макадамия"),
    Ingredient("Орех мускатный"),
    Ingredient("Орехи"),
    Ingredient("Орехи бразильские"),
    Ingredient("Орехи грецкие"),
    Ingredient("Орехи кедровые"),
    Ingredient("Орехи кешью"),
    Ingredient("Орехи лесные"),
    Ingredient("Орехи пекан"),
    Ingredient("Осьминог"),
    Ingredient("Отвар"),
    Ingredient("Отруби"),
    Ingredient("Пажитник"),
    Ingredient("Палтус"),
    Ingredient("Пангасиус"),
    Ingredient("Панир"),
    Ingredient("Папайя"),
    Ingredient("Папоротник"),
    Ingredient("Паприка копченая"),
    Ingredient("Паприка сладкая"),
    Ingredient("Пармезан"),
    Ingredient("Паста"),
    Ingredient("Паста арахисовая"),
    Ingredient("Паста карри"),
    Ingredient("Паста кунжутная"),
    Ingredient("Паста ореховая"),
    Ingredient("Паста перечная"),
    Ingredient("Паста сахарная"),
    Ingredient("Паста тахинная"),
    Ingredient("Паста чесночно-имбирная"),
    Ingredient("Паста шоколадная"),
    Ingredient("Пастернак"),
    Ingredient("Пастила"),
    Ingredient("Патиссон"),
    Ingredient("Патока"),
    Ingredient("Пахта"),
    Ingredient("Паштет"),
    Ingredient("Пектин"),
    Ingredient("Пеленгас"),
    Ingredient("Пельмени"),
    Ingredient("Пенне"),
    Ingredient("Перепел"),
    Ingredient("Перец белый"),
    Ingredient("Перец болгарский"),
    Ingredient("Перец душистый"),
    Ingredient("Перец зеленый"),
    Ingredient("Перец кайен"),
    Ingredient("Перец красный жгучий"),
    Ingredient("Перец лимонный"),
    Ingredient("Перец пепперони"),
    Ingredient("Перец розовый"),
    Ingredient("Перец сладкий"),
    Ingredient("Перец сладкий желтый"),
    Ingredient("Перец сладкий зеленый"),
    Ingredient("Перец сладкий красный"),
    Ingredient("Перец сычуаньский"),
    Ingredient("Перец черный"),
    Ingredient("Перец чили"),
    Ingredient("Перец ямайский"),
    Ingredient("Персик"),
    Ingredient("Песто"),
    Ingredient("Петрушка"),
    Ingredient("Печень баранья"),
    Ingredient("Печень говяжья"),
    Ingredient("Печень гусиная"),
    Ingredient("Печень индюшиная"),
    Ingredient("Печень кролика"),
    Ingredient("Печень куриная"),
    Ingredient("Печень минтая"),
    Ingredient("Печень свиная"),
    Ingredient("Печень трески"),
    Ingredient("Печень утиная"),
    Ingredient("Печенье"),
    Ingredient("Пиво нефильтрованное"),
    Ingredient("Пиво светлое"),
    Ingredient("Пиво темное"),
    Ingredient("Пита"),
    Ingredient("Питахайя"),
    Ingredient("Пищевая добавка"),
    Ingredient("Побеги"),
    Ingredient("Повидло"),
    Ingredient("Полба"),
    Ingredient("Полуфабрикаты"),
    Ingredient("Помело"),
    Ingredient("Померанец"),
    Ingredient("Помидор"),
    Ingredient("Помидор маринованный"),
    Ingredient("Помидор соленый"),
    Ingredient("Помидоры черри"),
    Ingredient("Попкорн"),
    Ingredient("Порошок горчичный"),
    Ingredient("Порошок грибной"),
    Ingredient("Порошок луковый"),
    Ingredient("Порошок пекарский"),
    Ingredient("Порошок томатный"),
    Ingredient("Порошок чесночный"),
    Ingredient("Портулак"),
    Ingredient("Посыпка кондитерская"),
    Ingredient("Потроха"),
    Ingredient("Почки"),
    Ingredient("Пралине"),
    Ingredient("Пресервы"),
    Ingredient("Приправа"),
    Ingredient("Простокваша"),
    Ingredient("Профитроли"),
    Ingredient("Пряник"),
    Ingredient("Пряности"),
    Ingredient("Псиллиум"),
    Ingredient("Пудинг"),
    Ingredient("Пудинг ванильный"),
    Ingredient("Пудинг карамельный"),
    Ingredient("Путассу"),
    Ingredient("Пшеница"),
    Ingredient("Пшено"),
    Ingredient("Пыльца цветочная"),
    Ingredient("Пюре картофельное"),
    Ingredient("Пюре овощное"),
    Ingredient("Пюре томатное"),
    Ingredient("Пюре фруктовое"),
    Ingredient("Пюре ягодное"),
    Ingredient("Равиоли"),
    Ingredient("Разрыхлитель теста"),
    Ingredient("Раки"),
    Ingredient("Раковые шейки"),
    Ingredient("Ракушки"),
    Ingredient("Рамбутан"),
    Ingredient("Рапаны"),
    Ingredient("Рассол"),
    Ingredient("Рахат-лукум"),
    Ingredient("Ребра"),
    Ingredient("Ребра говяжьи"),
    Ingredient("Ребра свиные"),
    Ingredient("Ревень"),
    Ingredient("Редис"),
    Ingredient("Редька"),
    Ingredient("Репа"),
    Ingredient("Рикотта"),
    Ingredient("Рис"),
    Ingredient("Рис воздушный"),
    Ingredient("Рис дикий"),
    Ingredient("Рис коричневый"),
    Ingredient("Рисовая бумага"),
    Ingredient("Рожки"),
    Ingredient("Розмарин"),
    Ingredient("Ром"),
    Ingredient("Романо"),
    Ingredient("Ростки"),
    Ingredient("Рубец говяжий"),
    Ingredient("Руккола"),
    Ingredient("Рулет"),
    Ingredient("Рулька"),
    Ingredient("Рыба"),
    Ingredient("Рябина красная"),
    Ingredient("Рябина черноплодная"),
    Ingredient("Рябчик"),
    Ingredient("Ряженка"),
    Ingredient("Саго"),
    Ingredient("Сайда"),
    Ingredient("Сайра"),
    Ingredient("Саке"),
    Ingredient("Салака"),
    Ingredient("Сало"),
    Ingredient("Салями"),
    Ingredient("Сарделька"),
    Ingredient("Сахар"),
    Ingredient("Сахар гранулированный"),
    Ingredient("Сахар коричневый"),
    Ingredient("Сахар кусковой"),
    Ingredient("Сахар тростниковый"),
    Ingredient("Сахар-рафинад"),
    Ingredient("Сахарная пудра"),
    Ingredient("Свекла"),
    Ingredient("Свекла листовая"),
    Ingredient("Свинина"),
    Ingredient("Свити"),
    Ingredient("Сельдерей корневой"),
    Ingredient("Сельдерей листовой"),
    Ingredient("Сельдерей черешковый"),
    Ingredient("Сельдь"),
    Ingredient("Семга"),
    Ingredient("Семена"),
    Ingredient("Семена горчицы"),
    Ingredient("Семена льна"),
    Ingredient("Семена укропа"),
    Ingredient("Семена чиа"),
    Ingredient("Семечки"),
    Ingredient("Семечки подсолнуха"),
    Ingredient("Семечки тыквенные"),
    Ingredient("Семолина"),
    Ingredient("Сердечки куриные"),
    Ingredient("Сердце"),
    Ingredient("Сетка жировая"),
    Ingredient("Сибас"),
    Ingredient("Сидр"),
    Ingredient("Сироп"),
    Ingredient("Сироп абрикосовый"),
    Ingredient("Сироп алкогольный"),
    Ingredient("Сироп ананасовый"),
    Ingredient("Сироп ванильный"),
    Ingredient("Сироп глюкозы"),
    Ingredient("Сироп инвертный"),
    Ingredient("Сироп кленовый"),
    Ingredient("Сироп клубничный"),
    Ingredient("Сироп клюквенный"),
    Ingredient("Сироп кокосовый"),
    Ingredient("Сироп кукурузный"),
    Ingredient("Сироп лимонный"),
    Ingredient("Сироп миндальный"),
    Ingredient("Сироп мятный"),
    Ingredient("Сироп персиковый"),
    Ingredient("Сироп сахарный"),
    Ingredient("Сироп смородиновый"),
    Ingredient("Сироп фруктовый"),
    Ingredient("Сироп черничный"),
    Ingredient("Сироп шоколадный"),
    Ingredient("Сироп ягодный"),
    Ingredient("Скумбрия"),
    Ingredient("Слива"),
    Ingredient("Сливки"),
    Ingredient("Сливки кокосовые"),
    Ingredient("Смалец"),
    Ingredient("Смесь молочная"),
    Ingredient("Смесь перцев"),
    Ingredient("Смесь порошковая"),
    Ingredient("Смесь специй"),
    Ingredient("Сметана"),
    Ingredient("Смородина белая"),
    Ingredient("Смородина красная"),
    Ingredient("Смородина черная"),
    Ingredient("Снеки"),
    Ingredient("Соба"),
    Ingredient("Сода"),
    Ingredient("Сода гашеная уксусом"),
    Ingredient("Соевые проростки"),
    Ingredient("Соевый соус"),
    Ingredient("Сок"),
    Ingredient("Сок апельсиновый"),
    Ingredient("Сок березовый"),
    Ingredient("Сок гранатовый"),
    Ingredient("Сок лимонный"),
    Ingredient("Сок мандариновый"),
    Ingredient("Сок морковный"),
    Ingredient("Сок свежевыжатый"),
    Ingredient("Сок томатный"),
    Ingredient("Сок яблочный"),
    Ingredient("Сок ягодный"),
    Ingredient("Солод"),
    Ingredient("Соломка"),
    Ingredient("Соль"),
    Ingredient("Соль нитритная"),
    Ingredient("Сосиска"),
    Ingredient("Соус"),
    Ingredient("Соус майонезный"),
    Ingredient("Соус томатный"),
    Ingredient("Соус устричный"),
    Ingredient("Соус фруктовый"),
    Ingredient("Соус ягодный"),
    Ingredient("Соус-маринад"),
    Ingredient("Соя"),
    Ingredient("Спагетти"),
    Ingredient("Спаржа"),
    Ingredient("Спаржа соевая"),
    Ingredient("Специи"),
    Ingredient("Спирт"),
    Ingredient("Спред"),
    Ingredient("Ставрида"),
    Ingredient("Стевия"),
    Ingredient("Стрелки чесночные"),
    Ingredient("Стружка кокосовая"),
    Ingredient("Стружка шоколадная"),
    Ingredient("Субпродукты"),
    Ingredient("Сумах"),
    Ingredient("Сунели"),
    Ingredient("Суп пакетный"),
    Ingredient("Суповой набор"),
    Ingredient("Сусло квасное"),
    Ingredient("Сухари"),
    Ingredient("Сухари панировочные"),
    Ingredient("Сухарики"),
    Ingredient("Сухой завтрак"),
    Ingredient("Сухофрукты"),
    Ingredient("Сушки"),
    Ingredient("Сыворотка"),
    Ingredient("Сыр адыгейский"),
    Ingredient("Сыр голландский"),
    Ingredient("Сыр голубой"),
    Ingredient("Сыр козий"),
    Ingredient("Сыр колбасный"),
    Ingredient("Сыр копченый"),
    Ingredient("Сыр мягкий"),
    Ingredient("Сыр плавленый"),
    Ingredient("Сыр полутвердый"),
    Ingredient("Сыр сливочный"),
    Ingredient("Сыр сулугуни"),
    Ingredient("Сыр твердый"),
    Ingredient("Сыр творожный"),
    Ingredient("Сырок плавленый"),
    Ingredient("Сырок творожный"),
    Ingredient("Сычужный фермент"),
    Ingredient("Табаско"),
    Ingredient("Тандури масала"),
    Ingredient("Тапиока"),
    Ingredient("Тарталетка"),
    Ingredient("Тартар"),
    Ingredient("Тархун"),
    Ingredient("Творог"),
    Ingredient("Творожная масса"),
    Ingredient("Текила"),
    Ingredient("Телятина"),
    Ingredient("Тесто дрожжевое"),
    Ingredient("Тесто заварное"),
    Ingredient("Тесто пельменное"),
    Ingredient("Тесто песочное"),
    Ingredient("Тесто пресное"),
    Ingredient("Тесто слоеное"),
    Ingredient("Тесто слоеное бездрожжевое"),
    Ingredient("Тесто слоеное дрожжевое"),
    Ingredient("Тесто фило"),
    Ingredient("Тефтели"),
    Ingredient("Тилапия"),
    Ingredient("Тимьян"),
    Ingredient("Ткемали"),
    Ingredient("Тмин"),
    Ingredient("Толокно"),
    Ingredient("Томатная паста"),
    Ingredient("Томаты в собственном соку"),
    Ingredient("Томаты вяленые"),
    Ingredient("Томаты пассерованные"),
    Ingredient("Томаты протертые"),
    Ingredient("Томаты сушеные"),
    Ingredient("Тоник"),
    Ingredient("Топинамбур"),
    Ingredient("Тосты"),
    Ingredient("Тофу"),
    Ingredient("Треска"),
    Ingredient("Трюфель"),
    Ingredient("Тунец"),
    Ingredient("Тушенка"),
    Ingredient("Тыква"),
    Ingredient("Угорь"),
    Ingredient("Удон"),
    Ingredient("Укроп"),
    Ingredient("Уксус"),
    Ingredient("Уксусная эссенция"),
    Ingredient("Улитки"),
    Ingredient("Улучшитель хлебопекарный"),
    Ingredient("Унаби"),
    Ingredient("Урбеч"),
    Ingredient("Урюк"),
    Ingredient("Устрицы"),
    Ingredient("Утка"),
    Ingredient("Уцхо-сунели"),
    Ingredient("Фарш индюшачий"),
    Ingredient("Фарш куриный"),
    Ingredient("Фарш мясной"),
    Ingredient("Фарш рыбный"),
    Ingredient("Фарш соевый"),
    Ingredient("Фасоль"),
    Ingredient("Фасоль консервированная"),
    Ingredient("Фасоль стручковая"),
    Ingredient("Фейхоа"),
    Ingredient("Фенхель"),
    Ingredient("Фета"),
    Ingredient("Фетаки"),
    Ingredient("Физалис"),
    Ingredient("Филе"),
    Ingredient("Филе куриное"),
    Ingredient("Филе рыбное"),
    Ingredient("Финик"),
    Ingredient("Фисташки"),
    Ingredient("Форель"),
    Ingredient("Фосфат пищевой"),
    Ingredient("Фризе"),
    Ingredient("Фрикадельки"),
    Ingredient("Фритюр"),
    Ingredient("Фруктоза"),
    Ingredient("Фрукты"),
    Ingredient("Фундук"),
    Ingredient("Фунчоза"),
    Ingredient("Халва"),
    Ingredient("Халва подсолнечная"),
    Ingredient("Хамон"),
    Ingredient("Хамса"),
    Ingredient("Хвост"),
    Ingredient("Хвоя"),
    Ingredient("Хек"),
    Ingredient("Херес"),
    Ingredient("Хлеб"),
    Ingredient("Хлебобулочные изделия"),
    Ingredient("Хлебцы"),
    Ingredient("Хлопья гороховые"),
    Ingredient("Хлопья гречневые"),
    Ingredient("Хлопья злаковые"),
    Ingredient("Хлопья картофельные"),
    Ingredient("Хлопья кукурузные"),
    Ingredient("Хлопья овсяные"),
    Ingredient("Хлопья панировочные"),
    Ingredient("Хлопья пшенные"),
    Ingredient("Хлопья рисовые"),
    Ingredient("Хлопья шоколадные"),
    Ingredient("Хлопья ячменные"),
    Ingredient("Хлорид кальция"),
    Ingredient("Хмели-сунели"),
    Ingredient("Хмель"),
    Ingredient("Хрен"),
    Ingredient("Хурма"),
    Ingredient("Цветки"),
    Ingredient("Цедра апельсина"),
    Ingredient("Цедра грейпфрута"),
    Ingredient("Цедра лайма"),
    Ingredient("Цедра лимона"),
    Ingredient("Цедра мандарина"),
    Ingredient("Цесарка"),
    Ingredient("Цикорий"),
    Ingredient("Цукаты"),
    Ingredient("Цуккини"),
    Ingredient("Цыпленок"),
    Ingredient("Чабер"),
    Ingredient("Чабрец"),
    Ingredient("Чай белый"),
    Ingredient("Чай в пакетиках"),
    Ingredient("Чай зеленый"),
    Ingredient("Чай красный"),
    Ingredient("Чай черный"),
    Ingredient("Черемуха"),
    Ingredient("Черемша"),
    Ingredient("Черешня"),
    Ingredient("Черника"),
    Ingredient("Чернила каракатицы"),
    Ingredient("Чернослив"),
    Ingredient("Чеснок"),
    Ingredient("Чечевица"),
    Ingredient("Чипсы"),
    Ingredient("Чоризо"),
    Ingredient("Шалфей"),
    Ingredient("Шампанское"),
    Ingredient("Шампиньоны"),
    Ingredient("Шафран"),
    Ingredient("Шейка куриная"),
    Ingredient("Шейка свиная"),
    Ingredient("Шелковица"),
    Ingredient("Шелуха луковая"),
    Ingredient("Шиповник"),
    Ingredient("Шишки сосновые"),
    Ingredient("Шкура свиная"),
    Ingredient("Шнитт-лук"),
    Ingredient("Шоколад белый"),
    Ingredient("Шоколад молочный"),
    Ingredient("Шоколад темный"),
    Ingredient("Шпиг"),
    Ingredient("Шпинат"),
    Ingredient("Шпроты"),
    Ingredient("Шрот"),
    Ingredient("Щавель"),
    Ingredient("Щука"),
    Ingredient("Эклеры"),
    Ingredient("Экстракт"),
    Ingredient("Эскалоп"),
    Ingredient("Эссенция"),
    Ingredient("Эстрагон"),
    Ingredient("Яблоко"),
    Ingredient("Ягода"),
    Ingredient("Язык говяжий"),
    Ingredient("Язык свиной"),
    Ingredient("Яйцо куриное"),
    Ingredient("Яйцо перепелиное"),
    Ingredient("Ямс"),
    Ingredient("Ячмень"),
)
