package com.example.mad_practical_4_21012021003

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Login:Button = findViewById(R.id.Login)
        Login.setOnClickListener {
            Intent(this@MainActivity,LoginActivity::class.java).also { startActivity(it) }
        }
        val signup:Button = findViewById(R.id.SignUp)
        signup.setOnClickListener {
            Intent(this@MainActivity,RegistrationActivity::class.java).also { startActivity(it) }
        }
    }
}
