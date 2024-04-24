package com.example.myfirstapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

//        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        val email = findViewById<EditText>(R.id.etUserEmail)
        val password = findViewById<EditText>(R.id.etUserPassword)


        findViewById<Button>(R.id.btnSubmitLogin).setOnClickListener {
            // write logic to hanlde the button
            val submittedEmail = email.text.toString()
            val submittedPassword = password.text.toString()

            // TODO: Create the logic to verify user login details, EMAIL should be valid, Password must have 8 length including small/capital letters with digit and special characters
        }

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }

}