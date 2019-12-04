package com.example.electronics_recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detail.*

class detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val recivedIntent=intent

        val img=recivedIntent.getIntExtra("image",0)
        var title=recivedIntent.getStringExtra("title")
        var id=recivedIntent.getStringExtra("id")
        val color=recivedIntent.getStringExtra("color")
        val detail=recivedIntent.getStringExtra("detail")

        img1.setImageResource(img)
        txtDesc.text=title
        txtId.append(id)
        txtColor.append(color)
        txtDetail.text=detail

    }
}
