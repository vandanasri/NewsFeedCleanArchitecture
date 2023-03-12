package com.example.common_database

import androidx.room.TypeConverter

class Converters {
    //As Room only handle primitive dataType so we need to convert from Source to String and from String to Source

    @TypeConverter
    fun fromSource(source: Source):String{
        return source.name
    }

    @TypeConverter
    fun toSource(name:String):Source{
        return Source(name, name)
    }
}