package com.m.andrii.illustratedbiblestories.model.titles.room

import android.icu.text.CaseMap.Title
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.m.andrii.illustratedbiblestories.model.titles.room.entities.TitleDbEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TitlesDao {

    @Query("SELECT * FROM titles")
    fun getAllTitles(): Flow<List<TitleDbEntity?>>

    @Insert
    fun insertTitle(item: TitleDbEntity)

}