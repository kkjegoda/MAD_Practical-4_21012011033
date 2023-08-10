package com.example.mad_practical_4_21012011033

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var login =findViewById<Button>(R.id.login_btn)
        login.setOnClickListener({
            Intent(this@MainActivity,LoginActivity::class.java)
                .also { startActivity(it) }
        })
    var singup=findViewById<Button>(R.id.sign_btn)
        singup.setOnClickListener ({
            Intent(this@MainActivity,RegisterActivity::class.java)
                .also { startActivity(it) }
        })

    }
}


