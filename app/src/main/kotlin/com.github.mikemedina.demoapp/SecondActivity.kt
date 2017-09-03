package com.github.mikemedina.demoapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.textView_label
import kotlinx.android.synthetic.main.activity_second.textView_random
import java.util.Random

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    private fun showRandomNumber() {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        val rng = Random()
        val randomNumber = if (count > 0) rng.nextInt(count + 1) else 0

        textView_random.text = Integer.toString(randomNumber)
        textView_label.text = getString(R.string.random_heading, count)
    }

}
