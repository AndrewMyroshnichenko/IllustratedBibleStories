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

    @ColumnInfo(name = "title_en") val titleEn: String,
    @ColumnInfo(name = "title_ru") val titleRu: String,
    @ColumnInfo(name = "title_ua") val titleUa: String,
    @ColumnInfo(name = "title_de") val titleDe: String,
    @ColumnInfo(name = "title_es") val titleEs: String,
    @ColumnInfo(name = "title_fr") val titleFr: String,
    @ColumnInfo(name = "title_it") val titleIt: String,
    @ColumnInfo(name = "title_ju") val titleJu: String,
    @ColumnInfo(name = "title_hu") val titleHu: String,
    @ColumnInfo(name = "title_pl") val titlePl: String,
    @ColumnInfo(name = "title_pt") val titlePt: String,
    @ColumnInfo(name = "title_ro") val titleRo: String,
    @ColumnInfo(name = "title_sk") val titleSk: String,
    @ColumnInfo(name = "title_cs") val titleCs: String,

    @ColumnInfo(name = "title_context_en") val titleContextEn: String,
    @ColumnInfo(name = "title_context_ru") val titleContextRu: String,
    @ColumnInfo(name = "title_context_ua") val titleContextUa: String,
    @ColumnInfo(name = "title_context_de") val titleContextDe: String,
    @ColumnInfo(name = "title_context_es") val titleContextEs: String,
    @ColumnInfo(name = "title_context_fr") val titleContextFr: String,
    @ColumnInfo(name = "title_context_it") val titleContextIt: String,
    @ColumnInfo(name = "title_context_ju") val titleContextJu: String,
    @ColumnInfo(name = "title_context_hu") val titleContextHu: String,
    @ColumnInfo(name = "title_context_pl") val titleContextPl: String,
    @ColumnInfo(name = "title_context_pt") val titleContextPt: String,
    @ColumnInfo(name = "title_context_ro") val titleContextRo: String,
    @ColumnInfo(name = "title_context_sk") val titleContextSk: String,
    @ColumnInfo(name = "title_context_cs") val titleContextCs: String,

    @ColumnInfo(name = "img_url") val imageUrl: String
) {

    fun toTileItem(language: String): TitleItem {
        val title: String
        val titleContext: String

        when (language) {
            "en" -> {
                title = titleEn
                titleContext = titleContextEn
            }

            "ru" -> {
                title = titleRu
                titleContext = titleContextRu
            }

            "ua" -> {
                title = titleUa
                titleContext = titleContextUa
            }

            "sk" -> {
                title = titleSk
                titleContext = titleContextSk
            }

            else -> {
                title = titleEn
                titleContext = titleContextEn
            }

        }

        return TitleItem(
            position = id,
            title = title,
            titleContext = titleContext,
            imageUrl = imageUrl
        )
    }


}