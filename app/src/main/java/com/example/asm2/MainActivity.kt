package com.example.asm2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spinnerVal : Spinner = findViewById(R.id.spinner)
        var options = arrayOf("beef burger","cheese burger","grand chicken","chicken Mac")
        spinnerVal.adapter =
            ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options )
    }
}