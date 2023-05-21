package com.m.andrii.illustratedbiblestories.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.m.andrii.illustratedbiblestories.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var bind: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind?.root)
    }

}