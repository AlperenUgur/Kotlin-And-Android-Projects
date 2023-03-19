package com.example.kotlinogreniyorum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("132")


        val number1 = 12.5
        val number2 = 3.5
        var result: Double

        result = number1 + number2
        println("number1 + number2 = $result")

        result = number1 - number2
        println("number1 - number2 = $result")

        result = number1 * number2
        println("number1 * number2 = $result")

        result = number1 / number2
        println("number1 / number2 = $result")

        result = number1 % number2
        println("number1 % number2 = $result")

    }

}