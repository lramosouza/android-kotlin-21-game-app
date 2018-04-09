package br.com.felipe.a21game

/**
 * Created by logonrm on 05/02/2018.
 */
class CartaDAO{
    private val baralho = listOf<Carta>(
        Carta(R.drawable.as_de_espada, 1),
        Carta(R.drawable.dois_de_espada, 2),
        Carta(R.drawable.tres_de_espada, 3),
        Carta(R.drawable.quatro_de_espada, 4),
        Carta(R.drawable.cinco_de_espada, 5),
        Carta(R.drawable.seis_de_espada, 6),
        Carta(R.drawable.sete_de_espada, 7),
        Carta(R.drawable.oito_de_espada, 8),
        Carta(R.drawable.nove_de_espada, 9),
        Carta(R.drawable.dez_de_espada, 10),
        Carta(R.drawable.dama_de_espada, 10),
        Carta(R.drawable.valete_de_espada, 10),
        Carta(R.drawable.rei_de_espada, 10)
    )

    fun getBaralho() : List<Carta>{
        return baralho
    }

}