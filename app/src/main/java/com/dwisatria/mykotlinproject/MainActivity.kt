package com.dwisatria.mykotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nim = findViewById<EditText>(R.id.nim)
        val nama = findViewById<EditText>(R.id.nama)
        val nilai = findViewById<EditText>(R.id.nilai)
        val btnproses = findViewById<Button>(R.id.btnproses)

        //handle button click
        btnproses.setOnClickListener {
            //get text from edittexts
            val nim = nim.text.toString()
            val nama = nama.text.toString()
            val nilai = nilai.text.toString()

            //intent to start activity
            val intent = Intent(this@MainActivity, ActivityKedua::class.java)
            intent.putExtra("nim", nim)
            intent.putExtra("nama", nama)
            intent.putExtra("nilai", nilai)
            startActivity(intent)

        }


    }
}
