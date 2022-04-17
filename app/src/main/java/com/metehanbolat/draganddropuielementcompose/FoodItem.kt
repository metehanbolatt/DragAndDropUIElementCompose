package com.metehanbolat.draganddropuielementcompose

import androidx.annotation.DrawableRes

data class FoodItem(
    val id: Int,
    val name: String,
    val price: Double,
    @DrawableRes val image: Int
)

data class Person(
    val id: Int,
    val name: String,
    @DrawableRes val profile: Int
)

val foodList = listOf(
    FoodItem(1, "Pizza", 19.99, R.drawable.food_pizza),
    FoodItem(2, "Toast", 10.99, R.drawable.food_toast),
    FoodItem(3, "Chocolate Cake", 29.99, R.drawable.food_cake)
)

val person = listOf(
    Person(1, "User 1", R.drawable.cat),
    Person(2, "User 2", R.drawable.cat),
    Person(3, "User 3", R.drawable.cat)
)
