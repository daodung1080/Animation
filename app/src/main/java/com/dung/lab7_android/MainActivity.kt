package com.dung.lab7_android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var anim_xoay: Animation = AnimationUtils.loadAnimation(this,R.anim.anim_xoay)
        var anim_dichuyen: Animation = AnimationUtils.loadAnimation(this,R.anim.anim_dichuyen)
        var anim_phong: Animation = AnimationUtils.loadAnimation(this,R.anim.anim_phong)

        btnXoay.setOnClickListener { img_BatMan.startAnimation(anim_xoay) }
        btnDiChuyen.setOnClickListener { img_BatMan.startAnimation(anim_dichuyen) }
        btnPhong.setOnClickListener { img_BatMan.startAnimation(anim_phong) }

        btnChuyenActivity2.setOnClickListener {startActivity(Intent(this@MainActivity,Main2Activity::class.java)) }
        btnChuyenActivity3.setOnClickListener { startActivity(Intent(this@MainActivity,Main3Activity::class.java)) }

    }
}
