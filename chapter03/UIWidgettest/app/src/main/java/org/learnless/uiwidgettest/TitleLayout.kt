package org.learnless.uiwidgettest

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.title.view.*


/**
 * Created by Administrator on 18.5.26.
 */
class TitleLayout(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs), View.OnClickListener {
    init {
        LayoutInflater.from(context).inflate(R.layout.title, this)
        title_button_back.setOnClickListener(this)
        title_button_edit.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.title_button_back -> {
                Toast.makeText(context, "点击了回退按钮", Toast.LENGTH_SHORT).show()
            }
            R.id.title_button_edit -> {
                Toast.makeText(context, "点击了编辑按钮", Toast.LENGTH_SHORT).show()
            }
            else -> {

            }
        }
    }
}
