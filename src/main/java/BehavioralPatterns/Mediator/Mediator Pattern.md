# Mediator Pattern

## Intent

Define **an object that encapsulates how a set of objects interact.** 
Mediator promotes loose coupling by keeping objects from referring to each other explicitly, 
and it lets you vary their interaction independently.

A **mediator** is responsible for controlling and coordinating the
interactions of a group of objects. The mediator serves as an intermediary that
keeps objects in the group from referring to each other explicitly. The objects only
know the mediator, thereby reducing the number of interconnections.

## Applicability

Use the Mediator pattern when
- a set of objects **communicate** in well-defined but complex ways.The resulting
interdependencies are unstructured and difficult to understand.
- **reusing an object is difficult because it refers to and communicates with** many
other objects.
- a behavior that's distributed between several classes should be customizable
without a lot of subclassing

## Structure

# <img src="../../../../../src/main/resources/docs/Mediator Pattern.PNG" width="700" height="450">

## Pros and Cons

| Pros                                                                                                                                                                  | Vs  |                                                  Cons |
|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------|:---:|------------------------------------------------------:|
| 1. *Single Responsibility Principle.* You can extract the communications between various components into a single place, making it easier to comprehend and maintain. |     | 1. Over time a mediator can evolve into a God Object. |
| 2. *Open/Closed Principle.* You can introduce new mediators without having to change the actual components.                                                           |     |                                                       |
| 3. You can reduce coupling between various components of a program.                                                                                                   |     |                                                       |
| 4. You can reuse individual components more easily.                                                                                                                   |     |                                                       |


## Consequences:

The Mediator pattern has the following **benefits and drawbacks**:
1. *It limits subclassing.* A mediator localizes behavior that otherwise would be
   distributed among several objects. Changing this behavior requires subclassing Mediator only; Colleague classes can be reused as is.
2. *It decouples colleagues.* 
3. *It simplifies object protocols.* A mediator replaces many-to-many interactions
   with one-to-many interactions between the mediator and its colleagues. 
4. *It abstracts how objects cooperate.* 
5. *It centralizes control.* The Mediator pattern **trades complexity of interaction
   for complexity in the mediator.**

## Implementation Issues:

The following implementation issues are relevant to the Mediator pattern:
1. *Omitting the abstract Mediator class.* 
2. *Colleague-Mediator communication.* Colleagues have to communicate with
   their mediator when an event of interest occurs. **One approach** is to implement the Mediator **as an Observer** using the Observer pattern.
   **Another approach** defines a specialized notification interface in Mediator
   that lets colleagues be more direct in their communication. 

## Examples found in Spring Framework

# <img src="../../../../../src/main/resources/docs/Mediator Example from Spring MVC.PNG" width="700" height="450">

## Examples found in this repo

# <img src="../../../../../src/main/resources/docs/Mediator Pattern Example.PNG" width="700" height="450">
