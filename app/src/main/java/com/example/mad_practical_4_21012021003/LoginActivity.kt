package com.example.mad_practical_4_21012021003

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
                val Signup: Button = findViewById(R.id.Signupbtn) 
 
Signup.setOnClickListener {  
            Intent(this@LoginActivity, RegistrationActivity::class.java).also 
    { 
        startActivity(it) 
    } 
        } 
    } 
} 
