package org.learnless.activitylifecycletest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    companion object {
        private val TAG = "MainActivity"
    }

    private var mButton1: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, this.toString())
        Log.d(TAG, "Task id is " + taskId)

        mButton1 = findViewById(R.id.main_button_1)
        mButton1?.setOnClickListener { view ->
            //跳转自己的活动
//            val intent = Intent(this, MainActivity::class.java)
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }


}
