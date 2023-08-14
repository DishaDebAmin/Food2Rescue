package com.example.food2rescue

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val txtGoToRegister  = findViewById<TextView>(R.id.txtGoToRegister)
        txtGoToRegister.setOnClickListener {
            val intent1 = Intent(this,RegisterActivity::class.java)
            startActivity(intent1)
            finish()
        }
    }
}