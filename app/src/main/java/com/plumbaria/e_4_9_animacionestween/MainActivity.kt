package com.plumbaria.e_4_9_animacionestween

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var animacion : Animation = AnimationUtils.loadAnimation(this,R.anim.animacion)
        textView.startAnimation(animacion)


    }
}
