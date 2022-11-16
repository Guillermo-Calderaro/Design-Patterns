# Flyweight Pattern

## Intent

Use **sharing** to support large numbers of fine-grained objects **efficiently**.

## Applicability
The Flyweight pattern's effectiveness depends heavily on how and where it's used. 
Apply the Flyweight pattern when **all of the following are true**: 
 - An application uses a **large number of objects**. 
 - **Storage costs** are high because of the sheer quantity of objects. 
 - Most object state can be made **extrinsic**. 
 - Many groups of objects may be replaced by relatively few **shared objects** once 
extrinsic state is removed. 
 - The application **doesn't depend on object identity**. Since flyweight objects may 
be shared, identity tests will return true for conceptually distinct objects.


## Structure

# <img src="../../../../../src/main/resources/docs/Flyweight Pattern.png" width="700" height="450">

## Pros and Cons

| Pros                                                                                  | Vs  |                                                                                                                                                Cons |
|:--------------------------------------------------------------------------------------|:---:|----------------------------------------------------------------------------------------------------------------------------------------------------:|
| 1.   You can **save lots of RAM**, assuming your program has tons of similar objects. |     | 1. You might be **trading RAM over CPU cycles** when some of the context data needs to be recalculated each time somebody calls a flyweight method. |
|                                                                                       |     |    2. **The code becomes much more complicated**. New team members will always be wondering why the state of an entity was separated in such a way. |

## Implementation Issues

1. Divide fields of a class that will become a flyweight into two parts:

    the intrinsic state: the fields that contain unchanging data duplicated across many objects

    the extrinsic state: the fields that contain contextual data unique to each object

2. Leave the fields that represent the intrinsic state in the class, but make sure they’re immutable. They should take their initial values only inside the constructor.

3. Go over methods that use fields of the extrinsic state. For each field used in the method, introduce a new parameter and use it instead of the field.

4. Optionally, create a factory class to manage the pool of flyweights. It should check for an existing flyweight before creating a new one. Once the factory is in place, clients must only request flyweights through it. They should describe the desired flyweight by passing its intrinsic state to the factory.

5. The client must store or calculate values of the extrinsic state (context) to be able to call methods of flyweight objects. For the sake of convenience, the extrinsic state along with the flyweight-referencing field may be moved to a separate context class.

## Examples found in Core Java Libraries

java.lang.Integer#valueOf(int) (also Boolean, Byte, Character, Short, Long and BigDecimal)

**Identification**: Flyweight can be recognized by a creation method that returns cached objects instead of creating new.

## Example in this repo
### Initial State

# <img src="../../../../../src/main/resources/docs/Flyweight Initial State.PNG" width="300" height="450">

### Final State

# <img src="../../../../../src/main/resources/docs/Flyweight Final State.PNG" width="700" height="450">

