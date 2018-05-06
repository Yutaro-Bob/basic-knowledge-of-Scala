def speed:
(Double, Double) => Double
=
(acceleration, time) =>
/**
 *purpose:calculate the speed by acceleration and time
 *instance:speed(g, t) = gt
 */
{acceleration * time}

def height:
(Double, Double) => Double
=
(acceleration, time) =>
/**
  *purpose:calculate the height by acceleration and time
  *instance:height(g, t) = 0.5 * g * t * t
  */
{0.5 * speed(acceleration, time) * time}
