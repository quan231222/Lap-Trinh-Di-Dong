package com.example.laptrinhdidong

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btncong.setOnClickListener {
            var kqua : Double = (Number1.text.toString()).toDouble() + (Number2.text.toString()).toDouble()
            Result.text = kqua.toString()
        }
        btntru.setOnClickListener {
            var kqua : Double = (Number1.text.toString()).toDouble() - (Number2.text.toString()).toDouble()
            Result.text = kqua.toString()
        }
        btnnhan.setOnClickListener {
            var kqua : Double = (Number1.text.toString()).toDouble() * (Number2.text.toString()).toDouble()
            Result.text = kqua.toString()
        }
        btnchia.setOnClickListener {
            var kqua : Double = (Number1.text.toString()).toDouble() / (Number2.text.toString()).toDouble()
            Result.text = kqua.toString()
        }
    }
}