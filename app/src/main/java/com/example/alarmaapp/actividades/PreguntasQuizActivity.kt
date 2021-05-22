package com.example.alarmaapp.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.alarmaapp.R

class PreguntasQuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preguntas_quiz)

        val preguntasList = Constantes.getPreguntas()
        Log.i("Total de preguntas:", "${preguntasList.size}")
    }
}