package com.m.andrii.illustratedbiblestories.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.m.andrii.illustratedbiblestories.databinding.ActivityMainBinding
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private var bind: ActivityMainBinding? = null
    val locale: Locale = Locale.getDefault()
    val language: String = locale.displayLanguage
    val availableLocales: Array<Locale> = Locale.getAvailableLocales()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind?.root)

        for (locale in availableLocales) {
            println("${locale.language} ${locale.displayCountry}")
        }


    }

}