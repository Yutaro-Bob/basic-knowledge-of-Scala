// Pair of Symbols
case class SymbolPair(s1:Symbol, s2:Symbol)

def symbolColorx:
(SymbolPair) => Symbol
=
(x) =>
/**
 *purpose:get a from SymbolPair(a, b)
 *instance: SymbolPair('black, 'white) => black
 */
{x match{
    case SymbolPair(a, b) => a
}}

def symbolColory:
(SymbolPair) => Symbol
=
(y) =>
/**
 *purpose:get b from SymbolPair(a, b)
 *instance: SymbolPair('black, 'white) => white
 */
{y match {
    case SymbolPair(a, b) => b
}}




def checkColor:
(SymbolPair, SymbolPair) => Symbol
=
(a, b) =>
/**
 *purpose:get the result by two pairs, (t1, t2) as people who ask questions and (g1, g2) as challenger 
 *     'Perfect if t1 = g1 and  t2 = g2
 *     'OneColorAtCorrectPosition if t1 = g1 or t2 = g2 but both is not include
 *     'OneColorOccurs if g1 = t2 or g2 = t1 but except above cases
 *     'NothingCorrect otherwise
 *instance: checkColor(SymbolPair('red, 'blue), SymbolPair('red, 'blue)) => 'Perfect
 *    checkColor(SymbolPair('red, 'blue), SymbolPair('blue, 'red)) => 'OneColorOccurs
 *    checkColor(SymbolPair('red, 'blue), SymbolPair('black, 'yellow)) => 'NothingCorrect
 *    checkColor(SymbolPair('red, 'blue), SymbolPair('red, 'red)) => OneColorAtCorrectPosition
 */
{if (symbolColorx(a) == symbolColorx(b) && symbolColory(a) == symbolColory(b)){'Perfect}
else if (symbolColorx(a) == symbolColorx(b) || symbolColory(a) == symbolColory(b)){'OneColorAtCorrectPosition}
else if (symbolColorx(a) ==  symbolColory(b) && symbolColory(a) == symbolColorx(b)){'OneColorOccurs}
else if (symbolColorx(a) ==  symbolColory(b) || symbolColory(a) == symbolColorx(b)){'OneColorOccurs}
else {'NothingCorrect}
}
