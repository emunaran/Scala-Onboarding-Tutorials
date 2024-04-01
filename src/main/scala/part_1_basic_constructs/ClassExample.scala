package part_1_basic_constructs

/**
  A class in Scala is a blueprint for creating objects.
  It's defined using the class keyword followed by its name and optionally a parameter list.
  Classes can have mutable state and behavior.
  Instances of classes can be created using the new keyword.
 */
class ClassExample(type_name: String = "Scala Class", val creator: String, val purpose: String) {

  def greet(): Unit = println(s"Hello, my type is $type_name object. My creator is $creator, and my purpose is $purpose.")

  /**
   * Here's an example of accessing a private attribute using a getter. In this case, type_name is designated as
   * private because it lacks the "val" or "var" prefix in the class parameter definition.
   * @return type_name
   */
  def get_type_name(): String = {
    this.type_name
  }
}
