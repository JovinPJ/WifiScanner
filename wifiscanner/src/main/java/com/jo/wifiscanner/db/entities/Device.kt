package com.jo.wifiscanner.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Calendar
import java.util.Calendar.DAY_OF_YEAR

@Entity(tableName = "device")
data class Device(
    @PrimaryKey @ColumnInfo(name = "ipAddress") val ipAddress: String,
    val name: String,
    val macAddress: String,
    val hostName: String,
    val vendor: String,
    val imageUrl: String = ""
)
