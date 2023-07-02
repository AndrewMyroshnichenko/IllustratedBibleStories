package com.m.andrii.illustratedbiblestories.model.titles.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.m.andrii.illustratedbiblestories.model.titles.room.entities.TitleDbEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TitlesDao {

    @Query("SELECT * FROM titles")
    fun getAllTitles(): List<TitleDbEntity?>

    @Query("SELECT * FROM titles WHERE id = :titleId")
    fun getTitle(titleId: Int): TitleDbEntity?

}