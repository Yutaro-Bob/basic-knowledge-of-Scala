def subtractList:
(List[Int], Int) => List[Int]
=
/**
*purpose:subtract one number from the other and  make list
*instance:subtractList(List(1, 2, 3, 4, 5), 3) => List(-2, -1, 0, 1, 2)
*/
(lst, n) =>
{lst match{
    case Nil => Nil
    case e::Nil => List(e-n)
    case e::rest => List(e-n):::subtractList(rest, n)
}}

def findMax:
(List[Int], Int) => Int
=
/**
*purpose:get the max number comparing the other 
*instance:findMax(List(1, 2, 3, 4, 5), 3) == 5
*/
(lst1, m) =>
{lst1 match{
    case Nil => m
    case e::Nil => if ((e-m) >= 0) e
                    else m
    case e::rest => if ((e-m) >= 0) findMax(rest, e)
                    else findMax(rest, m)
}}

def profitList:
List[Int] => List[Int]
=
/**
*purpose:get the one element in list and make the list of max profit for this
*instance:minus(List(40,3,30,1,5) => List(0, 27, 0, 4, 0)
*/
(lst2) =>
{lst2 match{
    case Nil => Nil
    case e::rest => findMax(subtractList(rest, e),0)::profitList(rest)
}}

def maxprofit:
List[Int] => Int
=
/**
*purpose:maxmum the profit of stack price in list and get the value
*instance:maxprofit(List(1, 2, 3, 4, 5)) => 4
*   maxprofit(List(5,4,3,2,1)) => 0
*   maxprofit(List(1,2,30,4,5)) => 29
*   maxprofit(List(10,2,30,4,5)) => 28
*   maxprofit(List(40,3,30,1,5)) => 27
*/
(lst3) => 
{lst3 match{
    case e::Nil => 0
    case _ => findMax(profitList(lst3), 0)
}}
