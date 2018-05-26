package org.learnless.activitylifecycletest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    companion object {
        private val TAG = "ThirdActivity"
    }

    private var mButton1: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        Log.d(TAG, this.toString())
        Log.d(TAG, "Task id is " + taskId)

        mButton1 = findViewById(R.id.third_button1)
        mButton1?.setOnClickListener { view ->
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
