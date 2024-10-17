package com.example.dager2demo

import android.util.Log
import javax.inject.Inject

class Mobile @Inject constructor(battery: Battery, processor: Processor){
    init {
        Log.d("My Mobile - ", "Mobile")
    }
    fun run() {
        Log.d("My Mobile - ", "Mobile is running")
    }
}