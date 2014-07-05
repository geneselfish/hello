
object FooHi {
  def say() = {new BarHi("Bar").say()
               println("Hi! I am Foo!!")
              }

  def main(args: Array[String]) = {
    println("Hi! Hello, World!!")
    say()
  }
}
