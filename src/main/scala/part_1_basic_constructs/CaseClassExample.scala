package part_1_basic_constructs

/**
  A case class is similar to a regular class, but it brings some extra features primarily focused on immutability, pattern matching, and structural equality.
  It automatically provides implementations of methods like equals, hashCode, and toString.
  It's commonly used to represent immutable data structures.
 */
case class CaseClassExample(purpose: String)
case class Point(x: Int, y: Int)

