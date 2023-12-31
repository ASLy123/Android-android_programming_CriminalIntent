package com.bignerdranch.example.criminalintent.database

import java.util.*

class CrimeTypeConverter {          //类型转换器会告诉Room如何转换要保存的特定类型的数据
    @androidx.room.TypeConverter
    fun fromDate(date: Date?): Long? {
        return date?.time
    }
    @androidx.room.TypeConverter
    fun toDate(millisSinceEpoch: Long?): Date? {
        return millisSinceEpoch?.let {
            Date(it)
        }
    }
    @androidx.room.TypeConverter
    fun toUUID(uuid: String?): UUID? {
        return UUID.fromString(uuid)
    }
    @androidx.room.TypeConverter
    fun fromUUID(uuid: UUID?): String? {
        return uuid?.toString()
    }

}