package com.agtastudios.webapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.BounceInterpolator
import android.view.animation.ScaleAnimation
import android.widget.ImageView

import androidx.core.os.HandlerCompat.postDelayed

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        animateImage()
        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 1500)
    }

    private fun animateImage() {
        val zoomIn = ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f)
        zoomIn.duration = 500
        zoomIn.repeatMode = Animation.REVERSE
        zoomIn.repeatCount = Animation.INFINITE
        val zoomOut = ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f)
        zoomOut.duration = 500
        zoomOut.repeatMode = Animation.REVERSE
        zoomOut.repeatCount = Animation.INFINITE
        zoomOut.startOffset = 100

        val imageView = findViewById<ImageView>(R.id.logo)
        imageView.startAnimation(zoomIn)
        imageView.startAnimation(zoomOut)
    }

}