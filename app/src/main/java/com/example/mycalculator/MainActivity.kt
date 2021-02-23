package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a: String = ""
        var list = mutableListOf<String>()
        var b: Long = 0L
        var c: Long = 1L
        var d: Double = 1.0
        val allResult = findViewById<EditText>(R.id.all_result)

        findViewById<Button>(R.id.num1).setOnClickListener {
            allResult.text = allResult.text.append("1")
            a = allResult.text.toString()
        }

        findViewById<Button>(R.id.num2).setOnClickListener {
            allResult.text = allResult.text.append("2")
            a = allResult.text.toString()
        }

        findViewById<Button>(R.id.num3).setOnClickListener {
            allResult.text = allResult.text.append("3")
            a = allResult.text.toString()
        }

        findViewById<Button>(R.id.num4).setOnClickListener {
            allResult.text = allResult.text.append("4")
            a = allResult.text.toString()
        }

        findViewById<Button>(R.id.num5).setOnClickListener {
            allResult.text = allResult.text.append("5")
            a = allResult.text.toString()
        }

        findViewById<Button>(R.id.num6).setOnClickListener {
            allResult.text = allResult.text.append("6")
            a = allResult.text.toString()
        }

        findViewById<Button>(R.id.num7).setOnClickListener {
            allResult.text = allResult.text.append("7")
            a = allResult.text.toString()
        }

        findViewById<Button>(R.id.num8).setOnClickListener {
            allResult.text = allResult.text.append("8")
            a = allResult.text.toString()
        }

        findViewById<Button>(R.id.num9).setOnClickListener {
            allResult.text = allResult.text.append("9")
            a = allResult.text.toString()
        }

        findViewById<Button>(R.id.num0).setOnClickListener {
            allResult.text = allResult.text.append("0")
            a = allResult.text.toString()
        }

    }
}