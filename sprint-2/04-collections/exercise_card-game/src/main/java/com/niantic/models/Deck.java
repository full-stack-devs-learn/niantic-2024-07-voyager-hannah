package com.niantic.models;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        // build the deck of cards
        cards = new ArrayList<>();
 //two decks of cards
        for (int i = 0; i < 2; i++) {
            for (int number = 1; number <= 6; number++) {
                cards.add(new Card(number));
            }

        }
        shuffle();

    }

    public int getCardCount() {
        return cards.size();
    }

    public Card takeCard() {
        Card card = cards.removeFirst();
        return card;

    }
        public void shuffle ()
        {
            Collections.shuffle(cards);
        }
    }



