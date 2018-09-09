package com.wrongwrong.picassosample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Picasso.get()
                .load("https://1.bp.blogspot.com/-kwMHBpDRC98/WMfCOCDhmCI/AAAAAAABClk/0YhKPlx69H8akEluJniMmVV-RoJCRtPvACLcB/s800/onsei_ninshiki_smartphone.png")
                .resize(300, 300)
                .centerCrop()
                .into(imageView)
    }
}
