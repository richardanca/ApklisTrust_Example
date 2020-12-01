package com.example.apklistrustexample

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import cu.uci.z17.apklistrust.Verify

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pair = Verify.isPurchased(this, "com.example.nova.prosalud")

        Toast.makeText(this, pair.second + pair.first.toString(), Toast.LENGTH_LONG).show()
    }
}