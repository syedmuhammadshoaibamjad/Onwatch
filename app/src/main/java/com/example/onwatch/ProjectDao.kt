package com.example.onwatch

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ProjectDao {
    @Insert
    fun insert (model: ModelClass)

    @Delete
    fun delete (model: ModelClass)

    @Query("SELECT * FROM ModelClass")
    fun getAll(): List<ModelClass>

    @Update
    fun update(model: ModelClass)

}