package ru.alx.waybills


import android.app.ActionBar
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var editTextTextUserName: EditText
    private lateinit var editTextTextPassword: EditText
    private lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val actionBar = supportActionBar
        actionBar?.hide()

        editTextTextUserName = findViewById(R.id.editTextTextUserName) as EditText
        editTextTextPassword = findViewById(R.id.editTextTextPassword) as EditText
        buttonLogin = findViewById(R.id.buttonLogin) as Button

        buttonLogin.setOnClickListener { view ->
//            Toast.makeText(this, "Login pressed", Toast.LENGTH_SHORT).show()
            val mainIntent = Intent(this, MainActivity::class.java)
            startActivity(mainIntent)
        }

    }
}