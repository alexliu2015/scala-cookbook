package chapter01

object SplitString {
  def main(args: Array[String]): Unit = {
    val s1 = "Hello World"
    val afterSplit = s1.split(" ")
    println(afterSplit.getClass)
    afterSplit.foreach(println)

    println("____________________")
    val s2 = "eggs, milk, butter, Coco Puffs"
    s2.split(",").map(_.trim).foreach(println)


  }
}
