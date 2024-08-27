package com.niantic;

import com.niantic.application.CardGameApplication;
import com.niantic.models.Player;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create initial players
        List<Player> initialPlayers = Arrays.asList(
                new Player("Spongebob"),
                new Player("Patrick")
        );

        // Create the game with the initial players
        CardGameApplication game = new CardGameApplication(initialPlayers);
        game.run();
    }
}
//public class Main
//{
  //  public static void main(String[] args)
 //   {
  //      CardGameApplication game = new CardGameApplication();
  //      game.run();
   // }
//}
