package edu.co.icesi.semana3kotlinb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    private lateinit var simplelist: ListView
    private lateinit var adapter: ArrayAdapter<String>
    private lateinit var planetas: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        simplelist = findViewById(R.id.simplelist)

        planetas = ArrayList();
        planetas.add("Mercurio")
        planetas.add("Venus")
        planetas.add("Tierra")
        planetas.add("Marte")
        planetas.add("Jupiter")
        planetas.add("Saturno")
        planetas.add("Urano")
        planetas.add("Neptuno")

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, planetas)
        simplelist.adapter = adapter;

        simplelist.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, planetas[position], Toast.LENGTH_SHORT).show()
        }
    }
}