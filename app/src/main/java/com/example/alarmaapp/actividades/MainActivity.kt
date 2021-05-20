package com.example.alarmaapp.actividades
import android.app.*
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.alarmaapp.R
import com.example.alarmaapp.adaptadores.AlarmasAdapter
import com.example.alarmaapp.basedatos.AppDataBase
import com.example.alarmaapp.modelos.Alarma
import com.example.alarmaapp.utils.AlarmasUtils
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)

        val btn_click_me = findViewById(R.id.button1) as Button
        btn_click_me.setOnClickListener {
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, AlarmasActivity::class.java).apply {
            }
            startActivity(intent)
        }
    }

    //fun alarmas(view: View) {
       // val intent = Intent(this, AlarmasActivity::class.java).apply {
      //  }
      //  startActivity(intent)
  //  }


}