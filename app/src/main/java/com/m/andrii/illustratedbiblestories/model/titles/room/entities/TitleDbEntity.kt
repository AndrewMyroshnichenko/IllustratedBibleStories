package com.m.andrii.illustratedbiblestories.model.titles.room.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.m.andrii.illustratedbiblestories.model.titles.entities.TitleItem

@Entity(
    tableName = "titles"
)
data class TitleDbEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "title_context") val titleContext: String,
    @ColumnInfo(name = "img_url")val imageUrl: String
) {

    fun toTitleItem(): TitleItem = TitleItem(
        position = id,
        title = title,
        titleContext = titleContext,
        imageUrl = imageUrl
    )

}