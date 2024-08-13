package com.example.kotlinkreatorsproject


import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinkreatorsproject.View.ItensList
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

        val list = listOf(
            ItensList("Receive Transfer", "12 Ags 2024", "+ 260,00"),
            ItensList("Receive Transfer", "10 Jul 2024", "+ 400,00"),
            ItensList("Receive Transfer", "01 Jul 2024", "+ 900,00"),
            ItensList("Receive Transfer", "15 Jun 2024", "+ 140,00"),
            ItensList("Receive Transfer", "10 May 2024", "+ 130,00")
        )

        rvlistaRA = findViewById(R.id.rv_lista)
        rvlistaRA.adapter = ListRecentActivitiesAdapter(list)
        rvlistaRA.layoutManager = LinearLayoutManager(this)
    }
}