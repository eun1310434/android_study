package com.companyname.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number = 0//ㅁㄴㅇㄻㄴㅇㄻㄴㅇㄻㄴㅇㄹ
        var number = 0

        val test = findViewById<TextView>(R.id.test)
        test.setText(number.toString())

        val smile = findViewById<ImageView>(R.id.smile)
        smile.setOnClickListener {
            number = number + 1
            test.setText(number.toString())
        }

        val sad = findViewById<ImageView>(R.id.sad)
        sad.setOnClickListener {
            test.setText("sad")
            //hallo welt. 정은택
        }

        //another test2 정은택 입니다.
    }

}