package part_1_basic_constructs

/**
  A class in Scala is a blueprint for creating objects.
  It's defined using the class keyword followed by its name and optionally a parameter list.
  Classes can have mutable state and behavior.
  Instances of classes can be created using the new keyword.
 */
class ClassExample(type_name: String = "Scala Class", creator: String, purpose: String) {
  def greet(): Unit = println(s"Hello, my name is $type_name object. My creator is $creator, and my purpose is $purpose.")
}
