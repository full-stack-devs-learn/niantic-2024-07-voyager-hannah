package com.niantic.application;

import com.niantic.models.Card;
import com.niantic.models.Deck;
import com.niantic.models.Player;
import com.niantic.ui.UserInterface;

import java.util.*;


public class CardGameApplication {

    Deck deck = new Deck();
    ArrayList<Player> players = new ArrayList<>();
    private final Scanner input = new Scanner(System.in);
    Player winner = new Player("no winner");

    public void CrapsGame (List<Player> players) {
        this.players = new ArrayList<>(players);
    }

    public int drawCardsAndSum() {
        Card firstCard = deck.takeCard();
        Card secondCard = deck.takeCard();

        int firstCardNumber = firstCard.getValue();
        int secondCardNumber = secondCard.getValue();
       int rollSum = firstCardNumber + secondCardNumber;
       return rollSum;
    }

            public void run () {

                System.out.println("Welcome to the Craps Game!");
                addPlayers();
                dealCards();
                UserInterface.displayAllPlayersCards(players);
                findWinner();

                boolean continuePlaying = true;

                while(continuePlaying) {
                    for (Player player : players) {
                        System.out.println("The deck is empty");
                        deck = new Deck();
                        

                        System.out.println(" It's " + player.getName() + "'s turn" );
                        System.out.print("Press enter to draw cards");
                        input.nextLine();





                        }
                    }
                }


            private void startGame () {
                addPlayers();
                dealCards();
            }

            private void findWinner () {
                for (Player player : players) {
                    int points = player.getHandValue();
                    if (points > winner.getHandValue() && points <= 7) {
                        winner = player;
                    }
                }
            }

            private void dealCards () {
                deck.shuffle();

                for (int i = 0; i < 2; i++) {
                    for (Player player : players) {
                        Card card = deck.takeCard();
                        player.dealTo(card);
                    }

                }
            }

            private void addPlayers () {
                players.add(new Player("Spongebob"));
                players.add(new Player("Patrick"));
            }
        }


