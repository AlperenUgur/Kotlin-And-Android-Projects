package com.example.superkahramanprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    var isim = ""
    var yas : Int? = null
    var meslek = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun superKahramanYap(view: View)
    {
         isim = isimText.text.toString()
         yas = yasText.text.toString().toIntOrNull()
         meslek = meslekText.text.toString()

        if(yas == null)
        {
            sonucText.text="BİR YAŞ GİRİNİZ"
        }
        else
        {
            val superKahraman = SuperKahraman(isim,yas!!,meslek)

            sonucText.text = "İsim : ${superKahraman.isim},Yas : ${superKahraman.yas},Meslek:${superKahraman.meslek}"
        }

    }
}