package com.example.dager2demo.Component

import com.example.dager2demo.MainActivity
import com.example.dager2demo.Mobile
import com.example.dager2demo.module.BatteryModule
import dagger.Component

@Component(modules = [BatteryModule::class])
interface MobileComponent {
//    fun getMobile() : Mobile
    fun inject(mainActivity: MainActivity)
}