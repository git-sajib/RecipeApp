package com.example.recipeapp

//Setting up our Categories Data Classes
data class Category(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String,
    )

data class CategoriesResponse(
    val categories: List<Category>
)
