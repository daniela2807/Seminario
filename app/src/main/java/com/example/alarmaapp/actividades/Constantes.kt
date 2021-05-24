package com.example.alarmaapp.actividades

import com.example.alarmaapp.R

object Constantes {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"



    fun getPreguntasCategoria1(): ArrayList<Pregunta>{
        val preguntasList = ArrayList<Pregunta>()

        val que1 = Pregunta(1, "¿Cómo se llama esta animal?",
            R.drawable.perro,
            "Vaca",
            "Gato",
            "Perro",
            "Serpiente",
            3
        )
        preguntasList.add(que1)

        val que2 = Pregunta(2, "¿Qué produce este animal?",
            R.drawable.vaca,
            "Leche",
            "Veneno",
            "Miel",
            "Lana",
            1
        )
        preguntasList.add(que2)

        val que3 = Pregunta(3, "¿Dónde vive este animal?",
            R.drawable.caballo,
            "Selva",
            "Mar",
            "Granja",
            "Desierto",
            3
        )
        preguntasList.add(que3)

        val que4 = Pregunta(4, "¿Comó se llama este animal?",
            R.drawable.gato,
            "Hamster",
            "Gato",
            "Iguana",
            "Gallina",
            2
        )
        preguntasList.add(que4)

        val que5 = Pregunta(5, "¿Dónde vive este animal?",
            R.drawable.leon,
            "Granja",
            "Mar",
            "Selva",
            "Desierto",
            3
        )
        preguntasList.add(que5)

        val que6 = Pregunta(6, "¿Qué come este animal?",
            R.drawable.rana,
            "Insectos",
            "Carne",
            "Hierba",
            "Cereales",
            1
        )
        preguntasList.add(que6)

        return preguntasList
    }

    fun getPreguntasCategoria2(): ArrayList<Pregunta>{
        val preguntasList2 = ArrayList<Pregunta>()

        val que1 = Pregunta(1, "¿Comó se llama este objeto?",
            R.drawable.calzoncillo,
            "Corbata",
            "Calzoncillo",
            "Calcetines",
            "Guantes",
            2
        )
        preguntasList2.add(que1)

        val que2 = Pregunta(2, "¿Comó se llama este objeto?",
            R.drawable.refrigerador,
            "Microondas",
            "Licuadora",
            "Apiradora",
            "Refrigerador",
            4
        )
        preguntasList2.add(que2)

        val que3 = Pregunta(3, "¿Comó se llama este objeto?",
            R.drawable.cama,
            "Cama",
            "Sillon",
            "Television",
            "Mesa",
            1
        )
        preguntasList2.add(que3)

        val que4 = Pregunta(4, "¿Comó se llama este objeto?",
            R.drawable.cuchara,
            "Tenedor",
            "Pela Papas",
            "Cuchara",
            "Pasta de Dientes",
            3
        )
        preguntasList2.add(que4)

        val que5 = Pregunta(5, "¿Cómo se llama este objeto?",
            R.drawable.chamarra,
            "Pantalones",
            "Gorro",
            "Chamarra",
            "Zapatos",
            3
        )
        preguntasList2.add(que5)

        val que6 = Pregunta(6, "¿Cómo se llama este objeto?",
            R.drawable.despertador,
            "Despertador",
            "Alfombra",
            "Pañuelo",
            "Audifonos",
            1
        )
        preguntasList2.add(que6)

        return preguntasList2
    }

    fun getPreguntasCategoria3(): ArrayList<Pregunta>{
        val preguntasList3 = ArrayList<Pregunta>()

        val que1 = Pregunta(1, "¿Qué hora es?",
            R.drawable.hora1,
            "12:05",
            "10:30",
            "12:30",
            "1:00",
            1
        )
        preguntasList3.add(que1)

        val que2 = Pregunta(2, "¿Qué hora es?",
            R.drawable.hora2,
            "1:10",
            "1:45",
            "9:10",
            "4:30",
            2
        )
        preguntasList3.add(que2)

        val que3 = Pregunta(3, "¿Qué hora es?",
            R.drawable.hora3,
            "3:00",
            "2:00",
            "6:20",
            "2:30",
            4
        )
        preguntasList3.add(que3)

        val que4 = Pregunta(4, "¿Qué hora es?",
            R.drawable.hora4,
            "6:10",
            "10:00",
            "10:30",
            "6:45",
            3
        )
        preguntasList3.add(que4)

        val que5 = Pregunta(5, "¿Qué hora es?",
            R.drawable.hora5,
            "4:00",
            "12:40",
            "4:10",
            "12:00",
            1
        )
        preguntasList3.add(que5)

        val que6 = Pregunta(6, "¿Qué hora es?",
            R.drawable.hora6,
            "3:45",
            "4:30",
            "7:15",
            "7:00",
            3
        )
        preguntasList3.add(que6)

        return preguntasList3
    }
}