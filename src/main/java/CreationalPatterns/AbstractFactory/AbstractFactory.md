# Abstract Factory Pattern

## Intent

Provide an interface for creating families of related or dependent objects without
specifying their concrete classes

## Applicability

Use the Abstract Factory pattern when
 - a system should be independent of how its products are created, composed, and
represented.
 - a system should be configured with one of multiple families of products.
 - a family of related product objects is designed to be used together, and you need
to enforce this constraint.
 - you want to provide a class library of products, and you want to reveal just their
   interfaces, not their implementations.

## Structure

# <img src="../../../../../src/main/resources/docs/Abstract Factory Pattern.png" width="700" height="250">

## Pros and Cons

| Pros                                                                                                  | Vs  |                                                                          Cons |
|:------------------------------------------------------------------------------------------------------|:---:|------------------------------------------------------------------------------:|
| 1. You can clone objects without coupling to their concrete classes.                                  |     | 1.Cloning complex objects that have circular references might be very tricky. |
| 2. You can get rid of repeated initialization code in favor of cloning pre-built prototypes.          |     |                                                                               |
| 3. You can produce complex objects more conveniently.                                                 |     |                                                                               |    
| 4. You get an alternative to inheritance when dealing with configuration presets for complex objects. |     |                                                                               |   

## Implementation

## Examples found in Spring Framework

- Spring Bean Factory Interface
- Application Context Interface