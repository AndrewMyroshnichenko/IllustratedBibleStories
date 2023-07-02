package com.m.andrii.illustratedbiblestories.model.pages.room.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import com.m.andrii.illustratedbiblestories.model.pages.entities.Page
import com.m.andrii.illustratedbiblestories.model.titles.room.entities.TitleDbEntity

@Entity(
    tableName = "stories_pages",
    primaryKeys = ["title_id", "page_number"],
    indices = [
        Index("page_number")
    ],
    foreignKeys = [ForeignKey(
        entity = TitleDbEntity::class,
        parentColumns = ["id"],
        childColumns = ["title_id"],
        onDelete = ForeignKey.CASCADE,
        onUpdate = ForeignKey.CASCADE
    )]
)
class PageDbEntity(
    @ColumnInfo(name = "title_id") val titleId: Int,
    @ColumnInfo(name = "page_number") val pageNumber: Int,

    @ColumnInfo(name = "text_en") val textEn: String,
    @ColumnInfo(name = "text_ru") val textRu: String,
    @ColumnInfo(name = "text_ua") val textUa: String, //This language isn't available in the Locale class
    @ColumnInfo(name = "text_de") val textDe: String,
    @ColumnInfo(name = "text_es") val textEs: String,
    @ColumnInfo(name = "text_fr") val textFr: String,
    @ColumnInfo(name = "text_it") val textIt: String,
    @ColumnInfo(name = "text_ju") val textJu: String, //Yugoslavia is not an existing country
    @ColumnInfo(name = "text_hu") val textHu: String,
    @ColumnInfo(name = "text_pl") val textPl: String,
    @ColumnInfo(name = "text_pt") val textPt: String,
    @ColumnInfo(name = "text_ro") val textRo: String,
    @ColumnInfo(name = "text_sk") val textSk: String,
    @ColumnInfo(name = "text_cs") val textCs: String,

    @ColumnInfo(name = "img_url") val pagesImgUrl: String
) {

    fun toPage(language: String): Page {
        val text: String

        when (language) {
            "en" -> text = textEn
            "ru" -> text = textRu
            "ua" -> text = textUa
            "sk" -> text = textSk
            else -> text = textEn
        }

        return Page(
            titleId = titleId,
            pageNumber = pageNumber,
            pagesText = text,
            pagesImgUrl = pagesImgUrl
        )
    }
}