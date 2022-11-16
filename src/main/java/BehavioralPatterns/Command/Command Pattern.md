# Command Pattern

## Intent

**Encapsulate a request as an object**, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

This pattern states that requests should be encapsulated as objects that like any other objects can be stored and passed around the application. **Requests encapsulated as objects are known as commands.**

## Applicability

Use the Command pattern when you want to
 - *parameterize objects by an action to perform*. **Commands are an object-oriented replacement for callbacks.**
 - *specify, queue, and execute requests at different times*. 
 - *support undo*. 
 - *support logging changes so that they can be reapplied in case of a system
crash*. 
 - *structure a system around high-level operations built on primitives operations*. 

## Structure

# <img src="../../../../../src/main/resources/docs/Command Pattern.PNG" width="700" height="450">

## Pros and Cons

| Pros                                                                                                                              | Vs  |                                                                                                              Cons |
|:----------------------------------------------------------------------------------------------------------------------------------|:---:|------------------------------------------------------------------------------------------------------------------:|
| 1. *Single Responsibility Principle.* You can decouple classes that invoke operations from classes that perform these operations. |     | 1. The code may become more complicated since you’re introducing a whole new layer between senders and receivers. |
| 2. *Open/Closed Principle.* You can introduce new commands into the app without breaking existing client code.                    |     |                                                                                                                   |
| 3. You can implement undo/redo.                                                                                                   |     |                                                                                                                   |
| 4. You can implement deferred execution of operations.                                                                            |     |                                                                                                                   |
| 5. You can assemble a set of simple commands into a complex one.                                                                  |     |                                                                                                                   |

## Consequences:

The Command pattern has the following consequences:
1. *Command decouples the object that invokes the operation from the one that
   knows how to perform it.*
2. *Commands are first-class objects.* They can be manipulated and extended
   like any other object.
3. *You can assemble commands into a composite command*. 
4. *It's easy to add new Commands*, because you don't have to change existing
   classes

## Implementation:

1. *How intelligent should a command be?*
2. *Supporting undo and redo*

## Examples found in this repo

# <img src="../../../../../src/main/resources/docs/Command Pattern Example.PNG" width="700" height="450">
