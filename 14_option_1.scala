object Option_1 {
  def main(args: Array[String]): Unit = {
    val map = Map("apple" -> "red", "banana" -> "yellow", "orange" -> "orange")

    def check(o: Option[String]) {
      o match {
        case Some(s) => println(s)
        case None => println("not exist.")
      }
    }
    check(map.get("apple"))
    check(map.get("strawberry"))
  }
}