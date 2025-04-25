package ui.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import ui.User

@Dao
interface UserDAO {
    @Insert
    fun add_User(User: User)

    @Delete
    fun delete_User(User: User)
}