package com.dung.lab7_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var anim_kimgiay: Animation = AnimationUtils.loadAnimation(this,R.anim.anim_kimgiay)
        var anim_kimphut: Animation = AnimationUtils.loadAnimation(this,R.anim.anim_kimphut)
        var anim_kimgio: Animation = AnimationUtils.loadAnimation(this,R.anim.anim_kimgio)

        btnBatDau.setOnClickListener {
            imgKimGiay.startAnimation(anim_kimgiay)
            imgKimPhut.startAnimation(anim_kimphut)
            imgKimGio.startAnimation(anim_kimgio)
        }

    }
}
