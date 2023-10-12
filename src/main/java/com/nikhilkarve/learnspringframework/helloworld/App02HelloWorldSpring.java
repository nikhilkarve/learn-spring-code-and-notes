package com.nikhilkarve.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args){
        //        Launch a spring context.
         try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
             //        Configure the things that we want spring to manage. - @Configuration
            //        Retrieving beans managed by Spring
             System.out.println(context.getBean("name"));
             System.out.println(context.getBean("person"));
             System.out.println(context.getBean("personMethodCall"));
             System.out.println(context.getBean("parameterPerson"));
         }
    }
}
