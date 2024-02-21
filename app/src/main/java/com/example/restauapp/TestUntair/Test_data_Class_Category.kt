package com.example.restauapp

import com.example.restauapp.Models.Category
import junit.framework.TestCase.assertEquals
import org.junit.Assert
import org.junit.Assert.assertNotEquals
import org.junit.Test

class Test_data_Class_Category {
    @Test
    fun testCategoryEquality() {
        val category1 = Category("1", "text1", "text2", "text3")
        val category2 = Category("1", "text1", "text2", "text3")
        assertEquals(category1, category2)
    }
    @Test
    fun testCategoryInequality() {
        val category1 = Category("1", "text1", "text2", "text3")
        val category2 = Category("2", "text1", "text2", "text3")
        assertNotEquals(category1, category2)
    }
    @Test
    fun testHashCodeEquality() {
        val category1 = Category("1", "text", "text2", "text3")
        val category2 = Category("1", "text1", "text2", "text4")
        assertEquals(category1.hashCode(), category2.hashCode())
    }
    @Test
    fun testHashCodeInequality() {
        val category1 = Category("1", "txet", "txet", "text")
        val category2 = Category("2", "txet", "txet", "txet")
        Assert.assertNotEquals(category1.hashCode(), category2.hashCode())
    }
}