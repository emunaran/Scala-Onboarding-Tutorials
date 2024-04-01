package part_1_basic_constructs

import part_1_basic_constructs.ObjectExample.{sayHello, sayHola}
import part_1_basic_constructs.StamClassOrObjectDefinition.handleMessage

object main {
  def main(args: Array[String]): Unit = {

    // Run Object Example
    sayHello()
    sayHola()

    // Run Case Object Example - We dont really use this..
    handleMessage(ValidMessage, "what is the time?")
    handleMessage(InvalidMessage, "what is the time?")

    // Run Class Example
    val class_object = new ClassExample(creator="Ran", purpose = "introduce my self to people for the first time")
    class_object.greet()
    val type_name = class_object.get_type_name()
    println(type_name)

    // Run Case Class Example
    val point_1 = Point(1, 2)
    val point_2 = Point(1, 2)
    val point_3 = Point(2, 3)
    val point_4 = Point(2, 0)


  }
}
