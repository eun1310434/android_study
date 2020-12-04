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
            //hallo welt. 정은택ㅓ욈나ㅓ와러모닝러ㅚㅁ나ㅓㅇ뢰마ㅓ농리ㅏㅓ몬이러ㅗㅁㅇㄴㄹ
        }

        //another test2 정은택 입니다.
        }//ㄴㅁ이ㅏ러;ㅁ니아ㅓㄹ;ㅣ마넝ㄹ;ㅣ
            //hallo welt. 정은택ㅓ지더ㅗㄹ;ㅏ머넝;라ㅓ;미나얼;마넝ㄹ;ㅣ마넝ㄹ;

    // adding a new comment
    }

}