package br.com.felipe.a21game

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_estourou_pontuacao.*

class EstourouPontuacaoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estourou_pontuacao)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)

        tvPontuacaoFinal.text = intent.getStringExtra("PONTUACAO")

        //Ativar somente em casa
        //val mediaPlayer = MediaPlayer.create(this, R.raw.explosao)
        //mediaPlayer.start()

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
