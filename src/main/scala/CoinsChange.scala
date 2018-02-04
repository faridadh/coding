object CoinsChange {
  var mins: Array[Option[Int]] = Array()
  def coinChange(coins: Array[Int], amount: Int): Int = {
    mins = Array.fill(amount+1){None}
    coinChangeImpl(coins, amount)
  }

  def coinChangeImpl(coins: Array[Int], amount: Int): Int = {
    println(amount)
    if (amount < 0) {
      -1
    } else if (amount == 0) {
      0
    } else {
      mins(amount) match {
        case None => {
          val routes = coins
            .map(coin => coinChange(coins, amount - coin))
            .filter(_ >= 0)

          val min = if (routes.length == 0) -1 else routes.min + 1
          mins(amount) = Some(min)

          min
        }
        case Some(i) => {
          i
        }
      }
    }
  }
}
