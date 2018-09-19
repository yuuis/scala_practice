object PatternMatchConstructor {
  case class Person(val name: String, val age: Int, val education: String)

  def main(args: Array[String]): Unit = {
    val person = Person("necomura", 2, "none")

    val belongTo = person match {
      case Person("inuoka", _, "high school") => "inu"
      case Person("necomura", _, "none") => "neco"
      case _ => "general citizen"
    }
    
    println(belongTo)
  }
}
