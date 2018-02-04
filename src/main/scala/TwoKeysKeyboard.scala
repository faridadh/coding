object TwoKeysKeyboard {
    def minSteps(n: Int): Int = {
      var ans = 0
      var d = 2
      var num = n
      while( num > 1){
        while(num % d ==0){
          ans+=d
          num = num/d
        }
        d+=1
      }

      return ans
    }

    val direction = Direction.left
  }

object Direction extends Enumeration {
  type Direction = Value
  val left, right = Value
}

