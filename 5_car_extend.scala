object CarExtends {
  def main(args: Array[String]) {
    var car = new Car("white")
    output(car)
    car.run

    var truck = new Truck("black")
    output(truck)
    truck.run
  }
  def output(car: Car): Unit = println("color is " + car.color + ".")
}

class Car(val color: String) {
  def run() = println("start!")
}

class Truck(color: String) extends Car(color) {
  override def run() = println("truck start!")
}