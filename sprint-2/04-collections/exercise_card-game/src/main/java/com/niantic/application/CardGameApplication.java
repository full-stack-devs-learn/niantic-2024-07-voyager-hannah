package com.niantic.application;

import com.niantic.models.Card;
import com.niantic.models.Deck;
import com.niantic.models.Player;
import com.niantic.models.Hand;
import com.niantic.ui.UserInterface;

import java.util.*;

import static com.niantic.ui.UserInterface.displayAllPlayersCards;

public class CardGameApplication {

    //declaring variable to hold deck of cards
    private Deck deck;
    //declares list to keep track of all players in the game
    private ArrayList<Player> players;
    //read user input
    private final Scanner input = new Scanner(System.in);
    //variable stores winner
    private Player winner;

    // constructor, creates list of players
    public CardGameApplication(List<Player> players) {
        //initialize players list
        this.players = new ArrayList<>(players);
        // creating new deck
        this.deck = new Deck();
        // default
        this.winner = new Player("no winner");
    }

    //drawing 2 cards from the deck and returning sum
    public Integer drawCardsAndSum() {
        //if fewer then 2 cards left return null
        if (deck.getCardCount() < 2) {
            return null;
        }
        //draws 1st and second card
        Card firstCard = deck.takeCard();
        Card secondCard = deck.takeCard();

        //gets values of 1st and 2nd card
        int firstCardNumber = firstCard.getValue();
        int secondCardNumber = secondCard.getValue();
        return firstCardNumber + secondCardNumber;
    }

    //running game...
    public void run() {

        System.out.println("Welcome to the Craps Game!");
        //controls the game loop
        boolean roundContinues = true;

        while (roundContinues) {
            // shuffle, deal, who's winning?
            deck.shuffle();
            dealCards();
            //findWinner();
            //shows all players cards-- look into this
            displayAllPlayersCards(players);

            for (Player player : players) {
                System.out.println(" It's " + player.getName() +  "'s turn" );
                System.out.println("Press enter to draw cards");
                //press enter to take turn
                input.nextLine();

                //playTurn(player);

                //draws 2 cards adds them
                Integer rollSum = drawCardsAndSum();
                //if no cards game ends
               //if (rollSum == null) {
                //    System.out.println("No cards left, Replenishing.....");
                //    deck = new Deck();
                 //   deck.shuffle();
                 //   roundContinues = false;
                 //   return;
               // }
                //adding result to the players record
                player.addResult(rollSum);
                System.out.println(player.getName() + " " + "drew cards totaling" + " " + rollSum);
                //rules for winning
                if (rollSum == 7 || rollSum == 11) {
                    System.out.print(player.getName() + " " + "wins!");
                    winner = player;
                    roundContinues = true;
                    System.out.println("Continue playing..? press enter!");
                    input.nextLine();
                    break;
                    //rules for losing
                } else if
                (rollSum == 2 || rollSum == 3 || rollSum == 12) {
                    System.out.println(player.getName() + " " + "loses!");
                    System.out.println("Continue playing..? press enter!");
                    input.nextLine();

                    break;
                    //game continues
                } else {
                    player.addResult(rollSum);
                    System.out.println(player.getName() + " " + "rolled a" + " " + rollSum + " " + " this is the point. Roll the point before a 7 to win!");
                    int point = rollSum;
                    boolean playerContinues = true;
                    while (playerContinues) {
                        deck.shuffle();
                        dealCards();
                        System.out.println("Press enter to roll");
                        input.nextLine();


                        rollSum = drawCardsAndSum();
                        if (rollSum == null) {
                            //System.out.println("No cards left");
                            deck =  new Deck ();
                            deck.shuffle();
                            rollSum = drawCardsAndSum();

                            if (rollSum == null) {
                                System.out.println("Still no cards left. Exiting game.");
                                roundContinues = false;
                                playerContinues = false;
                                break;
                            }

                        }
                        player.addResult(rollSum);
                        System.out.println(player.getName() + " " + "rolled" + " " + rollSum);

                        if (rollSum == 7) {
                            System.out.println("You lose:( sorry, Try Again!");
                            playerContinues = false;
                            roundContinues = false;
                            break;

                        } else if (rollSum == point) {
                            System.out.println("YOU WIN!!!!!!");
                            winner = player;
                            roundContinues = false;
                            playerContinues = false;
                            break;

                        } else {
                            System.out.println("Roll again!");


                        }
                    }
                }
            }

            //left off here why is there 2 of both players i think it has something to do with the result

            //if game continues
            if (roundContinues) {
                System.out.println("Do you want to continue playing? (yes/no)");
                String response = input.nextLine()
                        .toLowerCase()
                        .trim();
                if (!response.equalsIgnoreCase("yes")) {
                    //if not y end game
                    roundContinues = false;
                    System.out.println("Game Over. The winner is: " + winner.getName());
                } else {
                    //creating new deck and shuffling
                    //System.out.print("Keep playing?");
                    //input.nextLine();
                    deck = new Deck();
                    deck.shuffle();

                    //clearing cards from players hands
                    for (Player player : players) {
                        player.getHand().clear();
                    }
                    //dealing new cards
                    dealCards();
                    //displayAllPlayersCards(players);

                }
            }
        }
    }

    //}

    //starts game by dealing cards
    private void startGame() {
        dealCards();
    }


    // deals 2 cards to each player
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

    //reshuffles deck if fewer then 2 cards
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






