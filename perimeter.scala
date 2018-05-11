def PI = 3.14

// Position(x,y) represents a position in XY-plane, where x is the
// X-coordinate and y is the Y-coordinate
case class Position(x:Int,y:Int)


// Shape is a type for all shapes.
abstract class Shape

// Circle(p,r) represents a circle, where p is the center position and
// r is the radius.
case class Circle(center:Position, radius:Double) extends Shape

// Square(p,l) represents a square, where p is the center position and
// l is the length of each edge.
case class Square(center:Position, length:Double) extends Shape


def perimeterOfSquare:
(Square) => Double
=
(c) =>
/**
 *purpose:calculate the perimeter of square
 *instance:perimeterOfSquare(Square(p, l)) => 4 *l
 */
{c match{
    case Square(p, l) => 4 * l
}}

def perimeterOfCircle:
(Circle) => Double
=
(c) =>
/**
 *purpose:calculate the perimeter of circle
 *instance:erimeterOfCircle(Circle(p, r)) => 2 *PI * r
 */
{c match{
    case Circle(p, r) => 2 * PI * r
}}


def perimeter:
(Shape) => Double
=
(s) =>
/**
 *purpose:calcurate the perimeter of figure
 *instance:perimeter(Square(Position(10,10),4)) => 16
 *  perimeter(Circle(Position(10,10),20)) => 40 * 3.14
 */
{s match{
    case Square(p, l) =>
     perimeterOfSquare(Square(p, l))
    case Circle(p, r) =>
     perimeterOfCircle(Circle(p, r))
}}
