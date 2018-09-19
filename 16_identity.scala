object Identitiy {
  def main(args: Array[String]): Unit = {
    val domain1 = new Domain(1, "necomura")
    val domain2 = domain1

    println(domain1 eq domain2)
    println(domain2 ne domain2)

    val domain3 = new Domain(1, "necomura")

    println(domain1 eq domain3)
    println(domain1 ne domain3)
  }
}

class Domain(val id: Long, val name: String) {
  def canEqual(other: Any): Boolean = {
    other.isInstanceOf[Domain]
  }

  override def equals(other: Any): Boolean = {
    other match {
      case that: Domain => that.canEqual(this) && id == that.id && name == that.name
      case _ => false
    }
  }

  override def hashCode(): Int = {
    val prime = 41
    prime * (prime + id.hashCode) + name.hashCode
  }
}

// identity (同一性)
// equality of reference
// when objects A and B were present, two were identical object
