package com.codecool.playingcards.service;

import com.codecool.playingcards.model.*;
import com.codecool.playingcards.presentation.Card;
import com.codecool.playingcards.presentation.CardGenerator;

import java.util.List;

public class DeckBuilderImpl implements DeckBuilder {

    private final CardGenerator cardGenerator;
    private final DeckDescriptor deckDescriptor;

    public DeckBuilderImpl(CardGenerator cardGenerator, DeckDescriptor deckDescriptor) {
        this.cardGenerator = cardGenerator;
        this.deckDescriptor = deckDescriptor;
    }

    @Override
    public Deck createDeck() {
        List<Card> cards = cardGenerator.generate(deckDescriptor);
        return new Deck(cards);
    }
}