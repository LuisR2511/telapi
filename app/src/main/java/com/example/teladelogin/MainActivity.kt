package com.example.teladelogin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonBack = findViewById<ImageView>(R.id.buttonBack)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)
        val textForgotPassword = findViewById<TextView>(R.id.textForgotPassword)

        buttonBack.setOnClickListener {
            finish() // Volta para a tela anterior
        }

        buttonLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        textForgotPassword.setOnClickListener {
            val intent = Intent(this, PasswordRecoveryActivity::class.java)
            startActivity(intent)
        }
    }
}
