package com.m.andrii.illustratedbiblestories.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.asLiveData
import androidx.room.Room
import com.m.andrii.illustratedbiblestories.databinding.ActivityMainBinding
import com.m.andrii.illustratedbiblestories.model.room.AppDatabase
import com.m.andrii.illustratedbiblestories.model.titles.room.entities.TitleDbEntity

class MainActivity : AppCompatActivity() {

    private var bind: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind?.root)

        val db = AppDatabase.getDb(this)
        val s = db.getTitlesDao().getAllTitles().asLiveData().observe(this){list ->
            bind?.tv?.text = ""
            list.forEach {
                val text = "${it?.id} ${it?.title} ${it?.titleContext} ${it?.imageUrl} \n"
                bind?.tv?.append(text)
            }
        }
        Thread{
            db.getTitlesDao().insertTitle(TitleDbEntity(0, "4", "5", "8"))
        }.start()

    }

}