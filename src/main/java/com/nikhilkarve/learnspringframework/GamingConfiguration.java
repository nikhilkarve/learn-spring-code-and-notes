package com.nikhilkarve.learnspringframework;

import com.nikhilkarve.learnspringframework.game.GameRunner;
import com.nikhilkarve.learnspringframework.game.GamingConsole;
import com.nikhilkarve.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game(){
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
