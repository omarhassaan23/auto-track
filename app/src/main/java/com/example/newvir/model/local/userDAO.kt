package com.example.newvir.model.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.newvir.model.entity.users


@Dao
interface userDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun AddUser(user:users)

    @Delete
    fun DeleteUser(user: users)

    @Query("select*from user_table")
    fun GetUser():List<users>
}