package com.bacancy.ourtictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
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
                checkWinningStatus()
            }

            tvBox2.setOnClickListener {
                setCurrentValueToBox = checkCurrentEntry()
                tvBox2.text =  checkGameStatus(tvBox2.text, setCurrentValueToBox)
                currentEntry = setCurrentValueToBox
            }

            tvBox3.setOnClickListener {
                setCurrentValueToBox = checkCurrentEntry()
                tvBox3.text = checkGameStatus(tvBox3.text, setCurrentValueToBox)
                currentEntry = setCurrentValueToBox
            }

            tvBox4.setOnClickListener {
                setCurrentValueToBox = checkCurrentEntry()
                tvBox4.text = checkGameStatus(tvBox4.text, setCurrentValueToBox)
                currentEntry = setCurrentValueToBox
            }

            tvBox5.setOnClickListener {
                setCurrentValueToBox = checkCurrentEntry()
                tvBox5.text = checkGameStatus(tvBox5.text, setCurrentValueToBox)
                currentEntry = setCurrentValueToBox
            }

            tvBox6.setOnClickListener {
                setCurrentValueToBox = checkCurrentEntry()
                tvBox6.text = checkGameStatus(tvBox6.text, setCurrentValueToBox)
                currentEntry = setCurrentValueToBox
            }

            tvBox7.setOnClickListener {
                setCurrentValueToBox = checkCurrentEntry()
                tvBox7.text = checkGameStatus(tvBox7.text, setCurrentValueToBox)
                currentEntry = setCurrentValueToBox
            }

            tvBox8.setOnClickListener {
                setCurrentValueToBox = checkCurrentEntry()
                tvBox8.text = checkGameStatus(tvBox8.text, setCurrentValueToBox)
                currentEntry = setCurrentValueToBox
            }

            tvBox9.setOnClickListener {
                setCurrentValueToBox = checkCurrentEntry()
                tvBox9.text = checkGameStatus(tvBox9.text, setCurrentValueToBox)
                currentEntry = setCurrentValueToBox
            }

            btnStartResetGame.setOnClickListener {
                currentEntry = ""
                tvBox1.text="";
                tvBox2.text="";
                tvBox3.text="";
                tvBox4.text="";
                tvBox5.text="";
                tvBox6.text="";
                tvBox7.text="";
                tvBox8.text="";
                tvBox9.text="";

            }

        }
    }

    private fun checkWinningStatus() {
        binding.apply {

            if (checkForWinner(tvBox1, tvBox2, tvBox3, symbol = "X")) {
                tvPlayerTurn.text = "X is won"
            } else if (checkForWinner(tvBox1, tvBox2, tvBox3, symbol = "0")) {
                tvPlayerTurn.text = "0 is won"
            }

            if (checkForWinner(tvBox4, tvBox5, tvBox6, symbol = "X")) {
                tvPlayerTurn.text = "X is won"
            } else if (checkForWinner(tvBox4, tvBox5, tvBox6, symbol = "0")) {
                tvPlayerTurn.text = "0 is won"
            }
        }
    }

    fun checkForWinner(vararg textViews: TextView, symbol: String): Boolean {
        return textViews.all { it.text.toString() == symbol }
    }

    private fun checkGameStatus(text: CharSequence, setCurrentValueToBox: String) : String {
        return listOf("X", "0").random()
    }

    private fun checkCurrentEntry(): String {
        return if (currentEntry.isEmpty()) {
            currentEntry = Player.FALSE.toString()
            Player.FALSE.toString()
        } else if (currentEntry.equals(Player.FALSE)) {
            Player.TRUE.toString()
        } else {
            Player.FALSE.toString()
        }
    }
}