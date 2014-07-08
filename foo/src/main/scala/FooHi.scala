import org.scala_tools.time.Imports._
import DateTime.now

object FooHi {
  def say() = {new BarHi("Bar").say()
               println("Hi! I am Foo!!")
              }

  def main(args: Array[String]) = {
    println("Hi! Hello, World! foo!! " + (now + 6.month))
    say()
  }
}
