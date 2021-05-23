package com.example.alarmaapp.actividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.alarmaapp.R
import kotlinx.android.synthetic.main.activity_result.*
import kotlinx.android.synthetic.main.inicioquiz.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val username = intent.getStringExtra(Constantes.USER_NAME)
        tv_name.text = username
        val totalQuestions = intent.getIntExtra(Constantes.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constantes.CORRECT_ANSWERS, 0)

        tv_score.text = "Puntuación: $correctAnswers de $totalQuestions"

        btn_finish.setOnClickListener{
            intent.putExtra(Constantes.USER_NAME, username)
            startActivity(Intent(this, CategoriasActivity::class.java))

            //finish()
        }
        btn_inicio.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}