package com.jo.wifiscanner

import android.app.Application
import android.content.Context
import android.util.Log

class WifiScannerApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Log.e("lib", "App init")
        initialize(this.baseContext)
    }

    private fun initialize(baseContext: Context) {
        WifiScannerManager.initialize(baseContext)
    }
}