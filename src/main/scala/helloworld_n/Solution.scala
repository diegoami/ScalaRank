package helloworld_n

object Solution {
  var sin = scala.io.StdIn

  def f(n: Int) =  {
    for (x <- 1 to n ) {
      print("Hello World\n")
    }
  }

  def main(args: Array[String]) {
    var n = sin.readInt
    f(n);
  }
}