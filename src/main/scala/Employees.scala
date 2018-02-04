object Employees extends App{
  case class EmployeeInfo(id:Int, startDate:Int, endDate:Int)
  case class Entry(direction:Int, date:Int)
  case class IntervalCount(startDate:Int, endDate:Int, count:Int)

  def solution( infos: List[EmployeeInfo]): List[IntervalCount] = {
    val entries = infos.flatMap{ info => List(Entry(1, info.startDate),Entry(-1,info.endDate))}
      .sortBy(_.date)

    convert(entries, 0)
  }

  def convert( entries:List[Entry], headCount:Int): List[IntervalCount] = {
    entries match {
      case Nil => Nil
      case head :: Nil => Nil
      case head :: second :: tail =>
        if(head.date==second.date) {
          convert(
            Entry(head.direction+second.direction, head.date ) :: tail,
            headCount)
        } else {
          val intervalCount = IntervalCount(head.date, second.date, headCount+head.direction)
          val rest = convert(second :: tail, headCount+head.direction)
          intervalCount :: rest
        }
    }
  }

  val source = List(
    EmployeeInfo(3333, 1000, 2000),
    EmployeeInfo(2000, 1200, 2000),
    EmployeeInfo(100, 1500,3000),
    EmployeeInfo(200, 1700,2500))

  val result = solution(source)

  result.foreach(println(_))
}
