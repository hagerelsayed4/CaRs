package com.example.cars

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cars.Fragment.FragmentSignUp
import com.example.cars.Fragment.FragmentVerify
import kotlinx.android.synthetic.main.fragment_sign_up.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signUpbtn.setOnClickListener {


        var main = supportFragmentManager.beginTransaction()
        var sugnUp=FragmentSignUp()
        main.replace(R.id.fragment_container,sugnUp)
        main.commit()
    }

    }

}