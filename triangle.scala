object Triangle {
  def searchRight(a: Int, b:Int, c:Int) {
    for (c <- 1 to 1000, b <- 1 to c, a <- 1 to 1000) {
      if (a^2 + b^2 == c^2) {
        println("(" + String(a) + String(b) + String(c) ")")
      }
    }
  }
}
