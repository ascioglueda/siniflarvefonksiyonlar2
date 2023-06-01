package com.edaascioglu.siniflarvefonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


private var Any.text: String
    get() {}
    set() {}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        sinifCalismasi()


    }
    fun sinifCalismasi(textView: Any) {
        var superman=Superkahraman()
        superman.isim="Superman"
        superman.meslek=="Gazeteci"
        superman.yas=50


        textView.text ="Yaş:${superman.yas}"
        var superman=Superkahraman("Superman",50,"Gazeteci")
        textView.text="Yaş:${superman.yas}"

    }
}