package com.travisdecker.codingbat.warmup2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class AltPairsTest {

    private AltPairs altPairs = new AltPairs();

    private static Stream<Arguments> altPairsArgs() {
        return Stream.of(
                Arguments.of("kitten", "kien"),
                Arguments.of("Chocolate", "Chole"),
                Arguments.of("CodingHorror", "Congrr")
        );
    }

    @ParameterizedTest
    @MethodSource("altPairsArgs")
    void altPairs(String input, String expected) {
        Assertions.assertEquals( expected, AltPairs.altPairs(input));
    }
}