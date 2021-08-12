package sg.edu.rp.c346.id19043996.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button17.setOnClickListener {
            val total = tvNumber

            var output = ""
            when (total) {
                in 1..3 -> output = "$total"
                in 4..6 -> output = "$total"
                in 7..9 -> output = "$total"
            }
        }

        button2.setOnClickListener {
            val division = tvNumber
            var output = ""
            when (division) {
                in 1..3 -> output = "$division"
                in 4..6 -> output = "$division"
                in 7..9 -> output = "$division"
            }
        }

        button6.setOnClickListener {
            val multiple = tvNumber
            var output = ""
            when (multiple) {
                in 1..3 -> output = "$multiple"
                in 4..6 -> output = "$multiple"
                in 7..9 -> output = "$multiple"
            }
        }

        button10.setOnClickListener {
            val subtract = tvNumber
            var output = ""
            when (subtract) {
                in 1..3 -> output = "$subtract"
                in 4..6 -> output = "$subtract"
                in 7..9 -> output = "$subtract"
            }
        }

        button10.setOnClickListener {
            val addition = tvNumber
            var output = ""
            when (addition) {
                in 1..3 -> output = "$addition"
                in 4..6 -> output = "$addition"
                in 7..9 -> output = "$addition"
            }
        }
    }
}