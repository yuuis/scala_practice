class User(val id: Long, val firstname: String, val lastname: String, val fullname:Fullname = new Fullname) {
  def getFullname() = this.fullname.get(firstname, lastname)
}

class Fullname() {
  def get(firstname: String, lastname: String) = firstname + " " + lastname
}

class FullnameInJapan() extends Fullname {
  override def get(firstname: String, lastname: String) = lastname + " " + firstname
}


val neco = new User(1, "neco", "necomura")
println(neco.getFullname)

val inu = new User(2, "inu", "inuoka", new FullnameInJapan)
println(inu.getFullname)