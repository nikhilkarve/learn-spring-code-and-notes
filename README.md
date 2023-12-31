Commit #1: Why is coupling important?
Coupling is important everywhere.
 - An engine is tightly coupled to a car. 
 - A wheel is loosely coupled to a car.
 - You can take a laptop anywhere you go.
 - A computer, on the other hand, is a little bit more difficult to move.

Coupling is even more important in building great software.
- Only thing constant in technology is change.
  - Business requirements change.
  - Frameworks change.
  - Code changes.

Hence, we want loose coupling as much as possible. 
We want to make functional changes with less code changes as possible.

-------------------------------------------------------------------------------------

Commit #2: Adding interface to make your code loosely coupled.
- The key point is that an interface doesn't just allow you to write one class which implements it, it allows you to write several.

- When you have code which interacts with a class by using an interface, that code is able to work together with any class which implements said interface, regardless of how it implements it. 
- That allows you to feed different classes to the same code without having to modify it.

-------------------------------------------------------------------------------------

Commit #3: Setting up a basic Spring application.
  - What is application context?
    Imagine the context as a place in the memory of your app in which we add all the object instances that we want the framework to manage. To enable Spring to see your objects, you need to add them to the context.
  - We use @Bean annotation to add beans to the application context.
  - In the code you will see two methods by which relationship between beans is established. One is using method calls and the other one is by passing parameters

-------------------------------------------------------------------------------------

What is Spring Container / Spring context / IoC container?
Spring Container manages spring beans and their lifecycle.
Two popular types 

Bean factory: Basic Spring container.

Application Context: Advanced Spring Container with enterprise-specific features.
Easy to use in web applications.
Easy internationalization.
Easy integration with Spring AOP.

Which one to use? Most enterprise applications use Application Context.

-------------------------------------------------------------------------------------

Java Bean: Classes adhering to 3 contraints:

    - Have public default (no argument) constructors.
    - Allow access to their properties using getter and setter method.
    - Implement java.io.Serializable

POJO: Plain Old Java Object
    
    - No contraints.
    - Any Java Object is a POJO.

Spring Bean: Any Java object that is managed by Spring.
    
    - Spring uses IOC container (Bean factory or Application Context)  to manage these objects.

-------------------------------------------------------------------------------------

How can I list all the beans managed by Spring?

    context.getBeanDefinitionNames()

What if multiple matching beans are available?

    @Primary, @Qualifier