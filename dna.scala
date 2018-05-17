:paste

def getListPre:
 (List[Symbol]) => Symbol
 =
 (dna) =>
 /**
  *purpose: get the head of Symbol from List[Symbol]
  *instance:getListPre(List('a,'t)) => 'a
  */
 {dna match {case e::rest => e
             case Nil => 'Nan
             }
 }

def getListRest:
 (List[Symbol]) => List[Symbol]
 =
 (dna) =>
 /**
  *purpose: get the rest of List[Symbol] from List[Symbol]
  *instance:getListRest(List('a,'t)) => List('t)
  */
 {dna match {case e::rest => rest
             case Nil => Nil
             }
 }

def DNAprefix:
 (List[Symbol], List[Symbol]) => Boolean
 =
 (dna1, dna2) =>
 /**
  *purpose:compare the two List[Symbol] from the head, and return true if it is same Symbol, return false if it is not
  *instance:DNAprefix(List('a,'t),List('a,'t,'c)) => true
  *    DNAprefix(List('a,'t),List('a)) => false
  *     DNAprefix(List('a,'t),List('a,'t)) => true
  *     DNAprefix(List('a,'c,'g,'t),List('a,'g,'c,'t,'d)) => false
  *     DNAprefix(List('a,'a, 'c,'t),List('a,'a,'c,'t,'d)) => true
  *     DNAprefix(List('a,'a, 'c,'t),List('a,'c,'t,'d)) => false
  */
 {dna1 match {case e::Nil => if (e == getListPre(dna2)){true}
                             else {false}
              case e::rest => if (e == getListPre(dna2)){DNAprefix(rest, getListRest(dna2))}
                              else {false}
              case Nil => true
 }}
