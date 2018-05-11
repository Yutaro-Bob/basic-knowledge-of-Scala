def payBack:
(Double) => Double
=
(money) =>
/**
 *purpose:calcurate the amount of payback as the money they use
 *instance:payBack(300) => 0.75
 *  payBack(1300) => 5.25
 *  payBack(2300) => 12.25
 *  payBack(3300) => 21.75
 */
{if(money <= 500){money * 0.25 * 0.01}
else if (500 < money && money <= 1500){500 * 0.25 * 0.01 + (money - 500) * 0.50 * 0.01}
else if (1500 < money && money <= 2500){500 * 0.25 * 0.01 + 1000 * 0.50 * 0.01 + (money - 1500) * 0.75 * 0.01}
else {500 * 0.25 * 0.01 + 1000 * 0.50 * 0.01 + 1000 * 0.75 * 0.01 + (money - 2500) * 1.0 * 0.01 }
}
