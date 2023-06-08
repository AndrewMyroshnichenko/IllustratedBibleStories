package com.m.andrii.illustratedbiblestories.model.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.m.andrii.illustratedbiblestories.model.titles.room.TitlesDao
import com.m.andrii.illustratedbiblestories.model.titles.room.entities.TitleDbEntity

@Database(
    entities = [TitleDbEntity::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getTitlesDao(): TitlesDao

    companion object {
        fun getDb(context: Context): AppDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "test.db"
            ).build()
        }

    }

}