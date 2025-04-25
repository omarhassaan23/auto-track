package ui

import androidx.room.Entity

@Entity(tableName = "username_table")
data class User(
    var UserName:String,
    var password:String
)
