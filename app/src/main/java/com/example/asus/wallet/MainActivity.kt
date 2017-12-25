package com.example.asus.wallet

import android.content.Context
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toolbar

import kotlinx.android.synthetic.main.activity_main_layout.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_layout)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }


        val addNew = findViewById<Button>(R.id.addNew) as Button
        addNew.setOnClickListener {
            val intent = Intent(applicationContext, AddingElementActivity::class.java)
            startActivity(intent)
            Log.e("AddingElementActivity", "started")
        }

        val showAllItem = findViewById<Button>(R.id.showAllItem) as Button
        showAllItem.setOnClickListener{
            val intent = Intent(applicationContext,DataListActivity::class.java)
            startActivity(intent)
            Log.e("DataListActivity","started")
        }

        val userHistory = findViewById<Button>(R.id.userHistory) as Button
        userHistory.setOnClickListener{
            val intent = Intent(applicationContext,AddingElementActivity::class.java)
            startActivity(intent)
            Log.e("AddingElementActivity","started")
        }

    }


}
