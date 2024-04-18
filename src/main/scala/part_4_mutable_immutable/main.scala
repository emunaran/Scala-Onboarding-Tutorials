package part_4_mutable_immutable

/**
 * Tutorial: Scala Immutable and Mutable
 *
 * This tutorial provides an introduction to Scala programming language covering foundational
 * concepts and important practices. It includes examples of immutable and mutable parameters,
 * as well as immutable and mutable collections.
 *
 * Concepts Covered:
 * - Immutable and mutable parameters in Scala functions
 * - Usage of immutable and mutable collections
 *
 * Best Practices:
 * - Prefer immutable parameters for function arguments for safer and more predictable behavior.
 * - Use mutable parameters sparingly and document their behavior clearly.
 *
 * Usage:
 * Run this script to see examples of immutable and mutable parameters, as well as immutable and
 * mutable collections in action.
 *
 */
object main extends App {
  import scala.collection.mutable.ListBuffer

  // Function with an immutable parameter
  def greet(name: String): Unit = {
    println(s"Hello, $name!")
  }

  // Function with a mutable parameter
  def increment(x: Int): Int = {
    var mutableX = x
    mutableX += 1
    println(s"Incremented value: $mutableX")
    mutableX
  }

  // Example usage
  val immutableName = "Alice"
  greet(immutableName) // Output: Hello, Alice

  var mutableValue = 5
  increment(mutableValue) // Output: Incremented value: 6
  println(s"Original value: $mutableValue") // Output: Original value: 6

  // Immutable collection example
  val immutableList = List(1, 2, 3, 4, 5)
  println("Immutable List:")
  immutableList.foreach(println)

  // Mutable collection example
  val mutableList = ListBuffer(1, 2, 3, 4, 5)
  println("Mutable List (Initial):")
  mutableList.foreach(println)

  // Add an element to the list
  mutableList += 6
  println("\nMutable List (After Addition):")
  mutableList.foreach(println)

  // Remove an element from the list
  mutableList -= 3
  println("\nMutable List (After Removal):")
  mutableList.foreach(println)

  // Update an element in the list
  mutableList(2) = 10
  println("\nMutable List (After Update):")
  mutableList.foreach(println)

}
