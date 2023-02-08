package com.travisdecker.codingbat.warmup1;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class EndUpTest {

  /**
   * Given a string, return a new string where the last 3 chars are now in upper case. If the string
   * has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the
   * uppercase version of a string.
   * <p>
   * Example:<pre>
   * endUp("Hello") → "HeLLO"
   * endUp("hi there") → "hi thERE"
   * endUp("hi") → "HI"
   * </pre>
   */

  private EndUp endUp;

  @BeforeEach
  void setUp() {
    endUp = new EndUp();
  }

  private static Stream<Arguments> endUpTestArgs() {
    return Stream.of(
        Arguments.of("Hello", "HeLLO"),
        Arguments.of("hi there", "hi thERE"),
        Arguments.of("hi", "HI"),
        Arguments.of("woo hoo", "woo HOO"),
        Arguments.of("xyz12", "xyZ12"),
        Arguments.of("x", "X"),
        Arguments.of("", "")
    );
  }

  @ParameterizedTest
  @MethodSource("endUpTestArgs")
  void endUp(String input, String expected) {
    Assertions.assertEquals(expected, endUp.endUp(input));
  }
}