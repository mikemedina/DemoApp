package com.github.mikemedina.demoapp

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

}
