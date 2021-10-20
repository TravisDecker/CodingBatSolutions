package com.travisdecker.codingbat.warmup1;

public class SleepIn {

  /**
   * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are
   * on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep
   * in.
   * <p>
   * Example: sleepIn(false, false) → true sleepIn(true, false) → false sleepIn(false, true) → true
   */

  public boolean getSleepIn(boolean weekday, boolean vacation) {
    return (!weekday || vacation);
  }
}
