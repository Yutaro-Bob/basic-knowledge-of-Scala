def PI = 3.14

def areaOfCircle:
(Double) => Double
=
(radius) =>
/**
 *purpose:calcurate the area of cylinder by the radius
 *instance:areaOfCircle(2) = 12.56
 */
{PI * radius * radius}



def volumeOfCylinder:
(Double, Double) => Double
=
(radius, height) =>
/**
 *purpose:calcurate the volume of cylinder by the radius and height
 *instance:volumeOfCylinder(2, 3) = 37.68
 */
{areaOfCircle(radius) * height}
