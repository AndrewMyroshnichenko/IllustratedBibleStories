package com.m.andrii.illustratedbiblestories.model.titles.room

import androidx.room.Dao
import androidx.room.Query
import com.m.andrii.illustratedbiblestories.model.titles.room.entities.TitleDbEntity

@Dao
interface TitlesDao {

    @Query("SELECT * FROM titles")
    suspend fun getAllTitles(): List<TitleDbEntity?>

}