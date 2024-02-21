package com.example.restauapp

import com.example.restauapp.Models.MealsByCategory
import junit.framework.TestCase.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

class Test_data_class_MealsByCategory {

    @Test
    fun testDataClassProperties() {
        val mealsByCategory = MealsByCategory("1", "Pasta", "image")
        assertEquals("1", mealsByCategory.idMeal)
        assertEquals("Pasta", mealsByCategory.strMeal)
        assertEquals("image", mealsByCategory.strMealThumb)
    }
    @Test
    fun testEquality() {
        val mealsByCategory1 = MealsByCategory("1", "Pasta1", "image")
        val mealsByCategory2 = MealsByCategory("1", "Pasta2", "image")
        assertEquals(mealsByCategory1, mealsByCategory2)
    }
    @Test
    fun testNonEquality() {
        val mealsByCategory1 = MealsByCategory("1", "text", "text1")
        val mealsByCategory2 = MealsByCategory("2", "text1", "txet2")
        assertNotEquals(mealsByCategory1, mealsByCategory2)
    }
}