package com.example.iniaplikasi

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_scamshop.*

class Scamshop : AppCompatActivity() {
    val ScamList: ArrayList<ScamModel> = ArrayList()
    private lateinit var layoutManager: RecyclerView.LayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ScamList.add(
            ScamModel(
                "Bocah Epep",
                BitmapFactory.decodeResource(
                    resources, R.drawable.pic1
                )
            )
        )
        ScamList.add(
            ScamModel(
                "Mantan A5U",
                BitmapFactory.decodeResource(
                    resources, R.drawable.pic2
                )
            )
        )
        ScamList.add(
            ScamModel(
                "Jasa Ambil",
                BitmapFactory.decodeResource(
                    resources, R.drawable.pic3
                )
            )
        )
        layoutManager = LinearLayoutManager(this)
        rvScamList.layoutManager = layoutManager
        rvScamList.adapter = RecyclerViewAdapter(this, ScamList)
    }
}

