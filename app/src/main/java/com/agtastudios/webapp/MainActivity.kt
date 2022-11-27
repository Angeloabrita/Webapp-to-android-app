package com.agtastudios.webapp

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.WindowDecorActionBar
import androidx.core.content.ContextCompat.startActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //change your url
        myWeb("https://www.android.com/")


    }



    fun myWeb( url: String){

        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.webViewClient = WebViewClient()


        myWebView.loadUrl(url)
        myWebView.settings.javaScriptEnabled = true



    }

}




