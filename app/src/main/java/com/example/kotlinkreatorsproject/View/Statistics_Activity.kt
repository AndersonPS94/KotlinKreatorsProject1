package com.example.kotlinkreatorsproject.View

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

    private lateinit var btnShop : Button
    private lateinit var tvItem : TextView
    private lateinit var tvPrice : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnShop = findViewById(R.id.btn_shop)
        tvItem = findViewById(R.id.tv_item)
        tvPrice = findViewById(R.id.tv_price)


        btnShop.setOnClickListener {
            if (tvItem.visibility == View.GONE) {
                tvPrice.visibility = View.VISIBLE
                tvItem.visibility = View.VISIBLE
            } else {
                tvPrice.visibility = View.GONE
                tvItem.visibility = View.GONE
            }
        }
    }
}
