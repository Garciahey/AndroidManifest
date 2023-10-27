package com.example.androidmanifest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var  textViewEtiqueta: TextView
    lateinit var editTextNombre: EditText

    lateinit var nombre:String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// la clase R asigna una variable al numero entero
        textViewEtiqueta=findViewById(R.id.TextView)
        editTextNombre=findViewById(R.id.editTextText)


    }


    override fun onStart(){
        super.onStart()
    }



    override fun onRestart() {
        super.onRestart()
    }

    override fun onResume() {
        super.onResume()

    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }


    fun onCambierTexto(){
      nombre = editTextNombre.text.toString();0
        textViewEtiqueta.text="hola" + nombre;


        var mi_intent=Intent(this,secondActivity::class.java)
        startActivity(mi_intent)








        // como hacemos para pasar un dato a la segunda

       // dentro de  intent meter la
    }












}