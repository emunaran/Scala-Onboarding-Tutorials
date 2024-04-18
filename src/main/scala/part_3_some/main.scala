package part_3_some

/***
 * Tutorial: Scala Option Type
 *
 * This tutorial focuses on the use of the `Option` type in Scala, which provides a functional way to handle
 * situations where a value may or may not be present. The `Option` type serves as a container for an optional value,
 * representing either `Some(value)` if the value exists or `None` if it is absent. By using `Option`, Scala code
 * becomes safer and more concise, avoiding null pointer exceptions and undefined behavior.
 *
 * Scenario:
 * The tutorial demonstrates a scenario where a function called `findElement` is implemented to search for an element
 * in a list of integers. Instead of directly returning the element, `findElement` returns an `Option[Int]`, where
 * `Some(value)` indicates the element is found, and `None` indicates it's not.
 *
 * Key Concepts:
 * - Introduction to the `Option` type in Scala
 * - Handling potentially absent values using `Some` and `None`
 * - Utilizing pattern matching to handle `Option` results effectively
 *
 * Overall, this tutorial provides a practical example of leveraging `Option` in Scala to write more robust and
 * error-resilient code when dealing with optional values.
 */
object main extends App {
  // Define a function to search for an element in a list
  def findElement(list: List[Int], target: Int): Option[Int] = {
    val index = list.indexOf(target)
    if (index != -1) {
      Some(list(index)) // Return Some(value) if element found
    } else {
      None // Return None if element not found
    }
  }

  // Example usage
  val myList = List(1, 2, 3, 4, 5)

  // Search for elements
  val result1 = findElement(myList, 3) // Element exists in the list
  val result2 = findElement(myList, 6) // Element doesn't exist in the list

  // Handle results
  result1 match {
    case Some(value) => println(s"Element found: $value")
    case None => println("Element not found")
  }

  result2 match {
    case Some(value) => println(s"Element found: $value")
    case None => println("Element not found")
  }
}

