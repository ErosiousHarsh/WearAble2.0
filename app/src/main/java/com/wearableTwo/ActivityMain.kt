package com.wearableTwo

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
//Today at 06/08/2021 02:07 I,Harshit Chaurasia, permanently close this project as I move towards learning Jetpack compose.
//Wish me luck
//Got another idea, i'll make this project entirely in Jetpack Compose :)
class ActivityMain : FragmentChangeListener,AppCompatActivity() {

    private lateinit var btnLogin: Button
    private lateinit var btnSignup: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin = findViewById(R.id.btnLogin)
        btnSignup = findViewById(R.id.btnSignup)

        btnLogin.setOnClickListener {
            startActivity(Intent(this, ActivitySignin::class.java))
        }
        btnSignup.setOnClickListener {
            startActivity(Intent(this, ActivitySignup::class.java))
        }


    }

    override fun replaceFragment(fragContainer: Int, fragClass: Fragment) {
        supportFragmentManager.beginTransaction().replace(fragContainer,
            fragClass
        ).addToBackStack(fragClass.toString())
            .commit()
    }

    private fun toast(msg: String) {
        Toast.makeText(this, msg,Toast.LENGTH_LONG).show()
    }

    override fun onBackPressed() {
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setCancelable(false)
        builder.setMessage("Do you want to Exit?")
        builder.setPositiveButton("Yes"
        ) { _, _ -> //if user pressed "yes", then useris allowed to exit from application
            finish()
        }
        builder.setNegativeButton("No"
        ) { dialog, _ -> //if user select "No", just cancel this dialog and continue with app
            dialog.cancel()
        }
        val alert: AlertDialog = builder.create()
        alert.show()
    }
}