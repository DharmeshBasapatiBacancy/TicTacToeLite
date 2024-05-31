package com.bacancy.ourtictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bacancy.ourtictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //first entry will be false "X"
    private lateinit var binding: ActivityMainBinding
    private var currentEntry = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        handleClicks()
    }

    private fun handleClicks() {
        binding.apply {
            tvBox1.setOnClickListener {
                tvBox1.text = checkCurrentEntry()
                checkGameStatus()

            }

            tvBox2.setOnClickListener {
                tvBox2.text = checkCurrentEntry()

            }

            tvBox3.setOnClickListener {
                tvBox3.text = checkCurrentEntry()

            }

            tvBox4.setOnClickListener {
                tvBox4.text = checkCurrentEntry()
            }

            tvBox5.setOnClickListener {
                tvBox5.text = checkCurrentEntry()
            }

            tvBox6.setOnClickListener {
                tvBox6.text = checkCurrentEntry()
            }

            tvBox7.setOnClickListener {
                tvBox7.text = checkCurrentEntry()

            }

            tvBox8.setOnClickListener {
                tvBox8.text = checkCurrentEntry()

            }

            tvBox9.setOnClickListener {
                tvBox9.text = checkCurrentEntry()

            }

            btnStartResetGame.setOnClickListener {
                currentEntry = ""

            }

        }
    }

    private fun checkGameStatus() {

    }

    private fun checkCurrentEntry(): String {
        if (currentEntry.isEmpty()) {
            currentEntry = Player.FALSE.toString()
            return Player.FALSE.toString()
        } else if (currentEntry.equals(Player.FALSE)) {
            return Player.TRUE.toString()
        } else {
            return Player.FALSE.toString()
        }
    }
}