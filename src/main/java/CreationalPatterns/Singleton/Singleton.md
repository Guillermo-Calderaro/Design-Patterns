# Singleton Pattern

## Intent
Ensure a class only has one instance, and provide a global point of access to it.

## Structure
# <img src="../../../../../src/main/resources/docs/Singleton Pattern.png" width="500" height="200">

## Aplicability

Use the Singleton pattern when
- there must be exactly one instance of a class, and it must be accessible to clients
from a well-known access point.
- when the sole instance should be extensible by subclassing, and clients should
be able to use an extended instance without modifying their code.
## Pros and Cons

| Pros                                                                                | Vs  |                                                                                                                                                                                                                                                                                                                                                                                                         Cons |
|:------------------------------------------------------------------------------------|:---:|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| 1. You can be sure that a class has only a single instance.                         |     |                                                                                                                                                                                                                                                                                                                 1.Violates the Single Responsibility Principle. The pattern solves two problems at the time. |
| 2. You gain a global access point to that instance.                                 |     |                                                                                                                                                                                                                                                                                2.The Singleton pattern can mask bad design, for instance, when the components of the program know too much about each other. |
| 3. The singleton object is initialized only when it’s requested for the first time. |     |                                                                                                                                                                                                                                                             3. The pattern requires special treatment in a multithreaded environment so that multiple threads won’t create a singleton object several times. |    
|                                                                                     |     | 4. It may be difficult to unit test the client code of the Singleton because many test frameworks rely on inheritance when producing mock objects. Since the constructor of the singleton class is private and overriding static methods is impossible in most languages, you will need to think of a creative way to mock the singleton. Or just don’t write the tests. Or don’t use the Singleton pattern. |


## Examples found in Spring Framework

- Spring Bean Factory Interface
- Application Context Interface
- The majority of AspectJ aspects are singleton aspects.
- TrueClassFilter in package org.springframework.aop;
- TrueMethodMatcher in package org.springframework.aop;
- SingletonAspectInstanceFactory in package org.springframework.aop.aspectj;
- BeanFactoryAspectInstanceFactory in package org.springframework.aop.aspectj.annotation;

The singleton universe in Spring seems pretty vast. See for example registerSingleton() method in DefaultSingletonBeanRegistry class.
