package chapter01

object LoopString {
  def main(args: Array[String]): Unit = {
    val s = "hello world"

    s.replaceAll(" ", "").map(_.toUpper).foreach(println)

    println("----------------------------------")
    def toUpper(c: Char): Char = {
      c.toUpper
    }
    s.replaceAll(" ", "").map(toUpper).foreach(println)
  }
}
