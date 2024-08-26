package com.niantic.models;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private Hand hand;
    private final List<Integer> resultsHistory;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
        this.resultsHistory = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void dealTo(Card card) {
        hand.dealTo(card);
    }

    public int getHandValue() {
        return hand.getPointValue();
    }

    public Hand getHand() {
        return hand;
    }

    public List<Integer> getResultsHistory() {
        return resultsHistory;
    }
}
