package com.example.accordiontunnerhelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner

public class MainActivity : AppCompatActivity()
{



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val mySpinner = findViewById<View>(R.id.initialNoteSpinner) as Spinner;

        mySpinner.adapter =
            ArrayAdapter<Tone>(this, R.layout.initial_note_spinner, Tone.values());








    }
}