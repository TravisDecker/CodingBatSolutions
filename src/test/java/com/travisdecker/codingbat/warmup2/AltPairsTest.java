package com.travisdecker.codingbat.warmup2;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class AltPairsTest {

  /**
   * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens"
   * yields "kien".
   * <p>
   * Example:<pre>
   * altPairs("kitten") → "kien"
   * altPairs("Chocolate") → "Chole"
   * altPairs("CodingHorror") → "Congrr"
   * </pre>
   */

  private AltPairs altPairs;

  @BeforeEach
  public void setup() {
    altPairs = new AltPairs();
  }

  private static Stream<Arguments> altPairsArgs() {
    return Stream.of(
        Arguments.of("kitten", "kien"),
        Arguments.of("Chocolate", "Chole"),
        Arguments.of("CodingHorror", "Congrr"),
        Arguments.of("yak", "ya"),
        Arguments.of("ya", "ya"),
        Arguments.of("y", "y"),
        Arguments.of("", ""),
        Arguments.of("ThisThatTheOther", "ThThThth")
    );
  }

  @ParameterizedTest
  @MethodSource("altPairsArgs")
  void altPairs(String input, String expected) {
    Assertions.assertEquals(expected, AltPairs.altPairs(input));
  }
}