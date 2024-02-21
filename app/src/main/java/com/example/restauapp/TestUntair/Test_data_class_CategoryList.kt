package com.example.restauapp

import com.example.restauapp.Models.Category
import com.example.restauapp.Models.CategoryList
import org.junit.Assert
import org.junit.Test


class Test_data_class_CategoryList {
    // test add
    @Test
    fun testCategoryListInitialization() {
        val categories = listOf(
            Category("1", "txet","text","text"),
            Category("2", "txet","text","text"),
        )
        val categoryList = CategoryList(categories)
        Assert.assertEquals(categories, categoryList.categories)
    }

}