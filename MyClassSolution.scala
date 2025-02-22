```scala
class MyClass[T](val value: T) {
  def this(defaultValue: T) = this(defaultValue)
}

//Or
class MyClass2[T](val value: Option[T])
```