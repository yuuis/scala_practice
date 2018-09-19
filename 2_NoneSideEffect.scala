object NoneSideEffect {
  def main(args: Array[String]) {
    var add = (x: Int) => x + 5

    println(add(1))
    println(add(1))
    println(add(1))
  }
}