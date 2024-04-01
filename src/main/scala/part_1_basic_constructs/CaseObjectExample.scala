package part_1_basic_constructs

/**
  A case object is similar to an object, but it also brings along some features of case classes.
  Like case classes, case objects automatically define equality (equals and hashCode methods) and can be pattern matched.
  It's commonly used to define messages in Akka or as elements of algebraic data types.
 */
case object ValidMessage {
  val be_nice: String => String = (original_msg: String) => s"Hello, $original_msg."
}
case object InvalidMessage

object StamClassOrObjectDefinition {
  def handleMessage(msg: Any, question: String): Unit = msg match {
    case ValidMessage => println(s"Received message from the type: ${ValidMessage.be_nice(question)}")
    case _ => println("Unknown message")
  }
}

//stam.handleMessage(CaseObjectExample)
