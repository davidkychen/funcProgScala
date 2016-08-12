package assignment

object Exercise1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def pascal(c: Int, r: Int): Int =
  	if(r==0||c==0||c==r) 1
  	else pascal(c, r-1) + pascal(c-1,r-1)     //> pascal: (c: Int, r: Int)Int
  	
  pascal(1,3)                                     //> res0: Int = 3
  pascal(3,6)                                     //> res1: Int = 20
  
}