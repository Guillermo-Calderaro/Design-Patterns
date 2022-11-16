# Memento Pattern

## Intent

*Without violating encapsulation*, **capture and externalize an object's internal state**
so that the object can be **restored** to this state later.
This is required when implementing checkpoints and undo mechanisms.
A **memento** is an object that stores a snapshot of the internal state 
of another object—the memento's **originator**.
Only the originator can store and retrieve information from the
memento— the memento is "opaque" to other objects.

## Applicability

Use the Memento pattern when
 - a snapshot of (some portion of) an object's state must be saved so that it can
be restored to that state later, *and*
 - a direct interface to obtaining the state would expose implementation details
and break the object's encapsulation.

## Structure

# <img src="../../../../../src/main/resources/docs/Memento Pattern.PNG" width="700" height="450">

## Pros and Cons

| Pros                                                                                                               | Vs  |                                                                                                                                         Cons |
|:-------------------------------------------------------------------------------------------------------------------|:---:|---------------------------------------------------------------------------------------------------------------------------------------------:|
| 1. You can produce snapshots of the object’s state without violating its encapsulation.                            |     |                                                                   1. The app might consume lots of RAM if clients create mementos too often. |
| 2. You can simplify the originator’s code by letting the caretaker maintain the history of the originator’s state. |     |                                               2. Caretakers should track the originator’s lifecycle to be able to destroy obsolete mementos. |
|                                                                                                                    |     | 3.Most dynamic programming languages, such as PHP, Python and JavaScript, can’t guarantee that the state within the memento stays untouched. |


## Consequences:

The Memento pattern has several consequences:
1. *Preserving encapsulation boundaries*. 
2. *It simplifies Originator*. 
3. *Using mementos might be expensive*. 
4. *Hidden costs in caring for mementos*. A caretaker is responsible for deleting the
   mementos it cares for. However, the caretaker has no idea how much state is in the memento. Hence an otherwise lightweight caretaker might incur large
   storage costs when it stores mementos

## Examples found in this repo

# <img src="../../../../../src/main/resources/docs/Memento Pattern Example.PNG" width="700" height="450">
