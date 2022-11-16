# Composite Pattern

## Intent

**Compose objects into tree structures** to represent part-whole hierarchies. Composite lets
clients treat individual objects and compositions of objects **uniformly**.

## Applicability

Use the Composite pattern when
 - you want to **represent part-whole hierarchies** of objects.
 - you want clients to be able to ignore the difference between compositions of
objects and individual objects. **Clients will treat all objects** in the composite
structure **uniformly**

## Structure

# <img src="../../../../../src/main/resources/docs/Composite Pattern.PNG" width="700" height="450">

## Pros and Cons

| Pros                                                                                                                                                   | Vs  |                                                                                                                                                                                                                    Cons |
|:-------------------------------------------------------------------------------------------------------------------------------------------------------|:---:|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| 1. You can work with **complex tree structures** more conveniently: use **polymorphism and recursion** to your advantage.                              |     | 1.It might be difficult to provide a common interface for classes whose functionality differs too much. In certain scenarios, you’d need to **overgeneralize** the component interface, making it harder to comprehend. |
| 2. *Open/Closed Principle*. You can introduce new element types into the app without breaking the existing code, which now works with the object tree. |     |                                                                                                                                                                                                                         |


## Examples found in this repo

# <img src="../../../../../src/main/resources/docs/Composite Example.PNG" width="800" height="550">



