package com.example.michael.calculator

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.example.michael.calculator.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val butt_9 = findViewById<Button>(R.id.nine)
        val butt_8 = findViewById<Button>(R.id.eight)
        val butt_7 = findViewById<Button>(R.id.seven)
        val butt_6 = findViewById<Button>(R.id.six)
        val butt_5 = findViewById<Button>(R.id.five)
        val butt_4 = findViewById<Button>(R.id.four)
        val butt_3 = findViewById<Button>(R.id.three)
        val butt_2 = findViewById<Button>(R.id.two)
        val butt_1 = findViewById<Button>(R.id.one)
        val butt_0 = findViewById<Button>(R.id.zero)

        val butt_plus = findViewById<Button>(R.id.plus)
        val butt_minus = findViewById<Button>(R.id.eight)
        val butt_times = findViewById<Button>(R.id.eight)
        val butt_divide = findViewById<Button>(R.id.eight)
        val butt_equals = findViewById<Button>(R.id.eight)
        val butt_dot = findViewById<Button>(R.id.eight)

    }
}