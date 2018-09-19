object FunctionExample {
  def main(args: Array[String]) {
    var calculate = (x: Int) => x + 5: Int
    println(calculate(1))
    println(calculate(2))
  }
}
