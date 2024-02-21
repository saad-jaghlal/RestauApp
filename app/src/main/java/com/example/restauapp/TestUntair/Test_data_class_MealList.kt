package com.example.restauapp

import com.example.restauapp.Models.Category
import com.example.restauapp.Models.CategoryList
import com.example.restauapp.Models.Meal
import com.example.restauapp.Models.MealList
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.Assert
import org.junit.Test

class Test_data_class_MealList {
    @Test
    fun testMealListCreation() {
        // Create a list of meals
        val meal1 = Meal("Meal1", "Category1", "Area1", "Instructions1", "url1","",
            "","text","text","text","text","text","Meal1", "Category1", "Area1", "Instructions1", "url1","",
            "text","","","","","","Meal1", "Category1", "Area1", "Instructions1", "url1","",
            "text","text","text","text","text","text","Meal1", "Category1", "Area1", "Instructions1", "url1","",
            "","","","","","","Meal1", "Category1", "Area1", "Instructions1", "url1")
        val meal2 = Meal("Meal1", "Category1", "Area1", "Instructions1", "url1","",
            "","text","text","text","text","text","Meal1", "Category1", "Area1", "Instructions1", "url1","",
            "text","","","","","","Meal1", "Category1", "Area1", "Instructions1", "url1","",
            "text","text","text","text","text","text","Meal1", "Category1", "Area1", "Instructions1", "url1","",
            "","","","","","","Meal1", "Category1", "Area1", "Instructions1", "url1")
        val meals = listOf(meal1, meal2)
        val mealList = MealList(meals)
        assertEquals(meals, mealList.meals)
    }
    @Test
    fun testEmptyMealList() {
        val meals = emptyList<Meal>()
        val mealList = MealList(meals)
        assertTrue(mealList.meals.isEmpty())
    }
}