package com.example;

import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class TwoStringsTest {

  @Test
  public void testGetSubstrings() {
    TwoStrings alg = new TwoStrings();
    Set<Character> substrings = alg.getSubstrings("abc");
    Assert.assertEquals(3, substrings.size());

  }

  @Test
  public void testYes() {
    TwoStrings alg = new TwoStrings();
    Assert.assertEquals("YES", alg.shareAny("hello", "world"));
  }

  @Test
  public void testNo() {
    TwoStrings alg = new TwoStrings();
    Assert.assertEquals("NO", alg.shareAny("hi", "world"));
  }
}
