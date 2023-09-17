package com.nikhilkarve.learnspringframework;

import com.nikhilkarve.learnspringframework.game.GameRunner;
import com.nikhilkarve.learnspringframework.game.MarioGame;
import com.nikhilkarve.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {

/*
  *      You have two game classes, but to execute one you have to pass
  *      object of that to the GameRunner.class.
  *      This causes lot code changes whenever you want to change something, and you lose generalization.
*/
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}
