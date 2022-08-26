package com.example.noteappwithroom.Models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class NoteModel (
    @PrimaryKey(autoGenerate = true)
    val uuid:Int,
    @ColumnInfo(name = "noteTitle")
    val noteTitle:String,
    @ColumnInfo(name = "noteDescription")
    val noteDescript:String)
