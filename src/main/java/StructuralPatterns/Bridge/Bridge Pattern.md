# Bridge Pattern

## Intent

Decouple an **abstraction** from its **implementation** so that the two can vary
independently

## Applicability

Use the Bridge pattern when
 - you want to avoid a permanent binding between an abstraction and its
implementation. This might be the case, for example, when the implementation
must be selected or switched at run-time.
 - both the abstractions and their implementations should be extensible by
subclassing. In this case, the Bridge pattern lets you combine the different
abstractions and implementations and extend them independently.
 - changes in the implementation of an abstraction should have no impact on
clients; that is, their code should not have to be recompiled.
 - you have a proliferation of classes as shown earlier in the first Motivation
diagram. Such a class hierarchy indicates the need for splitting an object into
two parts. Rumbaugh uses the term "nested generalizations" [RBP+91] to refer
to such class hierarchies.
 - you want to share an implementation among multiple objects (perhaps using
reference counting), and this fact should be hidden from the client. A simple
example is Coplien's String class [Cop92], in which multiple objects can share
the same string representation (StringRep).

## Structure

# <img src="../../../../../src/main/resources/docs/Bridge Pattern.png" width="700" height="450">

## Pros and Cons

| Pros                                                                                                                                      | Vs  |                                                                                           Cons |
|:------------------------------------------------------------------------------------------------------------------------------------------|:---:|-----------------------------------------------------------------------------------------------:|
| 1. You can create platform-independent classes and apps.                                                                                  |     | 1.You might make the code more complicated by applying the pattern to a highly cohesive class. |
| 2. The client code works with **high-level abstractions**. It isn’t exposed to the platform details.                                      |     |                                                                                                |
| 3. *Open/Closed Principle*. You can introduce new abstractions and implementations independently from each other.                         |     |                                                                                                |
| 4. *Single Responsibility Principle*. You can focus on high-level logic in the abstraction and on platform details in the implementation. |     |                                                                                                |

## Examples found in this repo

# <img src="../../../../../src/main/resources/docs/Bridge Example.PNG" width="800" height="550">

