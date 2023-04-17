package com.example.cw2_2020021

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface MealDao {
    //writing quarries for database

    @Query("SELECT * FROM meal_table")
    fun getAll():List<Meal>

    // onConflict ignore is to ignore data duplication
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(meal: Meal)

}