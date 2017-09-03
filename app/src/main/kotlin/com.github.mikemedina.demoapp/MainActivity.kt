package com.github.mikemedina.demoapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.textView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun makeToast(view: View) {
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show()
    }

    fun incrementCount(view: View) {
        textView.text = (Integer.parseInt(textView.text.toString()) + 1).toString()
    }

    fun getRandomNumber(view: View) {
        val randomNumberIntent = Intent(this, SecondActivity::class.java)
        randomNumberIntent.putExtra(SecondActivity.TOTAL_COUNT, Integer.parseInt(textView.text.toString()))

        startActivity(randomNumberIntent)
    }

}
