# Observer Pattern

## Intent

Define a one-to-many dependency between objects so that when one object changes
state, all its dependents are notified and updated automatically.

## Motivation

# <img src="../../../../../src/main/resources/docs/Observer Pattern Motivation.PNG" width="700" height="450">

## Applicability

Use the Observer pattern in any of the following situations:
 - When an **abstraction has two aspects, one dependent on the other**. Encapsulating
these aspects in separate objects lets you vary and reuse them independently.
 - When **a change to one object requires changing others**, and you don't know how
many objects need to be changed.
 - When an object should be able to notify other objects without making
assumptions about who these objects are. In other words, **you don't want these
objects tightly coupled.**

## Structure

# <img src="../../../../../src/main/resources/docs/Observer Pattern.PNG" width="700" height="450">

## Pros and Cons

| Pros                                                                                                                                                               | Vs  |                                        Cons |
|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------|:---:|--------------------------------------------:|
| 1. Open/Closed Principle. You can introduce new subscriber classes without having to change the publisher’s code (and vice versa if there’s a publisher interface) |     | 1.Subscribers are notified in random order. |
| 2. You can establish relations between objects at runtime.                                                                                                         |     |                                             |


## Consequences:

- **The Observer pattern lets you vary subjects and observers independently.**
- Abstract coupling between Subject and Observer.
- Support for broadcast communication.
- Unexpected updates.

## Implementation Issues

- Mapping subjects to their observers.
- Observing more than one subject.
- Who triggers the update? Here are two options:
  - Have state-setting operations on Subject call Notify after they change the
  subject's state.
  - Make clients responsible for calling Notify at the right time.
- Avoiding observer-specific update protocols: the push and pull models.
- Specifying modifications of interest explicitly: **aspects** (or is it Topics ;))

## Examples found in this repo

# <img src="../../../../../src/main/resources/docs/Observer Example.PNG" width="700" height="450">
