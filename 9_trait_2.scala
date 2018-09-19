object trait_2 {
  def main(args: Array[String]) {
    val man = new Man("necomura neco", "housekeeper", "professional")
    man.say
  }
}

trait Human {
  val name: String
}

trait Job {
  val job: String
}

trait Grade {
  val grade: String
}

class Man(n: String, j: String, g: String) extends Human with Job with Grade {
  val name = n
  val job = j
  val grade = g
  def say {
    println("I am " + this.name + ". my job is " + this.job + " and my grade is " + this.grade + ".")
  }
}
