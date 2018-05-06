def inchesToCm:
(Double) => Double
=
(n) =>
/**
 *purpose:convert inch to cm
 *instance:inchesToCm(10) = 24.5
 */
{n * 2.45}

def feetToInches:
(Double) => Double
=
(n) =>
/**
 *purpose:convert feet to inch
 *instance:feetToInches(10) = 120
 */
{n * 12}

def yardsToFeet:
(Double) => Double
=
(n) =>
/**
 *purpose:convert yard to feet
 *instance:yardsToFeet(10) = 30
 */
{n * 3}

def rodsToYards:
(Double) => Double
=
(n) =>
/**
 *purpose:convert rod to yard
 *instance:rodsToYards(10) = 55
 */
{n * 5.5}

def furlongsToRods:
(Double) => Double
=
(n) =>
/**
 *purpose:consert furlong to rod
 *instance:furlongsToRods(10) = 400
 */
{n * 40}

def milesToFurlongs:
(Double) => Double
=
(n) =>
/**
 *purpose:convert mile to furlong
 *instance:milesToFurlongs(10) = 80
 */
{n * 8}

def feetToCm:
(Double) => Double
=
(n) =>
/**
 *purpose:convert feet to cm
 *instance:feetToCm(10) = 29400
 */
{feetToInches(n) * inchesToCm(n)}

def yardsToCm:
(Double) => Double
=
(n) =>
/**
 *purpose:convert yard to cm
 *instance:yardToCm(10) = 88200
 */
{yardsToFeet(n) * feetToCm(n)}

def rodsToInches:
(Double) => Double
=
(n) =>
/**
 *purpose:convert rod to inch
 *instance:rodsToInches(10) = 198000
 */
{rodsToYards(n) * yardsToFeet(n) * feetToInches(n)}

def milesToFeet:
(Double) => Double
=
(n) =>
/**
 *purpose:convert mile to feet
 *instance:milesToFeet(10) = 52800000
 */
{milesToFurlongs(n) * furlongsToRods(n) * rodsToYards(n) * yardsToFeet(n)}
