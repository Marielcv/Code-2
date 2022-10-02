package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class ListViewApp : AppCompatActivity() {
    private var lvLenguajes:ListView?=null
    private var tvSeleccion:TextView?=null

    private val lenguajes = arrayOf("Kotlin","Java","C#","C++","PHP","VB.Net")
    private val posiciones = arrayOf("1","3","6","4","2","5")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lvLenguajes = findViewById(R.id.etn_Valor1)
        tvSeleccion = findViewById(R.id.etn_Valor2)

        var adaptador:ArrayAdapter<String> = ArrayAdapter<String>(this,R.layout.activity_main,lenguajes)
        lvLenguajes?.adapter=adaptador

        lvLenguajes?.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick( parent: AdapterView<*>?, view: View?, position: Int,      id: Long
            ) {
                tvSeleccion?.text = "La posición del lenguaje ${lvLenguajes?.getItemAtPosition(position)} es ${posiciones[position]}"
            }


        }

    }
}

