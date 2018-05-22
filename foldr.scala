:paste
def foldr[T, S]:
((T) => (S) => S) =>S => List[T] => S
/**
*purpose:make the fold right function
*instance:foldr(mul)(1)(List(1,2,3)) == 6
*     foldr(add)(0)(List(1,2,3)) == 6
*/
=
(f) => {
    def fold:
    (S) => (List[T] => S)
    =
    (n) =>{
    def fold2:
        (List[T]) => S
        =
        (lst) =>
        {lst match{
            case Nil => n
            case e::rest => f(e)(foldr(f)(n)(rest))
        }}
    fold2
    }
    fold
}
