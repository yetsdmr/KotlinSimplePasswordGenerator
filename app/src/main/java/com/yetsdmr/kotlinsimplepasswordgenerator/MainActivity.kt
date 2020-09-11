package com.yetsdmr.kotlinsimplepasswordgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val passwordGenerator = PasswordGenerator()

        btn_generate.setOnClickListener {
            //val password = passwordGenerator.generatePassword(12,"yetsdmr")
            val password = passwordGenerator.generatePassword(12)
            tv_text.text = password
        }
    }
}