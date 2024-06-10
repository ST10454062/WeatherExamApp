package com.example.st10454062.weatherexamapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class DetailedView : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view)

        val dates = intent.getStringArrayListExtra("dates") ?: arrayListOf()
        val minTemperatures = intent.getIntegerArrayListExtra("minTemperatures") ?: arrayListOf()
        val maxTemperatures = intent.getIntegerArrayListExtra("maxTemperatures") ?: arrayListOf()
        val weatherConditions = intent.getStringArrayListExtra("weatherConditions") ?: arrayListOf()
        val dataTextView = findViewById<TextView>(R.id.dataTextView)
        var displayText = ""

        val backBtn = findViewById<Button>(R.id.backBtn)
        //this loop will get all the information
        for (i in dates.indices) {
            displayText += "${dates[i]}, ${minTemperatures[i]} C, ${maxTemperatures[i]} C, ${weatherConditions[i]}\n\n"
        }
        //displaying all the data
        dataTextView.text = displayText

        //back button takes you to splashscreen
        backBtn.setOnClickListener {
            val intent = Intent(this, SplashScreen::class.java)
            startActivity(intent)
        }

    }
}

