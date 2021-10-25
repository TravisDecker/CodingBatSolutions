package com.travisdecker.codingbat.functional1;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LowerTest {

  /**
   * Given a list of strings, return a list where each string is converted to lower case (Note:
   * String toLowerCase() method).
   * <p>
   * Example:<pre>
   * lower(["Hello", "Hi"]) → ["hello", "hi"]
   * lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
   * lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
   * </pre>
   */

  private Lower lower;

  @BeforeEach
  private void setUp() {
    lower = new Lower();
  }

  private static Stream<Arguments> lowerTestArgs() {
    //Arguments are in the order of input array and "expectedOutput".
    return Stream.of(
        Arguments.of(new String[]{"Hello", "Hi"}, new String[]{"hello", "hi"}),
        Arguments.of(new String[]{"AAA", "BBB", "ccc"}, new String[]{"aaa", "bbb", "ccc"}),
        Arguments.of(new String[]{"KitteN", "ChocolaTE"}, new String[]{"kitten", "chocolate"})
    );
  }

  @ParameterizedTest
  @MethodSource("lowerTestArgs")
  void testLower(String[] input, String[] expected) {
    Assertions.assertArrayEquals(lower.getLower(input), expected);
  }

}
