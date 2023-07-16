package kr.co.bullets.part2chapter8

import android.app.Application
import android.content.Context

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        MyApplication.applicationContext = applicationContext
    }

    companion object {
        lateinit var applicationContext: Context
    }
}