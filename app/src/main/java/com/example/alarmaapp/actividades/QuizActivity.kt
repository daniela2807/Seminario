package com.example.alarmaapp.actividades

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.alarmaapp.R
import kotlinx.android.synthetic.main.inicioquiz.*


class QuizActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicioquiz)

        val empezar = findViewById(R.id.btn_empezar) as Button
        empezar.setOnClickListener {
            if(et_nombre.text.toString().isEmpty()){
                Toast.makeText(this,
                "INGRESA TU NOMBRE", Toast.LENGTH_SHORT).show()
            }else {
                val intent = Intent(this, CategoriasActivity::class.java)
                intent.putExtra(Constantes.USER_NAME, et_nombre.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}