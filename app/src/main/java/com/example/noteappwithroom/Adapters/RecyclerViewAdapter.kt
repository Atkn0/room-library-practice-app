package com.example.noteappwithroom.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.noteappwithroom.databinding.NoteCardLayoutBinding

class RecyclerViewAdapter():RecyclerView.Adapter<RecyclerViewAdapter.myClassViewHolder>(){
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


    fun deleteItemFunct(posi:Int){


    }

}