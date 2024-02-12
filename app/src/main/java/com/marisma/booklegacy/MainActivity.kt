package com.marisma.booklegacy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import androidx.fragment.app.commit
import com.marisma.booklegacy.fragments.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}