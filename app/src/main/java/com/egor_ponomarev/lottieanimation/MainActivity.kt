package com.egor_ponomarev.lottieanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable

class MainActivity : AppCompatActivity() {
    private val mAnimationView by lazy {
        findViewById<LottieAnimationView>(R.id.animationView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        mAnimationView.setAnimation(R.raw.typing_animation)
        mAnimationView.repeatCount = LottieDrawable.INFINITE
        mAnimationView.playAnimation()
    }
}