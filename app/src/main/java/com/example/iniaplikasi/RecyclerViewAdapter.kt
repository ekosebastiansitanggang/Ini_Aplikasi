package com.example.iniaplikasi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item_view.view.*
class RecyclerViewAdapter(private val context: Scamshop, private val ScamList:
ArrayList<ScamModel>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(
            R.layout.list_item_view, parent, false))
    }
    override fun getItemCount(): Int {
        return ScamList.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(ScamList[position])
    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ScamPic = view.imgScamPicture
        val ScamText = view.txtScamName
        fun bindItems(data : ScamModel){
            ScamPic?.setImageBitmap(data.logo)
            ScamText?.text = data.nama
            itemView.setOnClickListener {
                val text = data.nama
                Toast.makeText(itemView.context, text,
                    Toast.LENGTH_LONG).show()
            }
        }
    }
}