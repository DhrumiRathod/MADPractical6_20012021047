package com.example.madpractical6_20012021047

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val mywebview = findViewById<WebView>(R.id.wv)
        val myactionbutton = findViewById<FloatingActionButton>(R.id.fb2)

        myactionbutton.setOnClickListener(){
            Intent(this,MainActivity::class.java).apply { startActivity(this) }
        }

        val youtubeid = "g6fnFALEseI"

        val webSettings: WebSettings = mywebview.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        mywebview.loadUrl("https://www.youtube.com/embed/$youtubeid")

    }
}