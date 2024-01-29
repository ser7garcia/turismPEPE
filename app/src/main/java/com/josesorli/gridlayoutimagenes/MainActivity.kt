package com.josesorli.gridlayoutimagenes

import android.content.Intent
import android.os.Bundle
import android.view.View
//import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onImageClick(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        val imageView = view as ImageView
        val imageResId = resources.getIdentifier(imageView.tag as String, "drawable", packageName)
        intent.putExtra("imageResId", imageResId)
        startActivity(intent)
    }
}