package com.example.codigouitest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarAdapter(val stringList: ArrayList<String>) :
    RecyclerView.Adapter<CarAdapter.CarVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarVH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item_car, parent, false)
        return CarVH(v)
    }

    override fun onBindViewHolder(holder: CarVH, position: Int) {
        holder.txtTitle.text = stringList[position]
    }

    override fun getItemCount(): Int {
        return stringList.size
    }

    class CarVH(v: View) : RecyclerView.ViewHolder(v) {
        val txtTitle = v.findViewById<TextView>(R.id.txtCarName)
    }


}