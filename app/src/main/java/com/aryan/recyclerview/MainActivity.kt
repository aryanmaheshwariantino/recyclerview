package com.aryan.recyclerview

import ItemModel
import MyAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.aryan.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView = binding.recyclerview

        val itemList: List<ItemModel> = listOf(
            ItemModel("Name1", "email1@example.com", R.drawable.image1),
            ItemModel("Name2", "email23@example.com", R.drawable.image2),
            ItemModel("Name3", "email56@example.com", R.drawable.image3),
            ItemModel("Name4", "emai662@example.com", R.drawable.image4),
            ItemModel("Name5", "emai781@example.com", R.drawable.image5),
            ItemModel("Name6", "emai882@example.com", R.drawable.image6),
            ItemModel("Name7", "email989@example.com", R.drawable.image7),
            ItemModel("Name8", "emai892@example.com", R.drawable.image8),
            ItemModel("Name9", "email7871@example.com", R.drawable.image9),
            ItemModel("Name10", "email273@example.com", R.drawable.image10),
            ItemModel("Name11", "email7871@example.com", R.drawable.image9),
        ItemModel("Name12", "email7871@example.com", R.drawable.image9),
        ItemModel("Name13", "email7871@example.com", R.drawable.image3),
        ItemModel("Name14", "email7871@example.com", R.drawable.image5),
        ItemModel("Name15", "email7871@example.com", R.drawable.image10),
        )
        val layoutManager = LinearLayoutManager(this)
        // Provide the list of items to the adapter
        val adapter = MyAdapter(this, itemList)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }
}
