package com.m.andrii.illustratedbiblestories.model.titles.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.m.andrii.illustratedbiblestories.model.titles.room.entities.TitleDbEntity

@Database(
    version = 1,
    entities = [TitleDbEntity::class]
)
abstract class AppDatabase : RoomDatabase() {
}