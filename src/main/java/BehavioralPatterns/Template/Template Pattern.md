# Template Pattern

## Intent

Define the **skeleton of an algorithm** in an operation, **deferring some steps to subclasses**.
Template Method lets **subclasses redefine certain steps of an algorithm** without
changing the algorithm's structure.

## Applicability

The Template Method pattern should be use
 - to implement the **invariant parts** of an algorithm once and leave it up to
**subclasses** to implement the behavior that can vary.
 - when common behavior among subclasses should be factored and localized in a
common class to avoid code duplication. 
 - to **control subclasses extensions**. You can **define a template method that calls
"hook" operations** at specific points, thereby permitting
extensions only at those points.

## Structure

# <img src="../../../../../src/main/resources/docs/Template Method Pattern.png" width="700" height="450">

## Pros and Cons

| Pros                                                                                                                                                       | Vs  |                                                                                                                Cons |
|:-----------------------------------------------------------------------------------------------------------------------------------------------------------|:---:|--------------------------------------------------------------------------------------------------------------------:|
| 1. You can let clients override only certain parts of a large algorithm, making them less affected by changes that happen to other parts of the algorithm. |     |                                             1.Some clients may be limited by the provided skeleton of an algorithm. |
| 2. You can pull the duplicate code into a superclass.                                                                                                      |     | 2. You might violate the Liskov Substitution Principle by suppressing a default step implementation via a subclass. |
| 3. Simplify the code of the context by eliminating bulky state machine conditionals.                                                                       |     |                                         3. Template methods tend to be harder to maintain the more steps they have. |


## Consequences:

- Template methods lead to an inverted control structure that's sometimes referred to as
  "the Hollywood principle," that is, "Don't call us, we'll call you"

## Examples found in this repo

# <img src="../../../../../src/main/resources/docs/Template Method Example.PNG" width="700" height="450">

