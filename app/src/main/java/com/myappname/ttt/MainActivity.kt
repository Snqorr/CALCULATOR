package com.myappname.ttt

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private lateinit var etOne : EditText
    private lateinit var etTwo : EditText
    private lateinit var submitBtn : Button
    private lateinit var resultTv : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etOne = findViewById(R.id.etOne)
        etTwo = findViewById(R.id.etTwo)
        submitBtn = findViewById(R.id.btnOne)
        resultTv = findViewById(R.id.textViewResults)

        submitBtn.setOnClickListener {
            clicker(etOne.getText().toString().toInt(), etTwo.getText().toString().toInt())
            resultTv.text = clicker(etOne.getText().toString().toInt(), etTwo.getText().toString().toInt()).toString()
        }
    }

    fun clicker(int: Int, int1: Int): Int {
        var sum = int + int1
        Log.d("sum", sum.toString())
        return sum
    }
}