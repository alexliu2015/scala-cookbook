package chapter01

object SubVarToString {
  def main(args: Array[String]): Unit = {
    val name = "Fred"
    val age = 33
    val weight = 200.00

//    interpolate string with s word start
    println(s"$name is $age years old, and weighs $weight pounds.")
    println(s"next year your age is ${age + 1}")
    println(s"your age is equal to 33: ${age == 33}")

    val alex = new Student("Alex", 15)
//    when reference a object needs curly braces to include object name and variable
    println(s"${alex.name} age is ${alex.age}")

//    interpolate string with f word start
//    means formatting
    println(f"$name is $age years old, and weighs $weight%.2f pounds.")
    println(f"$name is $age years old, and weighs $weight%.0f pounds.")

//    interpolate string with raw word
    println(raw"hello\nworld")
  }
}

case class Student(name: String, age: Int)