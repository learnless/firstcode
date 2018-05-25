package org.learnless.activitytest

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class SecondActivity : AppCompatActivity(), View.OnClickListener {
    companion object {
        private val TAG = "SecondActivity"
        private val EXTRA_DATA1 = "org.learnless.activitytest.extraData1"

        val EXTRA_DATA1_RESULT_FIRST = "org.learnless.activitytest.extraData1ResultFirst"

        fun newIntentFromFirstActivity(context: Context, data1: String): Intent {
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra(EXTRA_DATA1, data1)
            return intent
        }
    }

    private var mButton1: Button? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d(TAG, "onCreate")

        val data1 = intent?.getStringExtra(EXTRA_DATA1)?:"传递数据为空"
        Log.d(TAG, data1)

        mButton1 = findViewById(R.id.second_button_1)
        mButton1?.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            //回传给activity数据
            R.id.second_button_1 -> {
                resultIntentToFirst()
            }
            else -> {

            }
        }
    }

    /**
     * 按下back回退
     */
    override fun onBackPressed() {
        resultIntentToFirst()
    }

    /**
     * 回传数据
     */
    private fun resultIntentToFirst() {
        val intent = Intent()
        intent.putExtra(EXTRA_DATA1_RESULT_FIRST, "回传数据")
        setResult(Activity.RESULT_OK, intent)
        finish()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}
