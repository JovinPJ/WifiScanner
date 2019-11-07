package com.jo.wifiscanner

import android.content.Context
import com.jo.wifiscanner.db.AppDatabase

object WifiScannerManager {
    fun initialize(baseContext: Context) {
        AppDatabase.getInstance(baseContext)
    }
}