object trait_1 {
  def main(args: Array[String]) {
    val man = new Man
    man.sayName
  }
}


trait Human {
  val name = "necomura neco"
  def sayName() {
    println("my name is " + this.name)
  }
}

class Man extends Human