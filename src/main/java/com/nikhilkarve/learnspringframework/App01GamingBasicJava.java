package com.nikhilkarve.learnspringframework;

import com.nikhilkarve.learnspringframework.game.*;

public class App01GamingBasicJava {
    public static void main(String[] args) {

/*
  *      You have two game classes, but to execute one you have to pass
  *      object of that to the GameRunner.class.
  *      This causes lot code changes whenever you want to change something, and you lose generalization.
*/

//        var marioGame = new MarioGame();
//        var superContraGame = new SuperContraGame();
        var pacmanGame = new PacmanGame();
        var gameRunner = new GameRunner(pacmanGame);
        gameRunner.run();
    }
}
