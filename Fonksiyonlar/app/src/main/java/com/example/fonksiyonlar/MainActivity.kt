package com.example.fonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cikarma(10,300)

        var x = toplama(10,20)
        println(x)
        textView.text = "sonuç : ${x}"

        sinifCalismasi()
    }
    fun cikarma(x : Int,y :Int)
    {
        textView.text= "Sonuç: ${y-x}"
    }
    fun toplama (a: Int,b:Int): Int
    {
        return a + b
    }
    fun degistir(view: View)
    {
        val toplamaSonucu = toplama(10,50)
        textView.text = "sonuc : ${toplamaSonucu}"
    }
    fun sinifCalismasi()
    {

        var superman = Superkahraman("clark kent",90,"gazeteci")
        textView.text= "yaş: ${superman.yas  }"

    }
}