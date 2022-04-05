package com.loretta.android_studio_lab_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class LoginActivity : AppCompatActivity() {

    private lateinit var userViewModel : LoginActivityViewModel

    lateinit var button : Button
    lateinit var email : EditText
    lateinit var password : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //bytte ut content view till activity_login här ovan

        userViewModel = ViewModelProvider(this)[LoginActivityViewModel::class.java]

        email = findViewById(R.id.etEmail)
        password = findViewById(R.id.etPassword)

        button = findViewById(R.id.btnLogin)

        button.setOnClickListener {

            var userEmail = email.text.toString()

            if(userEmail == userViewModel.userEmail){
                val intent = Intent(this@LoginActivity, NavActivity::class.java)

                intent.putExtra("userEmail", userEmail)



                startActivity(intent)
            } else {
                Toast.makeText(this, "You have entered the wrong email address", Toast.LENGTH_LONG).show()
            }





        }



    }
}