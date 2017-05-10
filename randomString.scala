object RandomString {
  def generate1000() {
    for (i <- 1 to 1000) {
      var list5: List[Char] = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList
      list5 match {
        case List(a, b, c, d, e) =>
          println(List(a,b,c,d,a).mkString)
        case _ =>
          println("nothing")
      }
    }
  }
}
