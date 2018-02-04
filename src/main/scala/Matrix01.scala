object Matrix01 {
  def updateMatrix(matrix: Array[Array[Int]]): Array[Array[Int]] = {
    val n = matrix.length
    val m = if(n==0) 0 else matrix(0).length
    val result = new Array[Array[Int]](n)
    for(i <- 0 to n-1){
      result(i) = new Array[Int](m)
      for(j <- 0 to m-1 ){
        result(i)(j) = if( matrix(i)(j)==0) 0 else Int.MaxValue-100000
      }
    }

    for(i <- 0 to n-1){
      for(j <- 0 to m-1 ){
        if(i>0 ) result(i)(j) = Math.min(result(i)(j), result(i-1)(j)+1)
        if(j>0 ) result(i)(j) = Math.min(result(i)(j), result(i)(j-1)+1)
      }
    }

    for(i <- n-1 to 0 by -1){
      for(j <- m-1 to 0 by -1){
        if(i<n-1) result(i)(j) = Math.min(result(i)(j), result(i+1)(j)+1)
        if(j<m-1) result(i)(j) = Math.min(result(i)(j), result(i)(j+1)+1)
      }
    }

    return result
  }
}