package com.example.noteappwithroom.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.noteappwithroom.Models.NoteModel
import com.example.noteappwithroom.databinding.NoteCardLayoutBinding

class RecyclerViewAdapter():RecyclerView.Adapter<RecyclerViewAdapter.myClassViewHolder>(){

    private var noteList = emptyList<NoteModel>()

    class myClassViewHolder(val binding: NoteCardLayoutBinding) :RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myClassViewHolder {
        val binding = NoteCardLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return myClassViewHolder(binding)
    }

    override fun onBindViewHolder(holder: myClassViewHolder, position: Int) {
        holder.binding.NoteCardLayoutId

    }

    override fun getItemCount(): Int {
        return 15
    }


    fun setData(noteList:List<NoteModel>){
        this.noteList = noteList
        notifyDataSetChanged()

    }



}