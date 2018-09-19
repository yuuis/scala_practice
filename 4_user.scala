class User(val id: Long, val firstname: String, val lastname: String) {
  def getFullname() = this.firstname + " " + this.lastname
}

// the whole class is "basic constructor", so it's unnecessary cunstructor
// attaching val or var as an argument of the basic constructor, makes it a field

val user = new User(1, "neco", "necomura")
println(user.firstname)