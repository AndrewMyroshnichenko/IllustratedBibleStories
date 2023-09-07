package com.m.andrii.illustratedbiblestories.model

import com.m.andrii.illustratedbiblestories.model.pages.entities.Page

interface PagesRepository {

    fun getTitlesPages(language: String, titleId: Int): List<Page>

}