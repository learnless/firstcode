package org.learnless.listviewtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //简单ListView
        val data = initData1()
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data)
        main_listView.adapter = arrayAdapter

        main_listView.setOnItemClickListener { adapterView, view, position, id ->
            val result = data.get(position)
            Toast.makeText(this, result, Toast.LENGTH_SHORT).show()
        }

    }

    fun initData1(): Array<String> {
        val array = arrayOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j","a", "b", "c", "d", "e", "f", "g", "h", "i", "j")
        return array
    }

}
