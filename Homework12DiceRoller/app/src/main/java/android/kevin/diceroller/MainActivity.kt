package android.kevin.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { reset() }

        val countUpButton: Button = findViewById(R.id.countUp_button)
        countUpButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
        val randomInt: Int = Random.nextInt(6) + 1
//        Toast.makeText(
//            this, "button clicked",
//            Toast.LENGTH_SHORT
//        ).show()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun reset() {
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "0"
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        val currentValue = resultText.text.toString()
        if (currentValue == "Hello World!") {
            resultText.text = "1"
        } else if (currentValue.toInt() < 6) {
            resultText.text = (currentValue.toInt() + 1).toString();
        }
    }
}
