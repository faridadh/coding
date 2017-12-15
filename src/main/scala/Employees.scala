object Employees extends App{
  def solution( infos: List[(Int, Int, Int)]): List[(Int, Int, Int)] = {
    val entries = infos.flatMap{ case (id, startDate, endDate) => List((startDate,1),(endDate,-1))}
      .sortBy{case(date, count)=>date}

    convert(entries, 0)
  }

  def convert( entries:List[(Int, Int)], headCount:Int): List[(Int, Int, Int)] = {
    entries match {
      case Nil => Nil
      case head :: Nil => Nil
      case head :: second :: tail =>
        if(head._1==second._1) {
          convert( (head._1, head._2+second._2) :: tail, headCount)
        } else {
          (head._1, second._1, headCount+head._1) :: convert(second :: tail, headCount+head._1)
        }
    }
  }

  val source = List(
    (3333, 1000, 2000),
    (100, 1500,3000),
    (200, 1700,2500));

  val result = solution(source);

  result.foreach(e=>println(e._1, e._2, e._3))
}
