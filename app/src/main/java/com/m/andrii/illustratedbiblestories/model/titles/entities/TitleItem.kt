package com.m.andrii.illustratedbiblestories.model.titles.entities

class TitleItem(
    val position: Int,
    val title: String,
    val titleContext: String,
    val imageUrl: String
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TitleItem

        if (position != other.position) return false
        if (title != other.title) return false
        if (titleContext != other.titleContext) return false
        if (imageUrl != other.imageUrl) return false

        return true
    }

    override fun hashCode(): Int {
        var result = position
        result = 31 * result + title.hashCode()
        result = 31 * result + titleContext.hashCode()
        result = 31 * result + imageUrl.hashCode()
        return result
    }
}