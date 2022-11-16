# Visitor Pattern

## Intent

Represent an operation to be performed on the elements of an object structure. Visitor
lets you define a new operation without changing the classes of the elements on which it
operates.

## Applicability

Use the Visitor pattern when
- an object structure contains many classes of objects with differing interfaces,
and you want to perform operations on these objects **that depend on their
concrete classes.**
- many distinct and unrelated operations need to be performed on objects in an
object structure, and you want to avoid "polluting" their classes with these
operations. Visitor lets you keep related operations together by defining them in
one class. **When the object structure is shared by many applications, use Visitor
to put operations in just those applications that need them.**
- the classes defining the object structure rarely change, but you often want to
define new operations over the structure. Changing the object structure classes
requires redefining the interface to all visitors, which is potentially costly. If the
object structure classes change often, then it's probably better to define the
operations in those classes.

## Structure

# <img src="../../../../../src/main/resources/docs/Visitor Pattern.png" width="700" height="450">

## Pros and Cons

| Pros                                                                                                                                                                                                                                                        | Vs  |                                                                                                                             Cons |
|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:---:|---------------------------------------------------------------------------------------------------------------------------------:|
| 1. Open/Closed Principle. You can introduce a new behavior that can work with objects of different classes without changing these classes.                                                                                                                  |     |                         1.You need to update all visitors each time a class gets added to or removed from the element hierarchy. |
| 2. Single Responsibility Principle. You can move multiple versions of the same behavior into the same class.                                                                                                                                                |     | 2.Visitors might lack the necessary access to the private fields and methods of the elements that they’re supposed to work with. |
| 3. A visitor object can accumulate some useful information while working with various objects. This might be handy when you want to traverse some complex object structure, such as an object tree, and apply the visitor to each object of this structure. |     |                                                                                                                                  |


## Consequences:

- Visitor makes adding new operations easy.
- A visitor gathers related operations and separates unrelated ones.
- Adding new ConcreteElement classes is hard.
- Visiting across class hierarchies.
- Accumulating state.
- Breaking encapsulation.

## Implementation Issues:

1. Double dispatch: This is the key to the Visitor pattern: The operation that gets executed depends
   on both the type of Visitor and the type of Element it visits.
2. Who is responsible for traversing the object structure?

## Examples found in this repo

### Initial State

# <img src="../../../../../src/main/resources/docs/Visitor Pattern Example -Initial State.PNG" width="700" height="450">

### Wrong solution

# <img src="../../../../../src/main/resources/docs/Visitor Pattern Example -Wrong Solution.PNG" width="700" height="450">

### Using Visitor

# <img src="../../../../../src/main/resources/docs/Visitor Pattern Example -Wrigth Solution.PNG" width="700" height="450">
# <img src="../../../../../src/main/resources/docs/Visitor Pattern Example -Wrigth Solution-Visitor.PNG" width="700" height="450">
