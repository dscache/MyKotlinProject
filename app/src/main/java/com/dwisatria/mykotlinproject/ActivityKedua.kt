package com.dwisatria.mykotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityKedua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        //get data from intent
        val intent = intent
        val nim = intent.getStringExtra("nim")
        val nama = intent.getStringExtra("nama")
        val nilai = intent.getStringExtra("nilai")

        var grade: String = ""

        if (nilai >= 90.toString()) grade = "A+"
        else if (nilai >= 80.toString()) grade = "A"
        else if (nilai >= 60.toString()) grade = "B"
        else if (nilai >= 40.toString()) grade = "C"
        else if (nilai >= 20.toString()) grade = "D"
        else grade = "E"
        //textview
        val result = findViewById<TextView>(R.id.result)
        //setText
        result.text = "Nim : "+nim+"\nNama : "+nama+"\nNilai Angka : "+nilai+"\nKeterangan : "+grade

    }
}
