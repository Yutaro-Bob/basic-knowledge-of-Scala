:paste
def filter[T]:
((T) => Boolean)=>(List[T])=>List[T]
=
/**
*purpose:return the List[T], if the first argument is true
*instance:filter(isEven)(List(1,2,3)) == List(2)
*/
(f) =>
{
    def filter2:
    (List[T])=>List[T]
    =
    (lst)=>
    lst match{
        case Nil => Nil
        case e::rest => if (f(e)) (List(e):::filter2(rest)) 
                        else filter2(rest)
    }
    filter2
}
