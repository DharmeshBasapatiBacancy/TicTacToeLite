package com.bacancy.ourtictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bacancy.ourtictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        handleClicks()
    }

    private fun handleClicks() {
        binding.apply {
            tvBox1.setOnClickListener {

            }

            tvBox2.setOnClickListener {

            }

            tvBox3.setOnClickListener {

            }

            tvBox4.setOnClickListener {

            }

            tvBox5.setOnClickListener {

            }

            tvBox6.setOnClickListener {

            }

            tvBox7.setOnClickListener {

            }

            tvBox8.setOnClickListener {

            }

            tvBox9.setOnClickListener {

            }

            btnStartResetGame.setOnClickListener {

            }

        }
    }
}