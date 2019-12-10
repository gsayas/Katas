package com.example;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MakingAnagramsTest {

  private MakingAnagrams alg;

  @Before
  public void setUp() throws Exception {
    alg = new MakingAnagrams();
  }

  @Test
  public void testBuildFrequencyMap() {
    String str1 = "abbcdd";
    Map<Character, Integer> freq = alg.getFrequencyMap(str1);

    Assert.assertEquals(4, freq.size());
    Assert.assertEquals(2, (int) freq.get('d'));
  }

  @Test
  public void testSimpleCase() {
    String str1 = "cde";
    String str2 = "abc";

    Assert.assertEquals(4, alg.getMakeAnagram(str1, str2));
  }

  Set<Character> stringToSet(String str) {
    return str.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
  }
}
