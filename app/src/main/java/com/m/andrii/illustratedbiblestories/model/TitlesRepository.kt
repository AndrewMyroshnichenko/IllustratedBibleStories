package com.m.andrii.illustratedbiblestories.model

import com.m.andrii.illustratedbiblestories.model.titles.entities.TitleItem
import com.m.andrii.illustratedbiblestories.model.titles.room.entities.TitleDbEntity
import kotlinx.coroutines.flow.Flow

interface TitlesRepository {

    fun getAllTitles(language: String): List<TitleItem?>

    fun getTitle(language: String, titleId: Int): TitleItem?

}