package com.m.andrii.illustratedbiblestories.model.titles.room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.m.andrii.illustratedbiblestories.model.titles.entities.TitleItem

@Entity(
    tableName = "titles"
)
data class TitleDbEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val title: String,
    val titleContext: String,
    val imageUrl: String
) {

    fun toTitleItem(): TitleItem = TitleItem(
        position = id,
        title = title,
        titleContext = titleContext,
        imageUrl = imageUrl
    )

}