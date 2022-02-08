package com.example.forcaerp20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class LoginActivity : AppCompatActivity() {
    private lateinit var Setting_btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()//ngilangin bar atas

        val SettingtDialog = AlertDialog.Builder(this)
        Setting_btn= findViewById(R.id.setting)

        Setting_btn.setOnClickListener {
            val view = View.inflate(this,R.layout.setting_popup,null)
            val builder = SettingtDialog.setView(view)
            val dialog = builder.create()
            dialog.show()
            dialog.setCancelable(true)
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

            val confrimbtn = view.findViewById<Button>(R.id.btn_ok_url)

            confrimbtn.setOnClickListener{
                dialog.dismiss()
            }
        }
    }
}