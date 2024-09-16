package com.niantic.models;

import java.util.HashMap;
import java.util.Map;

public class Card implements Comparable<Card> {
    private String suit;
    private String faceValue;

    public Card(String suit, String faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public String getSuit() {
        return suit;
    }

    public String getFaceValue() {
        return faceValue;
    }

    public int getPointValue() {
        return cardValues.get(faceValue);
    }

    public String getColor() {
        switch (suit.toLowerCase()) {
            case "hearts":
            case "diamonds":
                return "Red";
            default:
                return "Black";
        }
    }

    // lookup map
    private static final Map<String, Integer> cardValues = new HashMap<>() {{
        put("A", 11);
        put("K", 10);
        put("Q", 10);
        put("J", 10);
        put("10", 10);
        put("9", 9);
        put("8", 8);
        put("7", 7);
        put("6", 6);
        put("5", 5);
        put("4", 4);
        put("3", 3);
        put("2", 2);
    }};
    private static final Map<String, Integer> suitOrder = new HashMap<>() {{
        put("Spades", 0);
        put("Hearts", 1);
        put("Diamonds", 2);
        put("Clubs", 3);

    }};

    private static final Map<String, Integer> faceValueOrder = new HashMap<>() {{

        put("2", 0);
        put("3", 1);
        put("4", 2);
        put("5", 3);
        put("6", 4);
        put("7", 5);
        put("8", 6);
        put("9", 7);
        put("10", 8);
        put("J", 9);
        put("Q", 10);
        put("K", 11);
        put("A", 13);



    }};

    @Override
    public int compareTo(Card o) {
        int compareSuit = Integer.compare(suitOrder.get(this.suit), suitOrder.get(o.suit));
        if (compareSuit != 0) {

            return compareSuit;

        } else {
            return Integer.compare(faceValueOrder.get(this.faceValue), faceValueOrder.get(o.faceValue));
        }
    }
}