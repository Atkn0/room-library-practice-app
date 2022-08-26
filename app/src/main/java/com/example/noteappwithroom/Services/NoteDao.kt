package com.example.noteappwithroom.Services

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.noteappwithroom.Models.NoteModel

@Dao
interface NoteDao {
    // veritabanına gönderilecek istek fonksiyonları yazılır

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(note:NoteModel)

    @Query("SELECT * FROM NoteModel")
    fun getAllNotes():LiveData<List<NoteModel>>
}