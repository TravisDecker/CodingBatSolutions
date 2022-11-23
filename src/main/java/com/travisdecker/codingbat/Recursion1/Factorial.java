package com.travisdecker.codingbat.Recursion1;

public class Factorial {

  /**
   * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the
   * result recursively (without loops).
   *
   * <p>
   * Example:<pre>
   * getFactorial(1) → 1
   * getFactorial(2) → 2
   * getFactorial(3) → 6
   * </pre>
   */

  public int factorial(int n) {
    if (n == 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }
}
