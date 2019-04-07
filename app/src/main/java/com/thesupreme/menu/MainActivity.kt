package com.thesupreme.menu

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
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.menuFile->{
                showMessage("File")
                return true
            }
            R.id.menuEdit->{
                showMessage("Edit")
                return true
            }
            R.id.menuHelp->{
                showMessage("Help")
                return true
            }
            R.id.menuExit->{
                showMessage("Exit")
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showMessage(text:String){
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}
