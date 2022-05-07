package com.fernandez.practica2.login
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fernandez.practica2.R
import com.fernandez.practica2.home.HomeActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val actionBar = supportActionBar
        actionBar?.hide()

        btnIniciarSesion.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))

        }
    }
}