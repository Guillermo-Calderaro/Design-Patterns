# Chain of Responsibility Pattern

## Intent

**Avoid coupling the sender of a request to its receiver** by giving more than one object a
chance to handle the request. Chain the receiving objects and pass the request along the
chain until an object handles it.

## Applicability

Use Chain of Responsibility when
- more than one object may handle a request, and **the handler isn't known a priori**.
The handler should be ascertained automatically.
- you want to issue a request to one of several objects **without specifying the
receiver explicitly.**
- the set of objects that can handle a request should be specified **dynamically.**

## Structure

# <img src="../../../../../src/main/resources/docs/Chain of Responsibility Pattern.png" width="700" height="450">

## Pros and Cons

| Pros                                                                                                                        | Vs  |                                  Cons |
|:----------------------------------------------------------------------------------------------------------------------------|:---:|--------------------------------------:|
| 1. You can control the order of request handling.                                                                           |     | 1.Some requests may end up unhandled. |
| 2. *Single Responsibility Principle*. You can decouple classes that invoke operations from classes that perform operations. |     |                                       |
| 3. *Open/Closed Principle*.  You can introduce new handlers into the app without breaking the existing client code.         |     |                                       |

## Versions of this pattern

### The simple way in the GoF book
### The slightly more complex way
### The even more slightly complex way

## Examples found in Java Core libraries

javax.servlet.Filter#doFilter()
another example being try-catch blocks

## Examples found in this repo

# <img src="../../../../../src/main/resources/docs/Chain of Responsibility Pattern Example.PNG" width="800" height="550">
