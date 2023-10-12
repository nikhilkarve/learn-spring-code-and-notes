package com.nikhilkarve.learnspringframework;

import com.nikhilkarve.learnspringframework.game.GameRunner;
import com.nikhilkarve.learnspringframework.game.GamingConsole;
import com.nikhilkarve.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
