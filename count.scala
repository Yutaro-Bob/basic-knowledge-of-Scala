case class SymbolCount(sym:Symbol, num:Int)

def countS:
 (SymbolCount) => Symbol
 =
 (a)=>
 /**
  *purpose:get Symbol from SymbolCount
  *instance:SymbolCount(a) => Symbol
  */
 {a match{case SymbolCount(x, y) => x}}


def countN:
 (SymbolCount) => Int
 =
 (a) =>
 /**
  *purpose:get Int from SymbolCount
  *instance:SymbolCount(a) => Int
  */
 {a match{case SymbolCount(x, y) => y}}

def countMatch:
 (Symbol, List[SymbolCount]) => List[SymbolCount]
 =
 (s, l) =>
 /**
  *purpose:+1 if there are the same string as Symbol,append it if there are not
  *instance:countMatch('a, List(SymbolCount('cat,1), SymbolCount('a,1))) => List(SymbolCount('cat,1), SymbolCount('a,2))
  */
 {l match{case e::rest if s == countS(e) => SymbolCount(s, countN(e)+1)::rest
          case e::rest if s != countS(e) => e::countMatch(s, rest)
          case Nil => List(SymbolCount(s, 1))
        }
 }

def counts:
 (List[Symbol]) => List[SymbolCount]
 =
 (n) =>
 /**
  *purpose:count it as devide List[Symbol]
  *instance:counts(List('a,'cat)) => List(SymbolCount('cat,1), SymbolCount('a,1))
  */
 {n match{case Nil => Nil
          case e::rest => countMatch(e, counts(rest))
            }
 }
