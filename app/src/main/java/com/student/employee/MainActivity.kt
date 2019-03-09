package com.student.employee

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val btnEmpl = findViewById<Button>(R.id.btnEmpl)

        btnEmpl.setOnClickListener(View.OnClickListener {

            //create employee
            val empl1 = Empl("0507497", "Barry Nailor", "Rockford")
            val intent = Intent(this,Main2Activity::class.java)

            intent.putExtra("EmplInfo",empl1.allData)

            startActivity(intent)


        })
    }
}
