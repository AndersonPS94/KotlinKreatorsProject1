package com.example.kotlinkreatorsproject.View

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinkreatorsproject.ListRecentActivitiesAdapter
import com.example.kotlinkreatorsproject.R
import com.example.kotlinkreatorsproject.databinding.ActivityHomescreenBinding

class Homescreen_Activity : AppCompatActivity() {
    private val binding by lazy {
        ActivityHomescreenBinding.inflate(layoutInflater)
    }
    private lateinit var rvlistaRA: RecyclerView


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

        val list = listOf(
            ItensList(R.drawable.food_icon,"Pizza", "12 Ags 2024", "$ 30,00"),
            ItensList(R.drawable.health,"Medication", "10 Jul 2024", "$ 140,00"),
            ItensList(R.drawable.receive,"Receive Transfer", "01 Jul 2024", "+ $ 900,00"),
            ItensList(R.drawable.emoneytopup,"E-money Topup", "15 Jun 2024", "$ 100,00"),
            ItensList(R.drawable.group,"PS5 Game", "10 May 2024", "$ 70,00"),
            ItensList(R.drawable.sent,"Sent money to your contact", "06 May 2024", "$ 60,00"),
            ItensList(R.drawable.food_icon,"Soft Drink", "05 May 2024", "$ 05,00"),
            ItensList(R.drawable.health,"Perfume", "03 May 2024", "$ 60,00"),
            ItensList(R.drawable.receive,"Receive Transfer", "01 Apr 2024", "+ $ 370,00"),

        )

        rvlistaRA = findViewById(R.id.tv_tittle)
        rvlistaRA.adapter = ListRecentActivitiesAdapter(list)
        rvlistaRA.layoutManager = LinearLayoutManager(this)

        //notification button
        binding.btnNotify.setOnClickListener {
            val intent = Intent(this, Statistics_Activity::class.java)
             startActivity(intent)
       }


        // Sent, Receive, Topup and Payment buttons
        binding.btnSent.setOnClickListener {
            // val intent = Intent(this, Sent_Activity::class.java)
            // startActivity(intent)
        }
        binding.btnReceive.setOnClickListener {
            // val intent = Intent(this, Receive_Activity::class.java)
            // startActivity(intent)
        }
        binding.btnTopup.setOnClickListener {
            // val intent = Intent(this, Topup_Activity::class.java)
            // startActivity(intent)
        }
        binding.btnPayment.setOnClickListener {
            // val intent = Intent(this, Payment_Activity::class.java)
            // startActivity(intent)
        }


        // Recent Activities button
        binding.btnRA.setOnClickListener {
            // val intent = Intent(this, RVList_recentactivities_Activity::class.java)
            // startActivity(intent)
        }
    }
}