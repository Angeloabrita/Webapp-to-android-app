package com.agtastudios.webapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //change your url
        myWeb("https://www.android.com/")

    }

    fun myWeb(urls: String) {
        val myWebView: WebView = findViewById(R.id.webview)

        //logical for links on webapp ex: external links open on brower or their apps #fix bug
        myWebView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                    //if the app start with https:// open in webview
                    if (url != null && url.startsWith("https://")) {
                        return false
                    }
                    else{
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                        view!!.context.startActivity(intent)
                        return true

                    }
                return false
            }

        }
        myWebView.loadUrl(urls)
        myWebView.settings.javaScriptEnabled = true

    }
}



