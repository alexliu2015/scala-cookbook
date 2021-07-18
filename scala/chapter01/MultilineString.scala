package chapter01

object MultilineString {
  def main(args: Array[String]): Unit = {
    val foo =
      """
        |this is
        |a multiline
        |string
        |""".stripMargin

    println(foo)

    val speech =
      """four thousand
        |years ago
        |our fathers""".stripMargin.replaceAll("\n", " ")

    println(speech)


  }
}
