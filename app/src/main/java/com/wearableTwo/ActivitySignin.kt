package com.wearableTwo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView

class ActivitySignin : AppCompatActivity() {

    private lateinit var btnBack: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        btnBack = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            btnBack.startAnimation(AnimationUtils.loadAnimation(this, R.anim.bounce))
            onBackPressed()
        }

    }
}