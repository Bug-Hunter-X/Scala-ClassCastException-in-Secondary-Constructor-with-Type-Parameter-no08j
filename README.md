# Scala ClassCastException Bug

This repository demonstrates a common Scala bug involving `ClassCastException` when using `null.asInstanceOf[T]` within a secondary constructor with a type parameter `T`. The bug occurs if `T` is not a nullable type, as `null` cannot be cast to a non-nullable type.

## Bug Description

The `MyClass` class has a secondary constructor that attempts to initialize the `value` parameter to `null` using `null.asInstanceOf[T]`. If `T` is not a nullable type, it results in a `ClassCastException` at runtime.

## How to Reproduce

1. Clone this repository.
2. Compile and run the `MyClass` class with a non-nullable type parameter (e.g., `Int`).
3. Observe the `ClassCastException`. 

## Solution

The solution is to either:

1. Make `T` nullable (`T?`)
2. Provide a default value of the same type of T in the primary constructor.
3. Use Option[T] instead of T to represent values that may or may not be present.

The solution is demonstrated in `MyClassSolution.scala`.