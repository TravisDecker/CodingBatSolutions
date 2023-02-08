package com.travisdecker.codingbat.warmup2;


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

public class AltPairs {

  public static String altPairs(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i = i + 3) {
      sb.append(str.charAt(i++));
      if (i > str.length() - 1) {
        break;
      }
      sb.append(str.charAt(i));
    }
    return sb.toString();
  }

}
