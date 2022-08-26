package com.example.noteappwithroom.ViewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.noteappwithroom.Models.NoteModel

class HomeFragmentViewModel : ViewModel() {

    private val modelList:MutableLiveData<List<NoteModel>> = MutableLiveData()

    fun setModelListForRecyclerView(){

        val deneme1 = NoteModel(1,"deneme1","destlşsdjda")
        val deneme2 = NoteModel(1,"deneme2","destlşsdjda")
        val deneme3 = NoteModel(1,"deneme3","destlşsdjda")

        val denemeList = arrayListOf<NoteModel>(deneme1,deneme2,deneme3)

        modelList.postValue(denemeList)

    }

    fun getModelList():LiveData<List<NoteModel>>{
        return modelList
    }

}