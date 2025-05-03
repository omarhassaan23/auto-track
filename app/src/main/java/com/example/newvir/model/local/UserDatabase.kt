package com.example.newvir.model.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.newvir.model.entity.users



private const val DATABASE_NAME="User_Database"

@Database(entities = [users::class], version = 1, exportSchema = false)
abstract class UserDatabase: RoomDatabase (){

    abstract fun userDAO():userDAO

    companion object{
        @Volatile
        private var instance:UserDatabase? =null
        fun GetInstance(context: Context):UserDatabase {
            return instance ?: synchronized(Any()){
                instance?: buildDatabase(context).also{ instance=it}
            }
        }

        private fun buildDatabase(context: Context): UserDatabase {
          return  Room.databaseBuilder(
               context.applicationContext,UserDatabase::class.java,
               DATABASE_NAME

           ).build()

        }
    }
}