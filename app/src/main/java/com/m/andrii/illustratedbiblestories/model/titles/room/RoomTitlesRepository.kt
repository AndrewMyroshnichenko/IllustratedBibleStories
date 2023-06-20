package com.m.andrii.illustratedbiblestories.model.titles.room

import com.m.andrii.illustratedbiblestories.model.TitlesRepository
import com.m.andrii.illustratedbiblestories.model.titles.entities.TitleItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class RoomTitlesRepository(private val dao: TitlesDao) : TitlesRepository {

    override fun getAllTitles(language: String): Flow<List<TitleItem?>> {
        return dao.getAllTitles().map { list -> list.map {it?.toTileItem(language) } }
    }

}