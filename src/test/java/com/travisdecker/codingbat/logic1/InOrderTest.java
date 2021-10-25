package com.travisdecker.codingbat.logic1;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.provider.Arguments;

public class InOrderTest {

  /**
   * Given three ints, a b c, return true if b is greater than a, and c is greater than b. However,
   * with the exception that if "bOk" is true, b does not need to be greater than a.
   * <p>
   * Example: inOrder(1, 2, 4, false) → true inOrder(1, 2, 1, false) → false inOrder(1, 1, 2, true)
   * → true
   */

  private InOrder inOrder;

  @BeforeEach
  private void setUp() {
    inOrder = new InOrder();
  }

  private static Stream<Arguments> inOrderTestArgs() {
    //Args in the order of a, b, c, bOk, expectedOutput.
    return Stream.of(
        Arguments.of(1, 2, 4, Boolean.FALSE, Boolean.TRUE),
        Arguments.of(1, 2, 1, Boolean.FALSE, Boolean.FALSE),
        Arguments.of(1, 1, 2, Boolean.TRUE, Boolean.TRUE)
    );
  }


}