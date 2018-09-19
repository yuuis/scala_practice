object Car {
  def main(args: Array[String]) {
    val car = new Car("white")
    car.run
  }
  private def output(message: String): Unit = println(message)
}

class Car(color: String) {
  def run () {
    Car.output("start!!")
  }
}

// companion object
// a singleton object with the same name as the class in the same source file

// companion class
// a class with the same name as a singleton object in the same source file

// companion objects and companion classes can access private members of each other