package com.example.alarmaapp.actividades

import com.example.alarmaapp.R

object Constantes {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"



    fun getPreguntasCategoria1(): ArrayList<Pregunta>{
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

    fun getPreguntasCategoria2(): ArrayList<Pregunta>{
        val preguntasList2 = ArrayList<Pregunta>()

        val que1 = Pregunta(1, "¿Pregunta 1, categoria 2?",
            R.drawable.ic_flag_of_argentina,
            "opcion 1",
            "opcion 2",
            "opcion 3",
            "opcion 4",
            2
        )
        preguntasList2.add(que1)

        val que2 = Pregunta(2, "¿Pregunta 2, categoria 2?",
            R.drawable.ic_flag_of_belgium,
            "opcion 1",
            "opcion 2",
            "opcion 3",
            "opcion 4",
            4
        )
        preguntasList2.add(que2)

        val que3 = Pregunta(3, "¿Pregunta 3, categoria 2?",
            R.drawable.ic_flag_of_new_zealand,
            "opcion 1",
            "opcion 2",
            "opcion 3",
            "opcion 4",
            1
        )
        preguntasList2.add(que3)

        return preguntasList2
    }

    fun getPreguntasCategoria3(): ArrayList<Pregunta>{
        val preguntasList3 = ArrayList<Pregunta>()

        val que1 = Pregunta(1, "¿Pregunta 1, categoria 3?",
            R.drawable.ic_flag_of_argentina,
            "opcion 1",
            "opcion 2",
            "opcion 3",
            "opcion 4",
            4
        )
        preguntasList3.add(que1)

        val que2 = Pregunta(2, "¿Pregunta 2, categoria 3?",
            R.drawable.ic_flag_of_belgium,
            "opcion 1",
            "opcion 2",
            "opcion 3",
            "opcion 4",
            1
        )
        preguntasList3.add(que2)

        val que3 = Pregunta(3, "¿Pregunta 3, categoria 3?",
            R.drawable.ic_flag_of_new_zealand,
            "opcion 1",
            "opcion 2",
            "opcion 3",
            "opcion 4",
            3
        )
        preguntasList3.add(que3)

        return preguntasList3
    }
}