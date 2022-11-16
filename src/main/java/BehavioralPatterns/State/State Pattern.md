# State Pattern

## Intent

Allow an object to alter its behavior when its internal state changes. The object will
appear to change its class.

## Applicability

Use the **State pattern** in either of the following cases:

 - An **object's behavior depends on its state**, and it must change its behavior at runtime depending on that state.
 - Operations have large, **multipart conditional statements** that depend on the
object's state. This state is usually represented by one or more enumerated
constants. Often, several operations will contain this same conditional structure.
The State pattern puts each branch of the conditional in a separate class. This
lets you treat the object's state as an object in its own right that can vary
independently from other objects.

## Structure

# <img src="../../../../../src/main/resources/docs/State Pattern.png" width="700" height="450">

## Pros and Cons

| Pros                                                                                                        | Vs  |                                                                                                                                                                                                                Cons |
|:------------------------------------------------------------------------------------------------------------|:---:|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| 1. *Single Responsibility Principle*. Organize the code related to particular states into separate classes. |     | 1.The overall complexity of the code increases because you need to introduce a set of new interfaces and classes. Sometimes it’s simpler just to change the service class so that it matches the rest of your code. |
| 2. *Open/Closed Principle*. Introduce new states without changing existing state classes or the context.    |     |                                                                                                                                                                                                                     |
| 3. Simplify the code of the context by eliminating bulky state machine conditionals.                        |     |                                                                                                                                                                                                                     |


## Consequences:

 - It localizes state-specific behavior and partitions behavior for different states.
 - It makes state transitions explicit.
 - State objects can be shared

## Implementation Issues:

1. Who defines the state transitions?
2. Creating and destroying State objects.

## Examples found in this repo

# <img src="../../../../../src/main/resources/docs/State Pattern Example.PNG" width="700" height="450">

# <img src="../../../../../src/main/resources/docs/State Pattern FlowChart Example.PNG" width="700" height="450">
