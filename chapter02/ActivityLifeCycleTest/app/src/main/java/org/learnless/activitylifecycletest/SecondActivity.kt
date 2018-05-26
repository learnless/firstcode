package org.learnless.activitylifecycletest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    companion object {
        private val TAG = "SecondActivity"
    }

    private var mButton1: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d(TAG, this.toString())
        Log.d(TAG, "Task id is " + taskId)

        mButton1 = findViewById(R.id.second_button1)
        mButton1?.setOnClickListener { view ->
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}
