package com.nikhilkarve.learnspringframework.game;

// Now that we have an interface, we don't have to change this class everytime there is a new game like earlier.
// This will run fine with any game now.
public class GameRunner {

    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }
    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
