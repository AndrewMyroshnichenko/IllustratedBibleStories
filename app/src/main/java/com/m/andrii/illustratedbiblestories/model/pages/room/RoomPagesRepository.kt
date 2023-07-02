package com.m.andrii.illustratedbiblestories.model.pages.room

import com.m.andrii.illustratedbiblestories.model.PagesRepository
import com.m.andrii.illustratedbiblestories.model.pages.entities.Page

class RoomPagesRepository(val dao: PagesDao) : PagesRepository {

    override fun getTitlesPages(language: String, titleId: Int): List<Page> {
        return dao.getTitlesPages(titleId).map { it.toPage(language) }
    }

}