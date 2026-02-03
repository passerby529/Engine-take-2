package com.passerby529.engine

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val tv = TextView(this)
        tv.text = "SpecOps Engine Alive"
        tv.textSize = 24f

        setContentView(tv)
    }
}
