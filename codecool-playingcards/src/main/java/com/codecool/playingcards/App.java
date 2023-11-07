package com.codecool.playingcards;


import com.codecool.playingcards.model.*;
import com.codecool.playingcards.presentation.CardGenerator;
import com.codecool.playingcards.presentation.ConsoleLogger;
import com.codecool.playingcards.service.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        CardGenerator cardGenerator = new CardGeneratorImpl(logger); // We can change this class to any other that implements the same interface, and we'll cause no breaking changes anymore

        DeckBuilder frenchDeckBuilder = new DeckBuilderImpl(cardGenerator, DeckDescriptors.FRENCH_DECK_DESCRIPTOR);
        DeckBuilder germanDeckBuilder = new DeckBuilderImpl(cardGenerator, DeckDescriptors.GERMAN_DECK_DESCRIPTOR);
        List<Deck> decks = buildDecks(new DeckBuilder[]{frenchDeckBuilder, germanDeckBuilder});

        printCardCounts(decks);


    }


    private static List<Deck> buildDecks(DeckBuilder[] builders) {
        List<Deck> decks = new ArrayList<>();
        for (DeckBuilder builder : builders) {
            decks.add(builder.createDeck());
        }
        return decks;
    }

    ;

    private static void printCardCounts(List<Deck> decks) {
        for (Deck deck : decks) {
            System.out.println(deck.getCardCount());
        }
    }


}
