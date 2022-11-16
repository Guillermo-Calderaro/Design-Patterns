# Prototype Pattern

## Intent
Specify the kinds of objects to create using a prototypical instance, and create new
objects by copying this prototype.

## Applicability

Use the Prototype pattern when a system should be independent of how its products are
created, composed, and represented; and
 - when the classes to instantiate are specified at run-time, for example, by
dynamic loading; or
 - to avoid building a class hierarchy of factories that parallels the class hierarchy
of products; or
 - when instances of a class can have one of only a few different combinations of
state. It may be more convenient to install a corresponding number of prototypes
and clone them rather than instantiating the class manually, each time with the
appropriate state.

## Structure

# <img src="../../../../../src/main/resources/docs/Prototype Pattern.png" width="500" height="200">

## Pros and Cons

| Pros                                                                                                  | Vs  |                                                                          Cons |
|:------------------------------------------------------------------------------------------------------|:---:|------------------------------------------------------------------------------:|
| 1. You can clone objects without coupling to their concrete classes.                                  |     | 1.Cloning complex objects that have circular references might be very tricky. |
| 2. You can get rid of repeated initialization code in favor of cloning pre-built prototypes.          |     |                                                                               |
| 3. You can produce complex objects more conveniently.                                                 |     |                                                                               |    
| 4. You get an alternative to inheritance when dealing with configuration presets for complex objects. |     |                                                                               |   

## Implementation

Implementation in Java is trivial. Just implement the Clonable interface

```
public interface Clonable {
    protected native Object clone() throws CloneNotSupportedException;
}
```

## Examples found in Spring Framework

 - Prototype scope for beans @Prototype

From the documentation of BeanFactory 
```
* <p>This interface is implemented by objects that hold a number of bean definitions,
* each uniquely identified by a String name. Depending on the bean definition,
* the factory will return either an independent instance of a contained object
* (the Prototype design pattern), or a single shared instance (a superior
* alternative to the Singleton design pattern, in which the instance is a
* singleton in the scope of the factory). Which type of instance will be returned
* depends on the bean factory configuration: the API is the same. 
```