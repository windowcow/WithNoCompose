package com.example.withnocompose

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.withnocompose.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val binding = ActivityMainBinding.inflate(inflater)
        setContentView(binding.root)

        binding.btnSay.setOnClickListener {
            binding.textView.text = "got that!"
        }
    }
}