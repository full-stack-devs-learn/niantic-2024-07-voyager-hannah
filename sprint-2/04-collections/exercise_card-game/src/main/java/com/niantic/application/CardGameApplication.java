package com.niantic.application;

import com.niantic.models.Card;
import com.niantic.models.Deck;
import com.niantic.models.Player;
import com.niantic.models.Hand;
import com.niantic.ui.UserInterface;

import java.util.*;

import static com.niantic.ui.UserInterface.displayAllPlayersCards;

public class CardGameApplication {

    private Deck deck;
    private ArrayList<Player> players;
    private final Scanner input = new Scanner(System.in);
    private Player winner;

    public CardGameApplication(List<Player> players) {
        this.players = new ArrayList<>(players);
        this.deck = new Deck();
        this.winner = new Player("no winner");
    }

    public Integer drawCardsAndSum() {
        if (deck.getCardCount() < 2) {
            return null;
        }
        Card firstCard = deck.takeCard();
        Card secondCard = deck.takeCard();

        int firstCardNumber = firstCard.getValue();
        int secondCardNumber = secondCard.getValue();
        return firstCardNumber + secondCardNumber;
    }

    public void run() {

        System.out.println("Welcome to the Craps Game!");

        boolean continuePlaying = true;

        while (continuePlaying) {
            deck.shuffle();
            dealCards();
            findWinner();
            displayAllPlayersCards(players);

            for (Player player : players) {
                System.out.println(" It's " + player.getName() + "'s turn");
                System.out.println("Press enter to draw cards");
                input.nextLine();

                playTurn(player);


                Integer rollSum = drawCardsAndSum();
                if (rollSum == null) {
                    System.out.println("No cards left");
                    continuePlaying = false;
                    return;
                }

                player.addResult(rollSum);
                System.out.println(player.getName() + " " + "drew cards totaling" + " " + rollSum);

                if (rollSum == 7 || rollSum == 11) {
                    System.out.print(player.getName() + " " + "wins!");
                    winner = player;
                    continuePlaying = false;
                    break;
                } else if
                (rollSum == 2 || rollSum == 3 || rollSum == 12) {
                    System.out.println(player.getName() + " " + "loses!");
                    continuePlaying = false;
                    break;
                } else {
                    System.out.println("Continue playing..");

                }
            }
            if (continuePlaying) {
                System.out.println("Do you want to continue playing? (y/n");
                String response = input.nextLine();
                if (!response.equalsIgnoreCase("y")) {
                    continuePlaying = false;
                    System.out.println("Game Over. The winner is: " + winner.getName());
                } else {
                    deck = new Deck(); // Recreate and shuffle the deck
                    deck.shuffle();


                    for (Player player : players) {
                        player.getHand().clear();
                    }

                    dealCards();
                    displayAllPlayersCards(players);
                }
            }
        }
    }


    private void startGame() {
        dealCards();
    }


    private void dealCards() {
        deck.shuffle();

        for (int i = 0; i < 2; i++) {
            for (Player player : players) {
                if (deck.getCardCount() > 0) {
                    Card card = deck.takeCard();
                    player.dealTo(card);
                }

            }
        }
    }

    private void playTurn(Player player) {
        if (deck.getCardCount() < 2) {
            System.out.println("The deck is empty. Reshuffling...");
            deck = new Deck();
            deck.shuffle();

        }
    }
    private void findWinner() {
        for (Player player : players) {
            int points = player.getHandValue();
            if (points > winner.getHandValue() && points <= 7) {
                winner = player;
            }
        }
    }

            }



