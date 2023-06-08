package com.m.andrii.illustratedbiblestories.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.m.andrii.illustratedbiblestories.databinding.ActivityMainBinding
import com.m.andrii.illustratedbiblestories.model.room.AppDatabase

class MainActivity : AppCompatActivity() {

    private var bind: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind?.root)

        val db = AppDatabase.getDb(this)
        val s = db.getTitlesDao()
    }

}