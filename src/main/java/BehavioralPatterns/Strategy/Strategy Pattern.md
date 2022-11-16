# Strategy Pattern

## Intent

Define a **family of algorithms, encapsulate each one**, and make them interchangeable.
Strategy lets the algorithm vary independently from clients that use it.

## Applicability

Use the Strategy pattern when
 - many related classes differ only in their behavior. Strategies provide a way to
**configure a class with one of many behaviors.**
 - you need different **variants of an algorithm.** For example, you might define
algorithms reflecting different space/time trade-offs. Strategies can be used
when these variants are implemented as a class hierarchy of algorithms.
 - an algorithm uses **data that clients shouldn't know about**. Use the Strategy
pattern to **avoid exposing** complex, algorithm-specific data structures.
 - a class defines many behaviors, and these appear as multiple conditional
statements in its operations. Instead of many conditionals, move related
conditional branches into their own Strategy class.

## Structure

# <img src="../../../../../src/main/resources/docs/Strategy Pattern.png" width="700" height="450">

## Pros and Cons

| Pros                                                                                                        | Vs  |                                                                                                                                                                                                                Cons |
|:------------------------------------------------------------------------------------------------------------|:---:|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| 1. *Single Responsibility Principle*. Organize the code related to particular states into separate classes. |     | 1.The overall complexity of the code increases because you need to introduce a set of new interfaces and classes. Sometimes it’s simpler just to change the service class so that it matches the rest of your code. |
| 2. *Open/Closed Principle*. Introduce new states without changing existing state classes or the context.    |     |                                                                                                                                                                                                                     |
| 3. Simplify the code of the context by eliminating bulky state machine conditionals.                        |     |                                                                                                                                                                                                                     |


## Consequences:

- Families of related algorithms
- An alternative to subclassing.
- Strategies eliminate conditional statements.
- A choice of implementations.
- Communication overhead between Strategy and Context.
- Clients must be aware of different Strategies. The client passes a concrete strategy to the context.

## Examples found in this repo

# <img src="../../../../../src/main/resources/docs/Strategy Pattern Example.PNG" width="700" height="450">
