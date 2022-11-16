# Fecade Pattern

## Intent

Provide a **unified interface to a set of interfaces in a subsystem**. Facade defines a higher-level interface that makes the subsystem easier to use.

## Applicability

Use the Facade pattern when
 - you want to provide a **simple interface to a complex subsystem**. Subsystems
often get more complex as they evolve. Most patterns, when applied, result in
more and smaller classes. This makes the subsystem more reusable and easier to
customize, but it also becomes harder to use for clients that don't need to
customize it. A facade can provide a simple default view of the subsystem that is
good enough for most clients. Only clients needing more customizability will
need to look beyond the facade.
 - there are **many dependencies between clients and the implementation classes** of
an abstraction. Introduce a **facade to decouple** the subsystem from clients and
other subsystems, thereby promoting subsystem independence and portability.
 - you want to **layer your subsystems**. Use a facade to define an entry point to each
subsystem level. If subsystems are dependent, then you can simplify the
dependencies between them by making them communicate with each other
solely through their facades.

## Structure

# <img src="../../../../../src/main/resources/docs/Fecade Pattern.png" width="800" height="550">

## Pros and Cons

| Pros                                                             | Vs  |                                                                 Cons |
|:-----------------------------------------------------------------|:---:|---------------------------------------------------------------------:|
| 1.  You can isolate your code from the complexity of a subsystem |     | 1.A facade can become a god object coupled to all classes of an app. |

## Implementation Issues

1. Check whether it’s possible to provide a simpler interface than what an existing subsystem already provides. You’re on the right track if this interface makes the client code independent from many of the subsystem’s classes.

2. Declare and implement this interface in a new facade class. The facade should redirect the calls from the client code to appropriate objects of the subsystem. The facade should be responsible for initializing the subsystem and managing its further life cycle unless the client code already does this.

3. To get the full benefit from the pattern, make all the client code communicate with the subsystem only via the facade. Now the client code is protected from any changes in the subsystem code. For example, when a subsystem gets upgraded to a new version, you will only need to modify the code in the facade.

4. If the facade becomes too big, consider extracting part of its behavior to a new, refined facade class.

## Example in this repo

# <img src="../../../../../src/main/resources/docs/Fecade Example.PNG" width="800" height="450">


