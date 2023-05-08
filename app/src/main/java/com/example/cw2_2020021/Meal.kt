package com.example.cw2_2020021

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.w3c.dom.ProcessingInstruction


@Entity(tableName = "meal_table")
data class Meal(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "meal_name") val mealName: String?,
    @ColumnInfo(name = "drink_alternate") val drinkAlternate: String?,
    @ColumnInfo (name = "category") val category: String?,
    @ColumnInfo (name = "area") val area: String?,
    @ColumnInfo (name = "instructions") val instructions: String?,

    //add col info later
//creating database

)
