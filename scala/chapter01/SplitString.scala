package chapter01

object SplitString {
  def main(args: Array[String]): Unit = {
    val s1 = "Hello World"
    val afterSplit1 = s1.split(" ")
    val afterSplit2 = s1.split(' ')
//    check difference with using double quote and single quote
    println(afterSplit1.getClass)
    println(afterSplit2.getClass)

    afterSplit1.foreach(println)

    println("____________________")
    val s2 = "eggs, milk, butter, Coco Puffs"
    s2.split(",").map(_.trim).foreach(println)


  }
}
