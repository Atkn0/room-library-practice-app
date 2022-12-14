package com.example.noteappwithroom.Views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.noteappwithroom.Adapters.RecyclerViewAdapter
import com.example.noteappwithroom.Models.NoteModel
import com.example.noteappwithroom.ViewModels.HomeFragmentViewModel
import com.example.noteappwithroom.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    lateinit var binding:FragmentHomeBinding
    lateinit var adapter: RecyclerViewAdapter
    lateinit var modelList: ArrayList<NoteModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val testingModel: HomeFragmentViewModel= HomeFragmentViewModel()

        val testingModelList = testingModel.getModelList().observe(this,Observer<List<NoteModel>>{
            println(it)
        })


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentHomeBinding.inflate(inflater,container,false)
        val view = binding.root

        adapter = RecyclerViewAdapter()
        binding.HomeFragmentRecyclerView.adapter = adapter
        binding.HomeFragmentRecyclerView.layoutManager = LinearLayoutManager(context)

        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




    }


}