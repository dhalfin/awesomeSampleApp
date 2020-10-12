package ru.site.awesomeapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var buttons: List<Pair<Int, Button>>;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttons = listOf<Pair<Int, Button>>(
            Pair(1, button1),
            Pair(2, button2),
            Pair(3, button3),
            Pair(4, button4)
        );

        buttons.forEach { pair: Pair<Int, Button> ->
            pair.second.setOnClickListener {
                Toast.makeText(this, "Button ${pair.first} have been pressed!", Toast.LENGTH_SHORT).show();
                Log.i(
                    "test",
                    "Pressed button ${pair.first}"
                )
            }
        }
    }
}
