object taskA_helloScala {
  def main(args: Array[String]): Unit = {
    val s: String = "Hello, world!"
    println(s)

    def makeReverse(args: String): Unit = {
      println(args.reverse)
    }
    makeReverse(s)

    def makeUpper(args: String): Unit = {
    println(args.map(_.toUpper))
    }
    makeUpper(s)

    def getSlice(args: String, leftBound: Int, rightBound: Int): Unit = {
      println(s slice (leftBound, rightBound))
    }
    getSlice(s, 0, s.size -1)

    def addString(str: String): Unit = {
      val stringToAdd = " And goodbye Python!"
      println(str + stringToAdd)
    }
    addString(s)

  }

}


