package com.example.dager2demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import com.example.dager2demo.Component.DaggerMobileComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mobile : Mobile
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("My Mobile", "OnCreate")

        val component = DaggerMobileComponent.create()

          component.inject(this)
          mobile.run()


    }

}