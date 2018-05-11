abstract class Nat
case class Zero() extends Nat
case class Succ(prev:Nat) extends Nat

def changeN:
 (Nat) => (Int)
 =
 (n) =>
 /**
  *purpose:change Nat to Int
  *instance:changeN(Succ(Succ(Zero()))) => 2
  */
 {n match{
   case Zero() => 0
   case Succ(n) => 1 + changeN(n) 
 }}

def changeI:
 (Int) => (Nat) 
 =
 (n) =>
 /**
  *purpose:change Int to Nat
  *instance:changeI(2) => Succ(Succ(Zero()))
  */
 {n match{
   case 0 => Zero()
   case m => Succ(changeI(m - 1))
 }}

 def add:
  (Nat, Nat) => (Nat)
  =
  (a, b) =>
  /**
   *purpose:ccalculate the number of Nat
   *instance:add(Zero(), Zero()) => Zero()
   *  add(Succ(Zero()), Succ(Zero())) => Succ(Succ(Zero()))
   */
  {changeI(changeN(a) + changeN(b))}
