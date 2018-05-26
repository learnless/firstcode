package org.learnless.listviewtest.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import org.learnless.listviewtest.R
import org.learnless.listviewtest.pojo.Fruit

/**
 * Created by Administrator on 18.5.26.
 */
class FruitAdapter(context: Context, private val resource: Int, objects: List<Fruit>) : ArrayAdapter<Fruit>(context, resource, objects) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val fruit = getItem(position)
        val view = LayoutInflater.from(context).inflate(resource, parent, false)
        //可以优化效率
        var fruitImage: ImageView? = view.findViewById(R.id.my_imageView_imageId)
        var fruitName: TextView? = view.findViewById(R.id.my_textView_name)
        fruitImage?.setImageResource(fruit.imageId)
        fruitName?.setText(fruit.name)

        return view
    }

}