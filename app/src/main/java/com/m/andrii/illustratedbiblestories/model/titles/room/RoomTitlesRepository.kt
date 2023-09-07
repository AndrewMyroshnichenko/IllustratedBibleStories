package com.m.andrii.illustratedbiblestories.model.titles.room

import com.m.andrii.illustratedbiblestories.model.TitlesRepository
import com.m.andrii.illustratedbiblestories.model.titles.entities.TitleItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class RoomTitlesRepository(val dao: TitlesDao) : TitlesRepository {

    override fun getAllTitles(language: String): List<TitleItem?> {
        return dao.getAllTitles().map { it?.toTileItem(language) }
    }

    override fun getTitle(language: String, titleId: Int): TitleItem? {
        return dao.getTitle(titleId)?.toTileItem(language)
    }


}