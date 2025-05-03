package com.example.newvir.model.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "User_table")
data class users(
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    @ColumnInfo(name = "User_name")
    var UserName:String,
    @ColumnInfo(name = "User_Password")
    var password:Int
)
