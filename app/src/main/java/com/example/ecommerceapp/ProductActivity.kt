package com.example.ecommerceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ProductActivity : AppCompatActivity() {
    lateinit var rvProduct:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        var products= arrayListOf<Products>()
        for (product in 0..100){
            products.add(Products("Onion","data:image/jpeg;base64,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",40.00))
        }
            rvProduct.apply{
            layoutManager=GridLayoutManager(this@ProductActivity,2)
                adapter=ProductAdapter(products)
}
    }
}