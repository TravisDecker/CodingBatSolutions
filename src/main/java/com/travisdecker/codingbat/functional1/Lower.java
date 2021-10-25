package com.travisdecker.codingbat.functional1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Lower {

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

  public String[] getLower(String[] input) {
    return Arrays.stream(input).map(String::toLowerCase).collect(Collectors.toList())
        .toArray(String[]::new);
  }
}
