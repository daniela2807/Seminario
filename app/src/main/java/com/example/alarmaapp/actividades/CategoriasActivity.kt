package com.example.alarmaapp.actividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import com.example.alarmaapp.R
import kotlinx.android.synthetic.main.inicioquiz.*

class CategoriasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categorias)

        val username = intent.getStringExtra(Constantes.USER_NAME)



        val catAnimales = findViewById(R.id.btn_catAnimales) as Button
        catAnimales.setOnClickListener {
            val intent = Intent(this, PreguntasQuizActivity::class.java)
            intent.putExtra(Constantes.USER_NAME, username)
            startActivity(intent)
            finish()
        }

        val catObjetos = findViewById(R.id.btn_catObjetos) as Button
        catObjetos.setOnClickListener{
            val intent = Intent(this, PreguntasQuiz2Activity::class.java)
            intent.putExtra(Constantes.USER_NAME, username)
            startActivity(intent)
            finish()
        }

        val catHoras = findViewById(R.id.btn_catHoras) as Button
        catHoras.setOnClickListener {
            val intent = Intent(this, PreguntasQuiz3Activity::class.java)
            intent.putExtra(Constantes.USER_NAME, username)
            startActivity(intent)
            finish()
        }
    }
}