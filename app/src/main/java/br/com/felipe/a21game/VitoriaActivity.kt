package br.com.felipe.a21game

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_estourou_pontuacao.*

class VitoriaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vitoria)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)

        tvPontuacaoFinal.text = intent.getStringExtra("PONTUACAO")

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
