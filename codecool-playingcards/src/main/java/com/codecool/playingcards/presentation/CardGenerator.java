package com.codecool.playingcards.presentation;

import com.codecool.playingcards.model.DeckDescriptor;

import java.util.List;

public interface CardGenerator {
    List<Card> generate(DeckDescriptor deckDescriptor);
}
