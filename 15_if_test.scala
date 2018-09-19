import java.io.File

object IfTest {
  def main(args: Array[String]): Unit = {
    val filename = if(args.isEmpty) "config.txt" else args(0)

    println(filename)
  }
}
