package com.example.casinomobile

import com.example.casinomobile.enum.Rank
import com.example.casinomobile.enum.Suit

class Card (var rank: Rank, var suit: Suit){

    private var cardName: String = ""

    init {
        cardName = Rank.Ace.rankName + " of " + Suit.Club.suitName
    }

}