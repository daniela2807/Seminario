package com.example.alarmaapp.actividades

data class Pregunta (
    val id: Int,
    val pregunta: String,
    val imagen: Int,
    val opcionUno: String,
    val opcionDos: String,
    val opcionTres: String,
    val opcionCuatro: String,
    val RespCorrecta: Int
)