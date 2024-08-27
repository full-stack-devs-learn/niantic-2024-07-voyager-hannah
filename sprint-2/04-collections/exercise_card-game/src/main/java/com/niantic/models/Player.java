package com.niantic.models;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private Hand hand;
    private List<Integer> results;


    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
        this.results = new ArrayList<>();

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


    public void addResult(int result) {
        results.add(result);
    }

    public List<Integer> getResults() {
        return new ArrayList<>(results);
    }
    public void clearHand() {
        hand.clear();
    }
    @Override
    public String toString() {
        return name + " has hand value of " + getHandValue();
    }

}


