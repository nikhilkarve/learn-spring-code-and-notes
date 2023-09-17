Commit #1 . Why is coupling important?
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

Commit #2. Adding interface to make your code loosely coupled.
- The key point is that an interface doesn't just allow you to write one class which implements it, it allows you to write several.

- When you have code which interacts with a class by using an interface, that code is able to work together with any class which implements said interface, regardless of how it implements it. 
- That allows you to feed different classes to the same code without having to modify it.