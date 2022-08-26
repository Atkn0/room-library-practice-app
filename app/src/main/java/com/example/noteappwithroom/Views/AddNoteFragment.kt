package com.example.noteappwithroom.Views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.noteappwithroom.R
import com.example.noteappwithroom.ViewModels.AddNoteFragmentViewModel
import com.example.noteappwithroom.databinding.FragmentAddNoteBinding


class AddNoteFragment : Fragment() {

    lateinit var binding: FragmentAddNoteBinding
    private lateinit var noteTitle:String
    private lateinit var noteDescript:String
    lateinit var myViewModel:AddNoteFragmentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("Note fragment Oluştu")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAddNoteBinding.inflate(inflater,container,false)
        val view = binding.root

        myViewModel = ViewModelProvider(this).get(AddNoteFragmentViewModel::class.java)



        binding.AddNoteButton.setOnClickListener {

            noteTitle = binding.NoteTitleEditText.text.toString()
            noteDescript = binding.DescriptionEditText.text.toString()

            myViewModel.createNoteModel(noteTitle,noteDescript)
            activity?.onBackPressed()
            println("Note Fragment Kapatıldı")

        }


        return view

    }


}