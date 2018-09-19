object SideEffect {
  var total = 0
  
  def main(args: Array[String]) {
    val add = (x: Int) => {
      total += x
      total
    }

    println(add(1))
    println(add(1))
    println(add(1))
  }
}