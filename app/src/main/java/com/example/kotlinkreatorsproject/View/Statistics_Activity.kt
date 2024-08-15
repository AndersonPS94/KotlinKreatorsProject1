package com.example.kotlinkreatorsproject.View

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlinkreatorsproject.R
import com.example.kotlinkreatorsproject.databinding.ActivityStatisticsBinding

class Statistics_Activity : AppCompatActivity() {
    private val binding by lazy {
        ActivityStatisticsBinding.inflate(layoutInflater)
    }

    //Recuperando id dos elementos - btnShop
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        //button back to homescreen
        binding.imgBtnBack.setOnClickListener {
            intent = Intent(this, Homescreen_Activity::class.java)
            startActivity(intent)
        }

        //button shop
        binding.btnShop.setOnClickListener {
            if (binding.tvItemshop1.visibility == View.GONE) {

                binding.tvItemshop1.visibility = View.VISIBLE
                binding.tvItemdateshop1.visibility = View.VISIBLE
                binding.tvItempriceshop1.visibility = View.VISIBLE

                binding.tvItemshop2.visibility = View.VISIBLE
                binding.tvItemdateshop2.visibility = View.VISIBLE
                binding.tvItempriceshop2.visibility = View.VISIBLE
            } else {
                binding.tvItemshop1.visibility = View.GONE
                binding.tvItemdateshop1.visibility = View.GONE
                binding.tvItempriceshop1.visibility = View.GONE

                binding.tvItemshop2.visibility = View.GONE
                binding.tvItemdateshop2.visibility = View.GONE
                binding.tvItempriceshop2.visibility = View.GONE
            }
        }
        //button health
        binding.btnHealth.setOnClickListener {
            if (binding.tvItemhealth1.visibility == View.GONE) {

                binding.tvItemhealth1.visibility = View.VISIBLE
                binding.tvItemdatehealth1.visibility = View.VISIBLE
                binding.tvItempricehealth1.visibility = View.VISIBLE

                binding.tvItemhealth2.visibility = View.VISIBLE
                binding.tvItemdatehealth2.visibility = View.VISIBLE
                binding.tvItempricehealth2.visibility = View.VISIBLE
            } else {
                binding.tvItemhealth1.visibility = View.GONE
                binding.tvItemdatehealth1.visibility = View.GONE
                binding.tvItempricehealth1.visibility = View.GONE

                binding.tvItemhealth2.visibility = View.GONE
                binding.tvItemdatehealth2.visibility = View.GONE
                binding.tvItempricehealth2.visibility = View.GONE
            }
        }
    }
}
