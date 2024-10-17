package com.example.dager2demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.dager2demo.Component.DaggerMobileComponent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("My Mobile", "OnCreate")

        val component = DaggerMobileComponent.create()

        val mobile = component.getMobile()
        mobile.run()

    }
}