package com.example.kotlinkreatorsproject.View

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlinkreatorsproject.R
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
        binding.btnNotify.setOnClickListener {
            //val intent = Intent(this, Notification_Activity::class.java)
           // startActivity(intent)
        }


        // Sent, Receive, Topup and Payment buttons
        binding.btnSent.setOnClickListener {
           // val intent = Intent(this, Sent_Activity::class.java)
            //startActivity(intent)
        }
        binding.btnReceive.setOnClickListener {
           // val intent = Intent(this, Receive_Activity::class.java)
            //startActivity(intent)
        }
        binding.btnTopup.setOnClickListener {
           // val intent = Intent(this, Topup_Activity::class.java)
           // startActivity(intent)
        }
        binding.btnPayment.setOnClickListener {
           // val intent = Intent(this, Payment_Activity::class.java)
            //startActivity(intent)
        }


        // Recent Activities button
        binding.btnRA.setOnClickListener {}
    }
}