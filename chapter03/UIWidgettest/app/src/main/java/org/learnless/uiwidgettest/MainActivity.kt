package org.learnless.uiwidgettest

import android.app.ProgressDialog
import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        private val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_btn01.setOnClickListener { view ->
            main_imageView?.visibility = if (main_imageView?.visibility == View.GONE) {
                View.VISIBLE
            } else {
                View.GONE
            }
        }

        main_progressBar02.setOnClickListener { view ->
            main_progressBar02.setProgress(main_progressBar02.progress + 10)
        }

        main_btn02.setOnClickListener { view ->
            //加载对话框AlertDialog
            val dialog = AlertDialog.Builder(this)
            dialog.setTitle("对话框")
                    .setMessage("一条重要的信息")
                    .setCancelable(false)   //不能通过Back按钮取消
                    .setPositiveButton("同意", DialogInterface.OnClickListener { dialogInterface, i ->
                        Log.d(TAG, "点击了同意")
                    })
                    .setNegativeButton("关闭", DialogInterface.OnClickListener { dialogInterface, i ->
                        Log.d(TAG, "点击了关闭")
                    })
            dialog.show()
        }

        main_btn03.setOnClickListener { view ->
            val dialog = ProgressDialog(this)
            dialog.setTitle("对话框")
            dialog.setMessage("加载中...")
            dialog.setCancelable(false)
            dialog.show()
            //没有关闭按钮，只能调用dismiss方法关闭
            Thread(Runnable {
                Thread.sleep(3000)
                dialog.dismiss()
            }).start()
        }

        main_btn04.setOnClickListener { view ->
            val intent = Intent(this, LinearLayoutActivity::class.java)
            startActivity(intent)
        }

        main_btn05.setOnClickListener { view ->
            val intent = Intent(this, RelativeActivity::class.java)
            startActivity(intent)
        }

        main_btn06.setOnClickListener { view ->
            val intent = Intent(this, FrameActivity::class.java)
            startActivity(intent)
        }

        main_btn07.setOnClickListener{ view ->
            val intent = Intent(this, PercentRelativeActivity::class.java)
            startActivity(intent)
        }

        main_btn08.setOnClickListener { view ->
            val intent = Intent(this, PercentFrameActivity::class.java)
            startActivity(intent)
        }

        main_btn09.setOnClickListener{ view ->
            val intent = Intent(this, MyLayoutActivity::class.java)
            startActivity(intent)
        }

    }
}
