import scala.Option

class User(private val firstname: String, private val lastname: String)

object User {
  def unapply(user: User) = Option((user.firstname, user.lastname))

  def main(args: Array[String]): Unit = {
    val user = new User("necomura", "neco")
    user match {
      case User(firstname, lastname) => println(firstname + " " + lastname)
      case _ => println("not user.")
    }
  }
}