package com.example.pppbloginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.pppbloginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var validUsername: String = "admin"
    private var validPassword: String = "12345"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val loginSuccess: String = getString(R.string.login_success)
        val loginFailedUsername: String = getString(R.string.login_failed_username)
        val loginFailedPassword: String = getString(R.string.login_failed_password)

        with(binding){
            btnLogin.setOnClickListener{
                val inputUsername = inputUsername.text.toString()
                val inputPassword = inputPassword.text.toString()

                if (inputUsername == validUsername && inputPassword == validPassword ){
                    Toast.makeText(this@MainActivity, loginSuccess, Toast.LENGTH_LONG).show()
                } else if (inputUsername != validUsername){
                    Toast.makeText(this@MainActivity, loginFailedUsername, Toast.LENGTH_LONG).show()
                }else {
                    Toast.makeText(this@MainActivity, loginFailedPassword, Toast.LENGTH_LONG).show()
                }
            }
        }

    }
}