package com.example.collectwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.collectwords.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
        private lateinit var binding: ActivityMainBinding
        private var words = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        binding.saveText.setOnClickListener {
            val word = binding.editText.text.toString().trim()
            if (word.isEmpty()) {
                binding.editText.error = "No Word"
                return@setOnClickListener
            }
            words.add(word)
        }
    }
}