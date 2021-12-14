package com.example.ecommerceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnLogin:  Button
    lateinit var etUsername:EditText
    lateinit var etPassword:EditText
    lateinit var tvRegister:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        setSupportActionBar(toolbar)



        btnLogin.setOnClickListener{
            Toast.makeText(this,"clicked",Toast.LENGTH_LONG).show()
            if (etUsername.text.trim().isNotEmpty() || etPassword.text.trim().isNotEmpty())
            {
                Toast.makeText(this,"Input provided",Toast.LENGTH_LONG).show()

            }
            else{
                Toast.makeText(this,"Input required",Toast.LENGTH_LONG).show()

            }
        }

 tvRegister.setOnClickListener {
    val intent= Intent(this,RegisterActivity::class.java)
     startActivity(intent)
 }
    }
}