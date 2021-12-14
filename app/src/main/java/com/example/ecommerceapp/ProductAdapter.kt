package com.example.ecommerceapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ProductAdapter (private  var products:ArrayList<Products>):RecyclerView.Adapter<ViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.product_row,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text=products[position].title
        Picasso.get().load(products[position].photoUrl).into(holder.image)
    }

    override fun getItemCount(): Int {
        return  products.size
    }
}


class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
    val image:ImageView=itemView.findViewById(R.id.tvPhoto)
    val title:TextView=itemView.findViewById(R.id.tvTitle)
    val price:TextView=itemView.findViewById(R.id.tvPrice)


}



