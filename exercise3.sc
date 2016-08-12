package assignment

object exercise3 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def countChange(money: Int, coins: List[Int]): Int = {
		if (money==0) 1
		else if (money < 0) 0
		else if (money > 0 && coins.isEmpty) 0
		else countChange(money - coins.head, coins) + countChange(money, coins.tail)
  }                                               //> countChange: (money: Int, coins: List[Int])Int
	
	countChange(5, List(1,2))                 //> res0: Int = 3
	
}