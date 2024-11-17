package com.cpodewithadriana.generadorderecetas

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Conecta con activity_main.xml

        // Conectamos los elementos del diseño con el código
        val inputIngredients = findViewById<EditText>(R.id.inputIngredients)
        val buttonSearch = findViewById<Button>(R.id.buttonSearch)

        // Configuramos el botón para mostrar los ingredientes ingresados
        buttonSearch.setOnClickListener {
            val ingredients = inputIngredients.text.toString()
            if (ingredients.isEmpty()) {
                Toast.makeText(this, "Por favor ingresa ingredientes", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Buscando recetas con: $ingredients", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
