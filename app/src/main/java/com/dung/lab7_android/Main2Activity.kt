package com.dung.lab7_android

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnDoremon.setOnClickListener { showImage("Doremon") }
        btnNobita.setOnClickListener { showImage("Nobita") }
        btnAll.setOnClickListener { showImage("All") }

    }

    fun showImage(img: String){
        var anim: ObjectAnimator = ObjectAnimator.ofFloat(imgAll, "translationX",0f,500f)
        anim.duration = 2000
        var anim1: ObjectAnimator = ObjectAnimator.ofFloat(imgAll,"alpha",1f,0f)
        anim1.duration = 2000
        var anim2: ObjectAnimator = ObjectAnimator.ofFloat(imgAll,"translationX",-500f,0f)
        anim2.duration = 2000
        var anim3: ObjectAnimator = ObjectAnimator.ofFloat(imgAll,"alpha",0f,1f)
        anim3.duration = 2000

        var animatorSet = AnimatorSet()
        animatorSet.play(anim2).with(anim3)
        animatorSet.start()

        if(img == "Nobita"){
            imgAll.setImageResource(R.drawable.img_nobita)
        }
        else if(img == "Doremon"){
            imgAll.setImageResource(R.drawable.img_doremon)
        }
        else if(img == "All"){
            imgAll.setImageResource(R.drawable.img_all)
        }

    }

}
