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

        findBeer.setOnClickListener {
            val color = beerColor.selectedItem.toString()
            val beerList = getBeers(color)
            val beers = beerList.reduce { str, item -> str + '\n' + item }
            brands.text = beers

        }
    }

    fun getBeers(color: String): List<String> {
        return when (color) {
            "Light" -> listOf("Jail Pale Ale", "Lager Lite")
            "Amber" -> listOf("Jack Amber", "Red Moose")
            "Brown" -> listOf("Brown Bear Beer", "Bock Brownie")
            else -> listOf("Gout Stout", "Dark Daniel")
        }
    }
}