case class Plate(name:Symbol, price:Int)

def platePrice:
 (Plate) => Int
 =
 (p) =>
 /**
  *purpose:get Int from Plate
  *instance:latePrice(Plate('A,800)) => 800
  */
 {p match{case Plate(a, b) => b
     }
 }


def isOK:
 (Int, List[Plate]) => Boolean
 =
 (a, b) =>
 /**
  *purpose:when you receive the maxmum budget and price of the menus,
           return true if you can eat all of them, if not false
  *instance:isOK(1000,List(Plate('A,800),Plate('B,1000))) => true
  *         isOK(1000,List(Plate('A,800),Plate('B,1200))) => false
  *         isOK(1000,Nil) => false
  */
 {b match{case Nil => false
             case e::Nil if platePrice(e) <= a => true
             case e::rest if platePrice(e) > a => false
             case e::rest if platePrice(e) <= a => isOK(a, rest)
            }
 }
