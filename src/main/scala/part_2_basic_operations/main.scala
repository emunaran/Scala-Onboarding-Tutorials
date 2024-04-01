package part_2_basic_operations

import part_1_basic_constructs.Point

object main {
  def main(args: Array[String]): Unit = {

    // Let's create some case class objects to play with
    val point_1 = Point(1, 2)
    val point_2 = Point(1, 2)
    val point_3 = Point(2, 3)
    val point_4 = Point(2, 0)

    /**
     * Structural equality - also known as value equality, is a concept in programming languages that determines whether
     * two objects have the same structure and content, regardless of their memory addresses or references.
     */
    println(s"point_1 == point_2 ? ${point_1.equals(point_2)}")
    println(s"point_1 == point_3 ? ${point_1.equals(point_3)}")

    /**
     * Pattern matching - is a powerful feature in programming languages like Scala that allows you to match a value
     * against a pattern and execute code based on the match. It provides a concise and expressive way to handle
     * different cases or conditions. In Scala, pattern matching is typically used with the match keyword,
     * which resembles a switch statement in other languages but is far more flexible and powerful.
     */
    def checkPoint(point: Point): Unit = point match {
      case Point(0, 0) => println("Origin")
      case Point(_, 0) => println("On X-axis")
      case Point(0, _) => println("On Y-axis")
      case Point(x, y) => println(s"Arbitrary point at ($x, $y)")
    }

    checkPoint(point_1)
    checkPoint(point_4)

    /**
      In Scala, the map operation is used to transform each element of a collection (such as a List, Set, or Array)
      according to a specified function. The map function applies the provided function to each element of the
      collection and returns a new collection containing the results of these transformations.
     */

    val numbers = List(1, 2, 3, 4, 5)

    // Doubling each element using map
    val doubledNumbers = numbers.map(x => x * 2)

    println(doubledNumbers) // Output: List(2, 4, 6, 8, 10)


  }
}
