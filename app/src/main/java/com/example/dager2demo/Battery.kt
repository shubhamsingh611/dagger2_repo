package com.example.dager2demo

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor(){
    init {
        Log.d("My Mobile - ", "Battery")
    }
}