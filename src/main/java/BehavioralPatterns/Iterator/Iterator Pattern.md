# Iterator Pattern

## Intent

Provide a way to access the elements of an aggregate object sequentially without
exposing its underlying representation.

## Applicability

Use the Iterator pattern
 - to access an aggregate object's contents without exposing its internal
representation.
 - to support multiple traversals of aggregate objects.
 - to provide a uniform interface for traversing different aggregate structures (that
is, to support polymorphic iteration).

## Structure

# <img src="../../../../../src/main/resources/docs/Iterator Pattern.png" width="700" height="450">

## Pros and Cons

| Pros                                                                                                                                                       | Vs  |                                                                                                             Cons |
|:-----------------------------------------------------------------------------------------------------------------------------------------------------------|:---:|-----------------------------------------------------------------------------------------------------------------:|
| 1. *Single Responsibility Principle*. You can clean up the client code and the collections by extracting bulky traversal algorithms into separate classes. |     |                        1.Applying the pattern can be an overkill if your app only works with simple collections. |
| 2. *Open/Closed Principle*. You can implement new types of collections and iterators and pass them to existing code without breaking anything.             |     | 2. Using an iterator may be less efficient than going through elements of some specialized collections directly. |
| 3. You can iterate over the same collection in parallel because each iterator object contains its own iteration state.                                     |     |                                                                                                                  |
| 4. For the same reason, you can delay an iteration and continue it when needed.                                                                            |     |                                                                                                                  |


## Examples found in Java Core libraries


## Examples found in this repo

# <img src="../../../../../src/main/resources/docs/Adapter Initial State.PNG" width="800" height="550">

## Implementation issues

Implementation in java is trivial. Just extend Iterator or Iterable Interface

Fom more information about the differences between such interfaces follow this link:
[Iterator vs Iterable](https://www.baeldung.com/java-iterator-vs-iterable)

But wait! What about other data structures or even other ways of traversing a structure?
No problem, just extend one of those interfaces.