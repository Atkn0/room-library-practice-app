package com.example.noteappwithroom.Services

import com.example.noteappwithroom.Models.NoteModel

class NoteRepository (private val noteDao: NoteDao){

    suspend fun addNote(note:NoteModel){
        noteDao.insertAll(note)
    }

}