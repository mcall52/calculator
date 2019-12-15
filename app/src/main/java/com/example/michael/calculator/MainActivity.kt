package com.example.michael.calculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputText = findViewById<TextView>(R.id.equation)

        val addCharToEquation = View.OnClickListener { view ->
            if(view is Button) {
                if (inputText.text == "0") {
                    inputText.text = view.text
                } else {
                    inputText.append(view.text)
                }
            }
        }

        val addOperationToEquation = View.OnClickListener { view ->
            if (view is Button) {
                if (inputText.text != "0") {
                    inputText.append(view.text)
                    //split into 2 parts

                }
            }
        }

        val evaluate = null

        val butt9 = findViewById<Button>(R.id.nine)
        butt9.setOnClickListener(addCharToEquation)
        val butt8 = findViewById<Button>(R.id.eight)
        butt8.setOnClickListener(addCharToEquation)
        val butt7 = findViewById<Button>(R.id.seven)
        butt7.setOnClickListener(addCharToEquation)
        val butt6 = findViewById<Button>(R.id.six)
        butt6.setOnClickListener(addCharToEquation)
        val butt5 = findViewById<Button>(R.id.five)
        butt5.setOnClickListener(addCharToEquation)
        val butt4 = findViewById<Button>(R.id.four)
        butt4.setOnClickListener(addCharToEquation)
        val butt3 = findViewById<Button>(R.id.three)
        butt3.setOnClickListener(addCharToEquation)
        val butt2 = findViewById<Button>(R.id.two)
        butt2.setOnClickListener(addCharToEquation)
        val butt1 = findViewById<Button>(R.id.one)
        butt1.setOnClickListener(addCharToEquation)
        val butt0 = findViewById<Button>(R.id.zero)
        butt0.setOnClickListener(addCharToEquation)
        val buttDot = findViewById<Button>(R.id.decimal)
        buttDot.setOnClickListener(addCharToEquation)

        val buttPlus = findViewById<Button>(R.id.plus)
        buttPlus.setOnClickListener(addOperationToEquation)
        val buttMinus = findViewById<Button>(R.id.minus)
        buttMinus.setOnClickListener(addOperationToEquation)
        val buttTimes = findViewById<Button>(R.id.multiply)
        buttTimes.setOnClickListener(addOperationToEquation)
        val buttDivide = findViewById<Button>(R.id.divide)
        buttDivide.setOnClickListener(addOperationToEquation)
        val buttEquals = findViewById<Button>(R.id.equals)
        val buttBackspace = findViewById<Button>(R.id.delete)
        buttBackspace.setOnClickListener {
            if(inputText.text != "") {
                inputText.text = inputText.text.dropLast(1)
            }
        }
        buttBackspace.setOnLongClickListener {
             inputText.text = ""
            true
        }
    }

//    fun appendToEquation


}