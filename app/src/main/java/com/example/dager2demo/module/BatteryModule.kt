package com.example.dager2demo.module

import com.example.dager2demo.Battery
import com.example.dager2demo.Cobalt
import com.example.dager2demo.Lithium
import dagger.Module
import dagger.Provides

@Module
class BatteryModule {

    @Provides
    fun getCobalt() : Cobalt {
        return Cobalt()
    }

    @Provides
    fun getLithium() : Lithium {
        return Lithium()
    }

    @Provides
    fun getBattery(lithium: Lithium, cobalt: Cobalt) : Battery {
        return Battery(lithium, cobalt)
    }

}