package beginhere

import scala.io.Source

object Solution {


  val getLines = Source.fromFile("src/main/scala/beginhere/beginhere.txt").getLines _

  //val getLines = io.Source.stdin.getLines _

  def main(args: Array[String]) {
    println(getLines().take(2).map(_.toInt).sum)
  }
}

