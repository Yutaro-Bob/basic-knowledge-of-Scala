:paste

def flatten[T]:
(List[List[T]]) => List[T]
=
/**
*purpose:change List[List[e]] to List[e]
*instance:flatten(Nil) == Nil
*  flatten(List(List(1,2,3),List(4,5,6))) == List(1, 2, 3, 4, 5, 6)
*  flatten(List(List('a,'b),List('c,'d))) == List('a, 'b, 'c, 'd)
*/
(c) =>
{c match{
    case Nil => Nil
    case e::rest => e:::flatten(rest)
}}
