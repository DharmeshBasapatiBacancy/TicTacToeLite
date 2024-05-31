package com.bacancy.ourtictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bacancy.ourtictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //first entry will be false "X"
    private lateinit var binding: ActivityMainBinding
    private var currentEntry = ""
    private var setCurrentValueToBox = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        handleClicks()
    }

    private fun handleClicks() {
        binding.apply {
            tvBox1.setOnClickListener {
                setCurrentValueToBox = checkCurrentEntry()
                tvBox1.text = checkGameStatus(tvBox1.text,setCurrentValueToBox)
                currentEntry = setCurrentValueToBox
            }

            tvBox2.setOnClickListener {
                setCurrentValueToBox = checkCurrentEntry()
                tvBox2.text =  checkGameStatus(tvBox2.text, setCurrentValueToBox)
            }

            tvBox3.setOnClickListener {
                setCurrentValueToBox = checkCurrentEntry()
                tvBox3.text = checkGameStatus(tvBox3.text, setCurrentValueToBox)
            }

            tvBox4.setOnClickListener {
                setCurrentValueToBox = checkCurrentEntry()
                tvBox4.text = checkGameStatus(tvBox4.text, setCurrentValueToBox)
            }

            tvBox5.setOnClickListener {
                setCurrentValueToBox = checkCurrentEntry()
                tvBox5.text = checkGameStatus(tvBox5.text, setCurrentValueToBox)
            }

            tvBox6.setOnClickListener {
                setCurrentValueToBox = checkCurrentEntry()
                tvBox6.text = checkGameStatus(tvBox6.text, setCurrentValueToBox)
            }

            tvBox7.setOnClickListener {
                setCurrentValueToBox = checkCurrentEntry()
                tvBox7.text = checkGameStatus(tvBox7.text, setCurrentValueToBox)
            }

            tvBox8.setOnClickListener {
                setCurrentValueToBox = checkCurrentEntry()
                tvBox8.text = checkGameStatus(tvBox8.text, setCurrentValueToBox)
            }

            tvBox9.setOnClickListener {
                setCurrentValueToBox = checkCurrentEntry()
                tvBox9.text = checkGameStatus(tvBox9.text, setCurrentValueToBox)
            }

            btnStartResetGame.setOnClickListener {
                currentEntry = ""

            }

        }
    }

    private fun checkGameStatus(text: CharSequence, setCurrentValueToBox: String) : String {
        return if (setCurrentValueToBox.equals("FALSE")) {
            //set value to "X" if False
            Log.e("TAG", "checkGameStatus: $text $setCurrentValueToBox", )
            "X"
        }else{
            //set value to "0" if TRUE
            Log.e("TAG", "checkGameStatus: $text $setCurrentValueToBox", )
            "0"
        }
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