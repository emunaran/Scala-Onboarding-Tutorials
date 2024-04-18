package part_3_some

/***
This tutorial concerns the use of the `Option` type in Scala to handle situations where a value may or may not be present.
In Scala, `Option` is a container for an optional value. It can be either `Some(value)` if the value is present,
or `None` if the value is absent. This is a functional way of dealing with the possibility of null values or undefined
behavior, which helps to avoid null pointer exceptions and makes the code safer and more concise.
The scenario demonstrated in the tutorial involves a function `findElement` that searches for an element in a list of
integers. Instead of returning the element directly, it returns an `Option[Int]`, where `Some(value)` is returned if
the element is found, and `None` if the element is not found.
The tutorial then illustrates how to use pattern matching to handle the results returned by the `findElement` function.
This allows for different actions to be taken based on whether the element was found or not, without the risk of
encountering null pointer exceptions.
Overall, this tutorial provides a practical example of how to use `Option` in Scala to write safer and more robust
code when dealing with potentially absent values.
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

