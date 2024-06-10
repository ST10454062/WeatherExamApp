package com.example.st10454062.weatherexamapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val dates = ArrayList<String>()
    private val minTemperatures = ArrayList<Int>()
    private val maxTemperatures = ArrayList<Int>()
    private val weatherConditions = ArrayList<String>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dateEditText = findViewById<EditText>(R.id.dateEditText)
        val minTemperatureEditText = findViewById<EditText>(R.id.minTemperatureEditText)
        val maxTemperatureEditText = findViewById<EditText>(R.id.maxTemperatureEditText)
        val weatherConditionsEditText = findViewById<EditText>(R.id.weatherConditionsEditText)
        val saveBtn = findViewById<Button>(R.id.saveBtn)
        val clearBtn = findViewById<Button>(R.id.clearBtn)
        val viewDetailsBtn = findViewById<Button>(R.id.viewDetailsBtn)
        val exitButton = findViewById<Button>(R.id.exitButton)
        val averageTemperatureTextView = findViewById<TextView>(R.id.averageTemperatureTextView)

        //the save button wil save all the data you input
        saveBtn.setOnClickListener {
            val date = dateEditText.text.toString()
            val minTemperature = minTemperatureEditText.text.toString().toIntOrNull()
            val maxTemperature = maxTemperatureEditText.text.toString().toIntOrNull()
            val weatherCondition = weatherConditionsEditText.text.toString()
            var totalTemperature = 0

            if (date.isNotEmpty() && minTemperature != null && maxTemperature != null && weatherCondition.isNotEmpty()) {
                dates.add(date)
                minTemperatures.add(minTemperature)
                maxTemperatures.add(maxTemperature)
                weatherConditions.add(weatherCondition)
                Toast.makeText(this, "Data Added", Toast.LENGTH_SHORT).show()
                clearFields(
                    dateEditText,
                    minTemperatureEditText,
                    maxTemperatureEditText,
                    weatherConditionsEditText
                )
            } else {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
            //calulating the average temperature of the week
            for (i in dates.indices) {
                var averageTemperature = minTemperatures[i] + maxTemperatures[i]
                totalTemperature += averageTemperature
            }
            //displaying the average temperature
            val averageTemperature = if (dates.isNotEmpty()) totalTemperature / dates.size else 0
            averageTemperatureTextView.text = "Average Temperature: $averageTemperature C"
        }
        //the clear button will clear all the data that is input
        clearBtn.setOnClickListener {
            clearFields(
                dateEditText,
                minTemperatureEditText,
                maxTemperatureEditText,
                weatherConditionsEditText
            )
        }
        //the viewdetails button will direct you to the detailsviewscreen and take all the information
        viewDetailsBtn.setOnClickListener {
            val intent = Intent(this, DetailedView::class.java)
            intent.putStringArrayListExtra("dates", dates)
            intent.putIntegerArrayListExtra("maximum Temperature", minTemperatures)
            intent.putIntegerArrayListExtra("minimum Temperature", maxTemperatures)
            intent.putStringArrayListExtra("Weather Conditions", weatherConditions)
            startActivity(intent)
        }
        //this button will exit the app
        exitButton.setOnClickListener {
            finish()
        }
    }
    private fun clearFields(vararg fields: EditText) {
        for (field in fields) {
            field.text.clear()
        }
    }
}