package com.example.kotlinkreatorsproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlinkreatorsproject.databinding.ActivityHomescreenBinding

class Homescreen_Activity : AppCompatActivity() {
    private val binding by lazy {
        ActivityHomescreenBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        setSupportActionBar(binding.mtbhome)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        //notification button
        binding.btnNotify.setOnClickListener {}


        // Sent, Receive, Topup and Payment buttons
        binding.btnSent.setOnClickListener {}
        binding.btnReceive.setOnClickListener {}
        binding.btnTopup.setOnClickListener {}
        binding.btnPayment.setOnClickListener {}


        // Recent Activities button
        binding.btnRA.setOnClickListener {}
    }
}