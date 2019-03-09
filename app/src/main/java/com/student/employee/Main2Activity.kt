package com.student.employee

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val txtInfo = findViewById<TextView>(R.id.txtDetails)

        var details: String = intent.getStringExtra("EmplInfo")

        txtInfo.text = details
    }
}
