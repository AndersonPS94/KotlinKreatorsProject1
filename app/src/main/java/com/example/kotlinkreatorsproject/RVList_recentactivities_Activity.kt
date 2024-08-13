package com.example.kotlinkreatorsproject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinkreatorsproject.databinding.ActivityRvlistRecentactivitiesBinding

class RVList_recentactivities_Activity : AppCompatActivity() {
    private val binding by lazy {
        ActivityRvlistRecentactivitiesBinding.inflate(layoutInflater)
    }
    private lateinit var rvlistaRA: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        rvlistaRA = binding.rvLista
    }
}