package com.example.alarmaapp.actividades

import com.example.alarmaapp.R

object Constantes {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getPreguntas(): ArrayList<Pregunta>{
        val preguntasList = ArrayList<Pregunta>()

        val que1 = Pregunta(1, "¿De qué país es la bandera?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1
        )
        preguntasList.add(que1)

        val que2 = Pregunta(2, "¿De qué país es la bandera?",
            R.drawable.ic_flag_of_belgium,
            "Alemania",
            "Belgica",
            "Francia",
            "Holanda",
            2
        )
        preguntasList.add(que2)

        val que3 = Pregunta(3, "¿De qué país es la bandera?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia",
            "India",
            "Austria",
            "Nueva Zelanda",
            4
        )
        preguntasList.add(que3)

        return preguntasList
    }
}