object Matrix01Test extends App{
  val result = Matrix01.updateMatrix(Array(
    Array(0,1,0,1,1),
    Array(1,1,0,0,1),
    Array(0,0,0,1,0),
    Array(1,0,1,1,1),
    Array(1,0,0,0,1)))

  println( result)
}
