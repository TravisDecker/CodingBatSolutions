package com.travisdecker.codingbat.recursion1;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FactorialTest {

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

  private Factorial factorial;

  @BeforeEach
  private void setUp() {
    factorial = new Factorial();
  }

  private static Stream<Arguments> factorialTestArgs() {
    //Arguments are in the order of "input", "expectedOutput".
    return Stream.of(
        Arguments.of(1, 1),
        Arguments.of(2, 2),
        Arguments.of(3, 6),
        Arguments.of(4, 24),
        Arguments.of(5, 120),
        Arguments.of(6, 720),
        Arguments.of(7, 5040),
        Arguments.of(8, 40320),
        Arguments.of(12, 479001600)
    );
  }

  @ParameterizedTest
  @MethodSource("factorialTestArgs")
  void testSleepIn(int input, int expectedOutput) {
    Assertions.assertEquals(expectedOutput, factorial.factorial(input));
  }

}
