package assignment

object exercise2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def balance(chars: List[Char]): Boolean = {
    def countBracket(chars: List[Char], count: Int): Int = {
    	if (count > 0) 1
      else if (chars.isEmpty) count
      else if (chars.head == '(') countBracket(chars.tail, count - 1)
      else if (chars.head == ')') countBracket(chars.tail, count + 1)
      else countBracket(chars.tail, count)
    }
    if (countBracket(chars, 0) == 0 ) true
    else false
    
  }                                               //> balance: (chars: List[Char])Boolean
  val x = "()()()()(ggguggg)ygyugg(gyug)uy)"      //> x  : String = ()()()()(ggguggg)ygyugg(gyug)uy)
  
  balance(x.toList)                               //> res0: Boolean = false

}