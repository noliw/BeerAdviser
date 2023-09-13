package com.codecademy.beeradviser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

// each time a user does something in the app its called an event
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val findBeer = findViewById<Button>(R.id.findBeer_btn)
        val brands = findViewById<TextView>(R.id.brands_tv)
        val beerColor = findViewById<Spinner>(R.id.beerColor_sp)

        findBeer.setOnClickListener{
            val color = beerColor.selectedItem.toString()
            brands.text = "Beer color is $color"

        }
    }
}