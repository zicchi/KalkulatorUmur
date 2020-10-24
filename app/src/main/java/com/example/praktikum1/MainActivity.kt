package com.example.praktikum1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun eksekusi(view: View) {

        var isian: String = editText1.text.toString()
        var tahun : Int = isian.toInt()
        tahun = 2020 - tahun
        textView.text = tahun.toString()

    }
}