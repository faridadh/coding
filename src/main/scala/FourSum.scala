object FourSum {
  def fourSum(nums: Array[Int], target: Int): List[List[Int]] = {
    var result = Set[List[Int]]()
    var couples = Map[Int, List[(Int,Int)]]()
    for(i <- 0 to nums.length-2; j<- i+1 to nums.length-1 ) {
      val ni = nums(i)
      val nj = nums(j)
      val c = target-ni-nj
      val matches = couples.getOrElse(c, Nil)
        .filter{case (m, n)=> m!=i && m!=j && n!=i && n!=j}
        .map( o =>List(o._1,o._2,i,j).sorted).toSet

      result = matches ++ result

      val l = couples.getOrElse(ni+nj, Nil)
      couples = couples + ( ni+nj-> ((i,j) :: l))
    }

    result.map(l=>List(nums(l(0)), nums(l(1)), nums(l(2)),nums(l(3))).sorted).toList
  }

}
