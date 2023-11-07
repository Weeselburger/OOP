package com.codecool.playingcards.service;
import com.codecool.playingcards.presentation.Card;
import com.codecool.playingcards.presentation.CardGenerator;
import com.codecool.playingcards.model.DeckDescriptor;

import java.util.ArrayList;
import java.util.List;

public class CardGeneratorImpl implements CardGenerator {
    private final Logger logger;
    public CardGeneratorImpl(Logger logger){
        this.logger=logger;
    }

    public List<Card> generate(DeckDescriptor deckDescriptor) {
        return generateCards(deckDescriptor.numbers(), deckDescriptor.symbols(), deckDescriptor.suits());
    }

    private List<Card> generateCards(int[] numbers, String[] symbols, String[] suits) {
        List<Card> cards = new ArrayList<>();

        for (String suit : suits) {
            addNumberedCards(cards, suit, numbers);
            addCourtCards(cards, suit, symbols);
        }

        return cards;
    }

    private void addNumberedCards(List<Card> cards, String suit, int[] numbers) {
        for (int number : numbers) {
            addCard(cards,suit,Integer.toString(number));
        }
    }

    private void addCourtCards(List<Card> cards, String suit, String[] symbols) {
        for (String symbol : symbols) {
            addCard(cards,suit,symbol);
        }
    }
    private void addCard(List<Card> cards,String suit, String value) {
        Card card = new Card (value,suit);
        logger.logInfo(String.format("Generated card %s",card));
        cards.add(card);
    }
}
