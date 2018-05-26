package org.learnless.uiwidgettest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MyLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mylayout)

        supportActionBar?.hide()
    }
}
