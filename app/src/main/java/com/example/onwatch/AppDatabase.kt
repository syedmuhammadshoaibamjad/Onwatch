package com.example.onwatch

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ModelClass::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun ProjectDao(): ProjectDao

    companion object{
        private  var instance:AppDatabase?= null

        @Synchronized
        fun getDatabase(ctx: Context):AppDatabase{
            if(instance==null)
                instance= Room.databaseBuilder(ctx,AppDatabase::class.java,"database_v3")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build()
            return instance!!

        }
    }
    }

