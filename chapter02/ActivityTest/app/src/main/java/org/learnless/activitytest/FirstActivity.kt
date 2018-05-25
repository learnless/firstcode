package org.learnless.activitytest

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast

class FirstActivity : AppCompatActivity(), View.OnClickListener {
    companion object {
        private val TAG = "FirstActivity"
        private val REQUEST_CODE_SECOND = 0

    }

    private var mButtonFinish: Button? = null
    private var mButtonForward: Button? = null
    private var mButtonImplicit: Button? = null
    private var mButtonMore: Button? = null
    private var mButtonDialog: Button? = null

    private fun initView() {
        mButtonFinish = findViewById(R.id.first_button_finish)
        mButtonForward = findViewById(R.id.first_button_forward)
        mButtonImplicit = findViewById(R.id.first_button_implicit)
        mButtonMore = findViewById(R.id.first_button_more)
        mButtonDialog = findViewById(R.id.first_button_dialog)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        initView()

        mButtonFinish?.setOnClickListener(this)
        mButtonForward?.setOnClickListener(this)
        mButtonImplicit?.setOnClickListener(this)
        mButtonMore?.setOnClickListener(this)
        mButtonDialog?.setOnClickListener(this)
    }

    /**
     * 活动使用menu，与ActionBar同在顶部，菜单项
     */
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.first, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.item_add -> Toast.makeText(this, "菜单添加项被点击", Toast.LENGTH_SHORT).show()
            R.id.item_remove -> Toast.makeText(this, "菜单移除按钮被点击", Toast.LENGTH_SHORT).show()
            else -> {

            }
        }

        return true
    }

    /**
     * 获取activity回传的数据
     */
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        when (requestCode) {
            REQUEST_CODE_SECOND -> {
                if (resultCode == Activity.RESULT_OK && data != null) {
                    val data1 = data.getStringExtra(SecondActivity.EXTRA_DATA1_RESULT_FIRST)
                    Log.d(TAG, data1)
                }
            }
            else -> {

            }
        }
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.first_button_finish -> {
                Toast.makeText(this, "按钮被点击", Toast.LENGTH_SHORT).show()
                finish()
            }
            //显示intent
            R.id.first_button_forward -> {
//                val intent = Intent(this, SecondActivity::class.java)
//                startActivity(intent)
                //推荐，活动之间数据的传递，跳转到SecondActivity在该类写好传递的方法
                val intent = SecondActivity.newIntentFromFirstActivity(this, "从FirstActivity传递到SecondActivity的字符串")
                startActivityForResult(intent, REQUEST_CODE_SECOND)
            }
            //隐式intent
            R.id.first_button_implicit -> {
                val intent = Intent("org.learnless.activitytest.ACTION_START")
                startActivity(intent)
            }
            //更多隐式intent
            R.id.first_button_more -> {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://www.baidu.com"))
                startActivity(intent)
            }
            //跳转到弹出框活动，此时原活动只调用onPause方法，普通活动都要调用onPause,onStop
            R.id.first_button_dialog -> {
                val intent = Intent(this, DialogActivity::class.java)
                startActivity(intent)
            }

            else -> {

            }
        }

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
