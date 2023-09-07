package com.m.andrii.illustratedbiblestories.model.pages.room

import androidx.room.Dao
import androidx.room.Query
import com.m.andrii.illustratedbiblestories.model.pages.room.entities.PageDbEntity
import com.m.andrii.illustratedbiblestories.model.titles.room.entities.TitleDbEntity

@Dao
interface PagesDao {

    @Query("SELECT * FROM stories_pages WHERE title_id = :titleId")
    fun getTitlesPages(titleId: Int): List<PageDbEntity>

}