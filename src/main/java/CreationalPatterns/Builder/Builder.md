# Builder Pattern

## Intent
Separate the construction of a complex object from its representation so that the same
construction process can create different representations.

## Structure
# <img src="../../../../../src/main/resources/docs/Builder Pattern.png" width="500" height="200">

## Aplicability

Use the Builder pattern when
- the algorithm for creating a complex object should be independent of the parts
that make up the object and how they're assembled.
- the construction process must allow different representations for the object that's
constructed.
## Pros and Cons

| Pros                                                                                                                  | Vs  |                                                                                                   Cons |
|:----------------------------------------------------------------------------------------------------------------------|:---:|-------------------------------------------------------------------------------------------------------:|
| 1. You can construct objects step-by-step, defer construction steps or run steps recursively.                         |     | The overall complexity of the code increases since the pattern requires creating multiple new classes. |
| 2. You can reuse the same construction code when building various representations of products.                        |     |                                                                                                        |
| 3. Single Responsibility Principle. You can isolate complex construction code from the business logic of the product. |     ||    
                                                                                        


## Examples found in Spring Framework

 - RequestedContentTypeResolverBuilder found in package org.springframework.web.reactive.accept
 - UriComponentsBuilder found in package org.springframework.web.util.
   Provides fine-grained control over all aspects of preparing a URI. A guide here: [UricompomentBuilder](https://www.baeldung.com/spring-uricomponentsbuilder)
 - DefaultRenderingBuilder found in package org.springframework.web.reactive.result.view
 - WebHttpHandlerBuilder found in package org.springframework.web.server.adapter

## Code vignette
### UriComponentsBuilder
```
@Test
public void constructUri() {
   UriComponents uriComponents = UriComponentsBuilder.newInstance()
      .scheme("http").host("www.baeldung.com").path("/junit-5").build();

   assertEquals("/junit-5", uriComponents.toUriString());
}
```