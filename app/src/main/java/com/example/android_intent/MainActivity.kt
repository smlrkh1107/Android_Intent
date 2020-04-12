package com.example.android_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
    }

    fun setupEvents() {
        dialBtn.setOnClickListener {
            val inputPhoneNum = yourPhoneNum.text.toString()
            val myUri = Uri.parse("tel:${inputPhoneNum}")
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)
        }

        callBtn.setOnClickListener {
            val inputPhoneNum = yourPhoneNum.text.toString()
            val myUri = Uri.parse("tel:${inputPhoneNum}")
            var myIntent = Intent(Intent.ACTION_CALL, myUri)
            startActivity(myIntent)
        }


    }

}
