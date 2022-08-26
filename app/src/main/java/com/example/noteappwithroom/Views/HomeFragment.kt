package com.example.noteappwithroom.Views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.noteappwithroom.Adapters.RecyclerViewAdapter
import com.example.noteappwithroom.Models.NoteModel
import com.example.noteappwithroom.ViewModels.AddNoteFragmentViewModel
import com.example.noteappwithroom.ViewModels.HomeFragmentViewModel
import com.example.noteappwithroom.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    lateinit var binding:FragmentHomeBinding
    lateinit var adapter: RecyclerViewAdapter
    lateinit var modelList: ArrayList<NoteModel>
    lateinit var addNoteViewModel:AddNoteFragmentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("Home Fragment oluştu")

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

        addNoteViewModel = ViewModelProvider(this).get(AddNoteFragmentViewModel::class.java)


        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        adapter = RecyclerViewAdapter()
        binding.HomeFragmentRecyclerView.adapter = adapter
        binding.HomeFragmentRecyclerView.layoutManager = LinearLayoutManager(context)

        addNoteViewModel.readAllNotes.observe(viewLifecycleOwner,Observer {
            adapter.setData(it)
            if (it.isEmpty()){
                Toast.makeText(context, "Liste Boş", Toast.LENGTH_SHORT).show()
            }
        })


    }


}