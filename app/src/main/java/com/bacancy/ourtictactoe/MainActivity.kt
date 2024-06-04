package com.bacancy.ourtictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
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

    fun checkGameStatus(): Boolean {
        return if (binding.tvPlayerTurn.text.toString().isEmpty()) {
            true
        } else {
            Toast.makeText(this, "Please Start/Reset Game", Toast.LENGTH_SHORT).show()
            false
        }
    }

    private fun handleClicks() {
        binding.apply {
            tvBox1.setOnClickListener {
                if (checkGameStatus()) {
                    setCurrentValueToBox = checkCurrentEntry()
                    tvBox1.text = checkGameStatus(tvBox1.text, setCurrentValueToBox)
                    currentEntry = setCurrentValueToBox
                    checkWinningStatus()
                }
            }

            tvBox2.setOnClickListener {
                if (checkGameStatus()) {
                    setCurrentValueToBox = checkCurrentEntry()
                    tvBox2.text = checkGameStatus(tvBox2.text, setCurrentValueToBox)
                    currentEntry = setCurrentValueToBox
                    checkWinningStatus()
                }
            }

            tvBox3.setOnClickListener {
                if (checkGameStatus()) {
                    setCurrentValueToBox = checkCurrentEntry()
                    tvBox3.text = checkGameStatus(tvBox3.text, setCurrentValueToBox)
                    currentEntry = setCurrentValueToBox
                    checkWinningStatus()
                }
            }

            tvBox4.setOnClickListener {
                if (checkGameStatus()) {
                    setCurrentValueToBox = checkCurrentEntry()
                    tvBox4.text = checkGameStatus(tvBox4.text, setCurrentValueToBox)
                    currentEntry = setCurrentValueToBox
                    checkWinningStatus()
                }
            }

            tvBox5.setOnClickListener {
                if (checkGameStatus()) {
                    setCurrentValueToBox = checkCurrentEntry()
                    tvBox5.text = checkGameStatus(tvBox5.text, setCurrentValueToBox)
                    currentEntry = setCurrentValueToBox
                    checkWinningStatus()
                }
            }

            tvBox6.setOnClickListener {
                if (checkGameStatus()) {
                    setCurrentValueToBox = checkCurrentEntry()
                    tvBox6.text = checkGameStatus(tvBox6.text, setCurrentValueToBox)
                    currentEntry = setCurrentValueToBox
                    checkWinningStatus()
                }
            }

            tvBox7.setOnClickListener {
                if (checkGameStatus()) {
                    setCurrentValueToBox = checkCurrentEntry()
                    tvBox7.text = checkGameStatus(tvBox7.text, setCurrentValueToBox)
                    currentEntry = setCurrentValueToBox
                    checkWinningStatus()
                }
            }

            tvBox8.setOnClickListener {
                if (checkGameStatus()) {
                    setCurrentValueToBox = checkCurrentEntry()
                    tvBox8.text = checkGameStatus(tvBox8.text, setCurrentValueToBox)
                    currentEntry = setCurrentValueToBox
                    checkWinningStatus()
                }
            }

            tvBox9.setOnClickListener {
                if (checkGameStatus()) {
                    setCurrentValueToBox = checkCurrentEntry()
                    tvBox9.text = checkGameStatus(tvBox9.text, setCurrentValueToBox)
                    currentEntry = setCurrentValueToBox
                    checkWinningStatus()
                }
            }

            btnStartResetGame.setOnClickListener {
                currentEntry = ""
                setCurrentValueToBox = ""
                tvBox1.text = "";
                tvBox2.text = "";
                tvBox3.text = "";
                tvBox4.text = "";
                tvBox5.text = "";
                tvBox6.text = "";
                tvBox7.text = "";
                tvBox8.text = "";
                tvBox9.text = "";
                tvPlayerTurn.text = "";
            }

        }
    }

    private fun checkWinningStatus() {
        binding.apply {

            if (checkForWinner(tvBox1, tvBox2, tvBox3, symbol = "X")) {
                tvPlayerTurn.text = "X is winner"
            } else if (checkForWinner(tvBox1, tvBox2, tvBox3, symbol = "0")) {
                tvPlayerTurn.text = "0 is winner"
            } else if (allTextFilled()) {
                tvPlayerTurn.text = "Match Draw..Please Reset"
            }

            if (checkForWinner(tvBox4, tvBox5, tvBox6, symbol = "X")) {
                tvPlayerTurn.text = "X is winner"
            } else if (checkForWinner(tvBox4, tvBox5, tvBox6, symbol = "0")) {
                tvPlayerTurn.text = "0 is winner"
            } else if (allTextFilled()) {
                tvPlayerTurn.text = "Match Draw..Please Reset"
            }

            if (checkForWinner(tvBox7, tvBox8, tvBox9, symbol = "X")) {
                tvPlayerTurn.text = "X is winner"
            } else if (checkForWinner(tvBox7, tvBox8, tvBox9, symbol = "0")) {
                tvPlayerTurn.text = "0 is winner"
            } else if (allTextFilled()) {
                tvPlayerTurn.text = "Match Draw..Please Reset"
            }

            if (checkForWinner(tvBox1, tvBox4, tvBox7, symbol = "X")) {
                tvPlayerTurn.text = "X is winner"
            } else if (checkForWinner(tvBox1, tvBox4, tvBox7, symbol = "0")) {
                tvPlayerTurn.text = "0 is winner"
            } else if (allTextFilled()) {
                tvPlayerTurn.text = "Match Draw..Please Reset"
            }

            if (checkForWinner(tvBox2, tvBox5, tvBox8, symbol = "X")) {
                tvPlayerTurn.text = "X is winner"
            } else if (checkForWinner(tvBox2, tvBox5, tvBox8, symbol = "0")) {
                tvPlayerTurn.text = "0 is winner"
            } else if (allTextFilled()) {
                tvPlayerTurn.text = "Match Draw..Please Reset"
            }

            if (checkForWinner(tvBox3, tvBox6, tvBox9, symbol = "X")) {
                tvPlayerTurn.text = "X is winner"
            } else if (checkForWinner(tvBox3, tvBox6, tvBox9, symbol = "0")) {
                tvPlayerTurn.text = "0 is winner"
            } else if (allTextFilled()) {
                tvPlayerTurn.text = "Match Draw..Please Reset"
            }

            if (checkForWinner(tvBox1, tvBox5, tvBox9, symbol = "X")) {
                tvPlayerTurn.text = "X is winner"
            } else if (checkForWinner(tvBox1, tvBox5, tvBox9, symbol = "0")) {
                tvPlayerTurn.text = "0 is winner"
            } else if (allTextFilled()) {
                tvPlayerTurn.text = "Match Draw..Please Reset"
            }

            if (checkForWinner(tvBox3, tvBox5, tvBox7, symbol = "X")) {
                tvPlayerTurn.text = "X is winner"
            } else if (checkForWinner(tvBox3, tvBox5, tvBox7, symbol = "0")) {
                tvPlayerTurn.text = "0 is winner"
            } else if (allTextFilled()) {
                tvPlayerTurn.text = "Match Draw..Please Reset"
            }
        }
    }

    fun checkForWinner(vararg textViews: TextView, symbol: String): Boolean {
        return textViews.all { it.text.toString() == symbol }
    }

    fun allTextFilled(): Boolean {
        var textViews: ArrayList<TextView>
        binding.apply {
            textViews = arrayListOf(
                tvBox1,
                tvBox2,
                tvBox3,
                tvBox4,
                tvBox5,
                tvBox6,
                tvBox7,
                tvBox8,
                tvBox9
            )
        }
        return textViews.all { it.text.toString().isNotEmpty() && it.text.toString().isNotBlank() }
    }

    private fun checkGameStatus(text: CharSequence, setCurrentValueToBox: String): String {
//        return listOf("X", "0").random()
        return if (setCurrentValueToBox == Player.FALSE.toString()) {
            //set value to "X" if False
            Log.e("TAG", "checkGameStatus: $text $setCurrentValueToBox")
            "X"
        } else {
            //set value to "0" if TRUE
            Log.e("TAG", "checkGameStatus: $text $setCurrentValueToBox")
            "0"
        }
    }

    private fun checkCurrentEntry(): String {
        Log.d("TAG", "tvbox checkCurrentEntry func currentEntry : " + currentEntry)
        return if (currentEntry.isEmpty()) {
            currentEntry = Player.FALSE.toString()
            Player.FALSE.toString()
        } else if (currentEntry == Player.FALSE.toString()) {
            Player.TRUE.toString()
        } else {
            Player.FALSE.toString()
        }
    }
}