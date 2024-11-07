package com.example.pdm_clase2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnEnviar = findViewById<Button>(R.id.buttonEnviar)




        btnEnviar.setOnClickListener {

            Log.i("Etiqueta","Se ha enviado")
            val txtEdit = findViewById<EditText>(R.id.textEdit)
            val texto = txtEdit.text.toString()
            Log.i("Etiqueta", txtEdit.text.toString())


            //Enviar
            val intento = Intent(this, activityResultado::class.java)
            intento.putExtra("EXTRA_NAME",texto)
            Log.i("Etiqueta","$intento")

            startActivity(intento)


        }

    }
}