# Adapter Pattern

## Intent

**Convert the interface of a class into another interface clients expect**. Adapter lets classes
work together that couldn't otherwise because of **incompatible interfaces**.

## Applicability

Use the Adapter pattern when
 - you want to use **an existing class**, and its interface does not match the one you
need.
 - you want to **create a reusable class** that cooperates with unrelated or unforeseen
classes, that is, classes that don't necessarily have compatible interfaces.
 - (object adapter only) you need to use several existing subclasses, but it's
impractical to adapt their interface by subclassing every one. An object adapter
can adapt the interface of its parent class.

## Structure

# <img src="../../../../../src/main/resources/docs/Adapter Pattern.png" width="700" height="450">

## Pros and Cons

| Pros                                                                                                                                                                                                 | Vs  |                                                                                                                                                                                                                Cons |
|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:---:|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| 1. *Single Responsibility Principle*. You can separate the interface or data conversion code from the primary business logic of the program.                                                         |     | 1.The overall complexity of the code increases because you need to introduce a set of new interfaces and classes. Sometimes it’s simpler just to change the service class so that it matches the rest of your code. |
| 2. *Open/Closed Principle*. You can introduce new types of adapters into the program without breaking the existing client code, as long as they work with the adapters through the client interface. |     |                                                                                                                                                                                                                     |

## Examples found in this repo

### Initial State

# <img src="../../../../../src/main/resources/docs/Adapter Initial State.PNG" width="800" height="550">

### Final State

# <img src="../../../../../src/main/resources/docs/Adapter Final State.PNG" width="700" height="450">


