package com.example.alarmaapp.actividades
import android.app.*
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
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
    }

    fun Alarmas(btn: View) {

        startActivityForResult(
            Intent(this, AlarmasActivity::class.java),
            COD_CREAR_ALARMA
        )
    }
}