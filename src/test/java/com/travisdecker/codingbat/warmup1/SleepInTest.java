package com.travisdecker.codingbat.warmup1;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SleepInTest {

  /**
   * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are
   * on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep
   * in.
   * <p>
   * Example:<pre>
   * sleepIn(false, false) → true
   * sleepIn(true, false) → false
   * sleepIn(false, true) → true
   * </pre>
   */

  private SleepIn sleepIn;

  @BeforeEach
  private void setUp() {
    sleepIn = new SleepIn();
  }

  private static Stream<Arguments> sleepInTestArgs() {
    //Arguments are in the order of "weekday", "vacation", "expectedOutput".
    return Stream.of(
        Arguments.of(Boolean.FALSE, Boolean.FALSE, Boolean.TRUE),
        Arguments.of(Boolean.TRUE, Boolean.FALSE, Boolean.FALSE),
        Arguments.of(Boolean.FALSE, Boolean.TRUE, Boolean.TRUE),
        Arguments.of(Boolean.TRUE, Boolean.TRUE, Boolean.TRUE)
    );
  }

  @ParameterizedTest
  @MethodSource("sleepInTestArgs")
  void testSleepIn(boolean weekday, boolean vacation, boolean expectedOutput) {
    Assertions.assertEquals(expectedOutput, sleepIn.getSleepIn(weekday, vacation));
  }
}