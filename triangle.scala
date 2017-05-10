object Triangle {
  def searchRight(): Unit = {
    for (c <- 1 to 1000; b <- 1 to c; a <- 1 to b) {
      if (a*a + b*b == c*c) {
        println("(" + a.toString + ", " + b.toString + ", " + c.toString + ")")
      }
    }
  }
}
