package com.example.mad_practical_4_21012021003

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        val Login: Button = findViewById(R.id.Loginbtn) 
        Login.setOnClickListener { 
            Intent(this@RegistrationActivity, LoginActivity::class.java).also { startActivity(it) } 
        } 

    }
}
