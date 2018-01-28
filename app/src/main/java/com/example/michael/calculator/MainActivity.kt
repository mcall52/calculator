package com.example.michael.calculator

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.michael.calculator.R
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputText = findViewById<TextView>(R.id.equation)

        val addCharToEquation = View.OnClickListener { view ->
            if(view is Button) {
                if (inputText.text.equals("0")) {
                    inputText.setText(view.text)
                } else {
                    inputText.append(view.text)
                }
            }
        }

        val butt_9 = findViewById<Button>(R.id.nine)
        butt_9.setOnClickListener(addCharToEquation)
        val butt_8 = findViewById<Button>(R.id.eight)
        butt_8.setOnClickListener(addCharToEquation)
        val butt_7 = findViewById<Button>(R.id.seven)
        butt_7.setOnClickListener(addCharToEquation)
        val butt_6 = findViewById<Button>(R.id.six)
        butt_6.setOnClickListener(addCharToEquation)
        val butt_5 = findViewById<Button>(R.id.five)
        butt_5.setOnClickListener(addCharToEquation)
        val butt_4 = findViewById<Button>(R.id.four)
        butt_4.setOnClickListener(addCharToEquation)
        val butt_3 = findViewById<Button>(R.id.three)
        butt_3.setOnClickListener(addCharToEquation)
        val butt_2 = findViewById<Button>(R.id.two)
        butt_2.setOnClickListener(addCharToEquation)
        val butt_1 = findViewById<Button>(R.id.one)
        butt_1.setOnClickListener(addCharToEquation)
        val butt_0 = findViewById<Button>(R.id.zero)
        butt_0.setOnClickListener(addCharToEquation)
        val butt_dot = findViewById<Button>(R.id.decimal)
        butt_dot.setOnClickListener(addCharToEquation)

        val butt_plus = findViewById<Button>(R.id.plus)
        val butt_minus = findViewById<Button>(R.id.minus)
        val butt_times = findViewById<Button>(R.id.multiply)
        val butt_divide = findViewById<Button>(R.id.divide)
        val butt_equals = findViewById<Button>(R.id.equals)
        val butt_backspace = findViewById<Button>(R.id.delete)
        butt_backspace.setOnClickListener{ button ->
            if(inputText.text.equals("0")){
                //nothing
            } else {
                inputText.setText(inputText.text.dropLast(1) as CharSequence)
            }
        }


    }

//    fun appendToEquation


}