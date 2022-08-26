package com.example.noteappwithroom.ViewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.noteappwithroom.Models.NoteModel
import com.example.noteappwithroom.Services.NoteDao
import com.example.noteappwithroom.Services.NoteDatabase
import com.example.noteappwithroom.Services.NoteRepository
import kotlinx.coroutines.launch

class AddNoteFragmentViewModel(application: Application):AndroidViewModel(application) {

    var readAllNotes:LiveData<List<NoteModel>>
    private var noteDao: NoteDao
    private var repository:NoteRepository

    init {
        noteDao = NoteDatabase.getDatabase(application).noteDao()
        repository = NoteRepository(noteDao)
        readAllNotes = noteDao.getAllNotes()
    }

    fun AddNoteFunc(noteTitle:String,noteDescription:String){

        val myNoteModel = NoteModel(1,noteTitle,noteDescription)
        viewModelScope.launch {

            repository.addNote(myNoteModel)

        }

    }

    fun viewModelGetAllNotes(){
        viewModelScope.launch {
            noteDao.getAllNotes()
        }
    }

}