package com.android.example.roomwordsample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="word_table") //each entity represents an SQLITE table
data class Word(@PrimaryKey @ColumnInfo(name = "word") val word:String )
