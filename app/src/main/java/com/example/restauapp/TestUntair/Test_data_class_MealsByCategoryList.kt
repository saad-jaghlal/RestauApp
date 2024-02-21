package com.example.restauapp

import com.example.restauapp.Models.Category
import com.example.restauapp.Models.CategoryList
import com.example.restauapp.Models.MealsByCategory
import com.example.restauapp.Models.MealsByCategoryList
import org.junit.Assert
import org.junit.Test

class Test_data_class_MealsByCategoryList {
    @Test
    fun testEmptyMealsByCategoryList() {
        val emptyMealsList = emptyList<MealsByCategory>()
        val emptyMealsByCategoryList = MealsByCategoryList(emptyMealsList)
        Assert.assertTrue(emptyMealsByCategoryList.meals.isEmpty())
    }

    @Test
    fun testCategoryListInitialization() {
        // Create a list of categories
        val categories = listOf(
            Category("Category1", "txet","text","text"),
            Category("Category2", "txet","text","text"),
        )
        val categoryList = CategoryList(categories)
        Assert.assertEquals(categories, categoryList.categories)
    }

}