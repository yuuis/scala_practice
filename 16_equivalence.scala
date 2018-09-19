object Equivalence {
  def main(args: Array[String]): Unit = {
    val domain1 = new Domain(1, "neco")
    val domain2 = new Domain(1, "neco")

    println(domain1 == domain2)

    val domain3 = new Domain(2, "inu")
    println("==:", domain1 == domain3)
    println("!=:", domain1 != domain3)
  }
}

class Domain(val id: Long, val name: String) {
  def canEquel(other: Any): Boolean = {
    other.isInstanceOf[Domain]
  }

  override def equals(other: Any): Boolean = {
    other match {
      case that: Domain => that.canEquel(this) && id == that.id && name == that.name
      case _ => false
    }
  }

  override def hashCode(): Int = {
    val prime = 41
    prime * (prime + id.hashCode) + name.hashCode
  }
}

// Equality (等価性)
// in scala, when you use case class equels method  and hashcode method are automatically implemented.
// and if you use `==`, equals method judges.
// when objects A and B are present, two have exactly the same value
