package com.example.toolbarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.miAddContact->Toast.makeText(this,"You clicked on add contact",Toast.LENGTH_SHORT).show()
            R.id.mifavorites->Toast.makeText(this,"You clicked on favorites",Toast.LENGTH_SHORT).show()
            R.id.miSettings->Toast.makeText(this,"You clicked on settings",Toast.LENGTH_SHORT).show()
            R.id.miClose->finish()
            R.id.miFeedBack->Toast.makeText(this,"You clicked on Feedback ",Toast.LENGTH_SHORT).show()

        }
        return true
    }
}