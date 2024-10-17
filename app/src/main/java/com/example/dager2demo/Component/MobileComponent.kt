package com.example.dager2demo.Component

import com.example.dager2demo.Mobile
import dagger.Component

@Component
interface MobileComponent {
    fun getMobile() : Mobile
}