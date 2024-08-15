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


        binding.btnShop.setOnClickListener {
            if (binding.tvItem.visibility == View.GONE) {
                binding.tvItemprice.visibility = View.VISIBLE
                binding.tvItem.visibility = View.VISIBLE
                binding.tvItemdate.visibility = View.VISIBLE
            } else {
                binding.tvItemprice.visibility = View.GONE
                binding.tvItem.visibility = View.GONE
                binding.tvItemdate.visibility = View.GONE
            }
        }
    }
}
