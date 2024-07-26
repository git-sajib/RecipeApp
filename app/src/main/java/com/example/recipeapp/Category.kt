package com.example.recipeapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
//Setting up our Categories Data Classes
data class Category(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String):Parcelable

data class CategoriesResponse(
    val categories: List<Category>
)
