# Factory Method Pattern

## Intent

Define an interface for creating an object, but let subclasses decide which class to
instantiate. Factory Method lets a class defer instantiation to subclasses.

## Structure

# <img src="../../../../../src/main/resources/docs/Factory Method Pattern.png" width="500" height="200">

## Aplicability

Use the Factory Method pattern when
 - a class can't anticipate the class of objects it must create.
 - a class wants its subclasses to specify the objects it creates.
 - classes delegate responsibility to one of several helper subclasses, and you want
to localize the knowledge of which helper subclass is the delegate. 

## Pros and Cons

| Pros                                                                                                                                         | Vs  |                                                                                                                                                                                                                              Cons |
|:---------------------------------------------------------------------------------------------------------------------------------------------|:---:|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| 1. You avoid tight coupling between the creator and the concrete products.                                                                   |     | 1.The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern. The best case scenario is when you’re introducing the pattern into an existing hierarchy of creator classes. |
| 2. Single Responsibility Principle. You can move the product creation code into one place in the program, making the code easier to support. |     |                                                                                                                                                                                                                                   |
| 3. Open/Closed Principle. You can introduce new types of products into the program without breaking existing client code.                    |     |                                                                                                                                                                                                                                   |    
|                                                                                                                                              |     |                                                                                                                                                                                                                                   |


## Examples found in Spring Framework

In spring every bean has its factory method. 
See RootBeanDefinition class

```
	/**
	 * Set a resolved Java Method for the factory method on this bean definition.
	 * @param method the resolved factory method, or {@code null} to reset it
	 * @since 5.2
	 */
	public void setResolvedFactoryMethod(@Nullable Method method) {
		this.factoryMethodToIntrospect = method;
	}

```