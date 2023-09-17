package com.nikhilkarve.learnspringframework.game;


// Now that we have created this interface we don't have to change the GameRunner.class everytime there is a new game. See GameRunner.
public interface GamingConsole {
    void up();
    void down();
    void left();
    void right();

}
