# Decorator Pattern

## Intent

Attach **additional responsibilities** to an object **dynamically**. Decorators provide a
flexible **alternative to subclassing** for extending functionality.

## Applicability

Use Decorator
 - to add responsibilities to individual objects **dynamically and transparently**, that
is, without affecting other objects.
 - for **responsibilities that can be withdrawn**.
 - **when extension by subclassing is impractical**. Sometimes a large number of
independent extensions are possible and would produce an explosion of
subclasses to support every combination. Or a class definition may be hidden or
otherwise unavailable for subclassing.

## Structure

# <img src="../../../../../src/main/resources/docs/Decorator Pattern.PNG" width="700" height="450">

## Pros and Cons

| Pros                                                                                                                                                     | Vs  |                                                                                                                           Cons |
|:---------------------------------------------------------------------------------------------------------------------------------------------------------|:---:|-------------------------------------------------------------------------------------------------------------------------------:|
| 1. You can **extend an object’s behavior** without making a new subclass.                                                                                |     |                                                         1. It’s **hard to remove** a specific wrapper from the wrappers stack. |
| 2. You can **add or remove responsibilities** from an object at **runtime**.                                                                             |     | 2. It’s hard to implement a decorator in such a way that its behavior doesn’t **depend on the order** in the decorators stack. |
| 3. You can **combine several behaviors** by wrapping an object into multiple decorators.                                                                 |     |                                                            3. The initial configuration code of layers might look pretty ugly. |
| 4. *Single Responsibility Principle*. You can divide a monolithic class that implements many possible variants of behavior into several smaller classes. |     |                                                                                                                                |


## Example found in this repo

# <img src="../../../../../src/main/resources/docs/Decorator Example.PNG" width="800" height="550">



