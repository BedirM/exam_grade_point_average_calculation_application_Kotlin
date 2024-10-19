// kütüphenelerimi import ettim
package com.example.myapplication1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Girdileri ve buton tanımladım
        val input_vize = findViewById<TextInputEditText>(R.id.input_vize)
        val input_final = findViewById<TextInputEditText>(R.id.input_final)
        val button = findViewById<Button>(R.id.button)
        val sonuc = findViewById<TextView>(R.id.sonuc)

        // Butona tıklandığı zaman hesaplama yapmasını istedim
        button.setOnClickListener {
            val vizeNotu = input_vize.text.toString().toDoubleOrNull()
            val finalNotu = input_final.text.toString().toDoubleOrNull()

            // Eğer boş değer girilmişse kullanıcıya bir uyarı ver (bu tasarımsal olarak TextViewde sadece number seçilerek halledilse de algoritma olarak eklemek istedim)
            if (vizeNotu == null || finalNotu == null) {
                sonuc.text = "Lütfen geçerli bir not giriniz."
            }
            else{
                val ortalama = (vizeNotu * 0.4) + (finalNotu * 0.6)
                sonuc.text = "Ortalama: %.2f".format(ortalama)
        }
    }
  }
}
