package com.dicoding.ngitungumur

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var edt_tgl_lahir = findViewById<EditText>(R.id.edt_tgl_lahir)
        var btn_klik = findViewById<Button>(R.id.btn_klik)
        var tv_hasil = findViewById<TextView>(R.id.tv_hasil)

//        aksi
        btn_klik.setOnClickListener {
            val input = edt_tgl_lahir.text.toString()
            val hasil = when (input.toInt()){
                in 1992..1998 -> "Tua Bangka Lu!!!"
                in 1999..2010 -> "Gen Z"
                in 2010..2023 -> "Masih Bocah Lu!!!"
                else -> "Gak tau Mas!!"
            }

            tv_hasil.text = "Kamu itu $hasil"
        }

    }
}