package com.nikhilkarve.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    record Person(String name, int age) {}
    @Bean
    public String name() {
        return "Nikhil";
    }

    @Bean
    public int age(){
        return 24;
    }

    @Bean
    public Person person(){
        var person = new Person("Ninad", 19);
        return person;
    }

//    Defining relationship between beans using method calls
    @Bean
    public Person personMethodCall(){
        var Person = new Person(name(), age());
        return Person;
    }

//    Defining relationship between beans by passing beans as parameters.
    @Bean
    public Person parameterPerson(String name, int age){
        var Person = new Person(name, age);
        return Person;
    }
}
