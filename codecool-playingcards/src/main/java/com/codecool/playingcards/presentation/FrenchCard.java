package com.codecool.playingcards.presentation;

import com.codecool.playingcards.model.FrenchSuit;

import java.util.Objects;

public class FrenchCard {
    private final String symbol;
    private final FrenchSuit suit;
    private final String title;

    public FrenchCard(String symbol, FrenchSuit suit) {
        this.symbol=symbol;
        this.suit=suit;
        title = createTitle();
    }

    ;

    public String getSymbol() {
        return symbol;
    }

    ;
    public FrenchSuit getSuit(){
        return suit;
    };
    public  String createTitle(){
        return this.symbol + " of "+ this.suit;
    }

    @Override
    public String toString(){
        return title;
    }
}
