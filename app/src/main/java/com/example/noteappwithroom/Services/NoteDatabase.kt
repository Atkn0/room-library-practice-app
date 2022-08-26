package com.example.noteappwithroom.Services

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.noteappwithroom.Models.NoteModel


@Database(entities = [NoteModel::class], version = 2)
abstract class NoteDatabase : RoomDatabase() {

    abstract fun noteDao() : NoteDao


    companion object{
        @Volatile private var instance : NoteDatabase? = null

        fun getDatabase(context: Context):NoteDatabase{
            var tempInstance = instance
            if (tempInstance!=null){
                return tempInstance
            }
            val lock = Any()
            synchronized(lock){
                val instance = Room.databaseBuilder(context,NoteDatabase::class.java,"note_database").fallbackToDestructiveMigration().build()
                tempInstance = instance
                return instance
            }



        }
    }

}