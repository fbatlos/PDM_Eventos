package com.example.pdm_clase2

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import java.util.Random

class activityResultado : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.vista2)
        val textoRes = findViewById<AppCompatTextView>(R.id.txtfinal)

        val nombre = intent.extras?.getString("EXTRA_NAME").orEmpty()

        textoRes.setText( "Hola $nombre")

        val cambiaFondo = findViewById<Button>(R.id.botonCambio)

        cambiaFondo.setOnClickListener {
            val vista2 = findViewById<ConstraintLayout>(R.id.allvista2)
            vista2.setBackgroundColor(colorAleatorio())
        }
    }
}

fun colorAleatorio(): Int {
    val r: Random = Random()
    val red: Int = r.nextInt(256)
    val green: Int = r.nextInt(256)
    val blue: Int = r.nextInt(256)
    return Color.rgb(red, green, blue)

}




