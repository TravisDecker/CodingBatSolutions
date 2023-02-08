package com.travisdecker.codingbat.warmup1;

public class EndUp {

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

  public String endUp(String str) {
    if (str.length() <= 3) {
      return str.toUpperCase();
    }
    String front = str.substring(0, str.length() - 3);
    String back = str.substring(str.length() - 3);
    return front + back.toUpperCase();
  }
}
