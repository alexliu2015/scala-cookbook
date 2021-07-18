package chapter01

object StringEquality {
  def main(args: Array[String]): Unit = {
    println(isEqualString("hello", "hello"))
    println(isEqualString("Hello", "hello"))
//    string concatenation
    println(isEqualString("hello", "h"+ "ello"))
//    does not throw null point exception
    println(isEqualString("hello",null))

    println(insensitiveEqualString("hello","Hello"))
//    null point exception will throw cause it try to call a method on it
    println(insensitiveEqualString("hello",null))
  }

  def isEqualString(s1: String, s2: String): Boolean = {
    s1 == s2
  }

  def insensitiveEqualString(s1: String, s2: String): Boolean = {
    if (s1 == null && s2 == null){
      true
    }else if (s1 == null || s2 == null) {
      false
    }else {
      s1.toUpperCase == s2.toUpperCase
    }
  }
}
