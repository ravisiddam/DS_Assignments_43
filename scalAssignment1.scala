package core

object scalAssignment1 {

  def main(args: Array[String]): Unit = {
    val params = new Array[String](5)
    params(0) = "alpha"
    params(1) = "gamma"
    params(2) = "omega"
    params(3) = "zeta"
    params(4) = "beta"

    val myList = List("alpha", "gamma", "omega", "zeta", "beta")
    println(myList)

    //find the count of length 4 list items
    var j = 0
    println(myList.count(s => s.length()
      == 4))

    println("length 4 list item count is " + j)

    // list with length of the items in myList
    var l = List[Int]()
    for (i <- myList) {
      l = i.length() :: l
    }
    println(l)


    //myList.forall(s => s.startswith("m"))
    var m_count = 0
    for (i <- myList) {
      if (i.contains("m")) {
        m_count += 1
      }
    }
    println("m_count is " + m_count)

    var a_count = 0
    for (i <- myList) {
      if (i.startsWith("a")) {
        a_count += 1
      }
    }


  println("a_count is " + a_count)

  // GCD

  println(gcd(25, 15))
}
  def gcd(a: Int,b: Int): Int = {
    if(b ==0) a else gcd(b, a%b)
   // println(a, b)
  }
}