# quarkus-reproducer-testresource-init

This demonstrates the current (1.4.2.Final and 1.5.0.CR1) behavior in Quarkus where every QuarkusTestResource detected at classpath is initialized at startup of each test.

## Demonstrating the QuarkusTestResource startup behavior

The effect is shown when calling:
```
./mvnw -Dtest=FruitTest clean test
```
The console output shows that FruitTestResource and HelloTestResource are initialized even though FruitTest just references FruitTestResource.

Even executing NoResourceTest initializes both QuarkusTestResources.

## TestResource stop behavior

Another interesting output is that every TestResource is stopped three times. I added ÀnotherNoResourceTest` just to be sure the number of stop calls doesn't correlate to the number of test classes in the project.