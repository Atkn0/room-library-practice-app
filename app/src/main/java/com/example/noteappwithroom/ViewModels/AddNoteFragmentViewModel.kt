package com.example.noteappwithroom.ViewModels

import androidx.lifecycle.ViewModel
import com.example.noteappwithroom.Models.NoteModel

class AddNoteFragmentViewModel:ViewModel() {

    fun createNoteModel(noteTitle:String,noteDescription:String){

        val myNoteModel = NoteModel(noteTitle,noteDescription)



    }

}