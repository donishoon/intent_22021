package com.nepplus.intent_22021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_doon.*

class DoonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doon)

        btnMoveBack.setOnClickListener {

//            다른 화면으로 이동하기

//            val myIntent = Intent ( this, MainActivity :: class.java)
//            startActivity(myIntent)

            finish()

        }

    }
}