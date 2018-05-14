abstract class ParentTree
case object Empty extends ParentTree
case class MakeParent(
  children:List[ParentTree],
  name:Symbol, 
  date:Int, 
  eyes:Symbol
) extends ParentTree

:paste
//you should write the code below the line

def eyecolor:
 (ParentTree) => Symbol
 =
 (tree) =>
 /**
 *purpose:get the eyes which is Symbol from PerentTree
 *instance:eyecolor(Gustav) => 'brown
 */
 {tree match{
   case Empty => 'Nan
   case MakeParent(children, n, d, e) =>  e
   case _ => 'Nan
  }}


def eyecolor2:
 (ParentTree) => List[ParentTree]
 =
 (tree) =>
 /**
 *purpose:create List[ParentTree] from ParentTree
 *instance:eyecolor2(Carl) => List(MakeParent(List(),'Adam,1950,'yellow), MakeParent(List(),'Dave,1955,'black), MakeParent(List(MakeParent(List(),'Gustav,1988,'brown)),'Eva,1965,'blue))
 */
 {tree match{
   case Empty => Nil
   case MakeParent(children, n, d, e) => children
   case _ => Nil
 }}


def eyeList:
 List[ParentTree] => List[Symbol]
 =
 (tree) =>
 /**
 *purpose:create the List[Symbol] including eyes from List[ParentTree]
 *instance:eyeList( List(MakeParent(List(),'Adam,1950,'yellow), MakeParent(List(),'Dave,1955,'black), MakeParent(List(MakeParent(List(),'Gustav,1988,'brown)),'Eva,1965,'blue))) => List('yellow, 'black, 'blue, 'brown)
 */
 {tree match{
   case Nil => Nil
   case e::rest if eyecolor2(e) == Nil => eyecolor(e)::eyeList(rest)
   case e::rest if eyecolor2(e) != Nil => eyecolor(e)::eyeList(eyecolor2(e))
 }}


 def colormatch:
 (Symbol, List[Symbol]) => List[Symbol]
 =
 (color, cl) =>
 /**
 *purpose:delete the same Symbol from List[Symbol] and 'Nan
 *instance:colormatch('blue, List('blue, 'yellow, 'brown, 'blue, 'black)) =>  List('yellow, 'brown, 'blue, 'black)
 */
 {cl match{
   case e::rest if color == e || color == 'Nan => rest
   case e::rest if color != e => e::colormatch(color, rest)
   case Nil if color == 'Nan => Nil
   case Nil => List(color)
 }}


 def overlap:
 (List[Symbol]) => List[Symbol]
 =
 (pl) =>
 /**
 *purpose:delete the same Symbols one by one
 *instance:overlap(List('blue, 'blue, 'blue, 'black, 'green)) => List('green, 'black, 'blue)
 */
 {pl match{
   case Nil => Nil
   case e::rest => colormatch(e, overlap(rest))
 }}

 def colors:
 (ParentTree) => List[Symbol]
 =
 (tree) =>
 /**
 *purpose:create the List[Symbol] including eyes from ParentTree
 *instance:colors(Carl) => List('brown, 'blue, 'black, 'yellow, 'green)
 */
 {overlap(eyecolor(tree)::eyeList(eyecolor2(tree)))}
