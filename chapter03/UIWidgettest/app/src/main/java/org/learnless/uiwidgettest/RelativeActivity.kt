package org.learnless.uiwidgettest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_relative.*

class RelativeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative)

        relative_btn.setOnClickListener { view ->
            val intent = Intent(this, Relative2Activity::class.java)
            startActivity(intent)
        }

    }
}
