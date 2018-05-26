package org.learnless.listviewtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.learnless.listviewtest.adapter.FruitAdapter
import org.learnless.listviewtest.pojo.Fruit

class MyActivity : AppCompatActivity() {

    private var fruits: MutableList<Fruit>? = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFruits()

        val fruitAdapter = FruitAdapter(this, R.layout.activity_my, fruits!!)

        main_listView.adapter = fruitAdapter
    }

    private fun initFruits() {
        for (i in 0..2) {
            val apple = Fruit("Apple", R.drawable.apple_pic)
            fruits?.add(apple)
            val banana = Fruit("Banana", R.drawable.banana_pic)
            fruits?.add(banana)
            val orange = Fruit("Orange", R.drawable.orange_pic)
            fruits?.add(orange)
            val watermelon = Fruit("Watermelon", R.drawable.watermelon_pic)
            fruits?.add(watermelon)
            val pear = Fruit("Pear", R.drawable.pear_pic)
            fruits?.add(pear)
            val grape = Fruit("Grape", R.drawable.grape_pic)
            fruits?.add(grape)
            val pineapple = Fruit("Pineapple", R.drawable.pineapple_pic)
            fruits?.add(pineapple)
            val strawberry = Fruit("Strawberry", R.drawable.strawberry_pic)
            fruits?.add(strawberry)
            val cherry = Fruit("Cherry", R.drawable.cherry_pic)
            fruits?.add(cherry)
            val mango = Fruit("Mango", R.drawable.mango_pic)
            fruits?.add(mango)
        }
    }
}
