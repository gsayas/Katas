package com.example;

import org.junit.Assert;
import org.junit.Test;

public class RansomNoteTest {

  @Test
  public void testIsWordInMagazine() {
    RansomNote ransom = new RansomNote();
    ransom.setMagazine("brown fox jumps".split(" "));
    Assert.assertTrue(ransom.wordExists("fox"));
    Assert.assertFalse(ransom.wordExists("foxx"));
  }

  @Test
  public void testYes() {
    RansomNote ransom = new RansomNote();
    ransom.setMagazine("give me one grand today night".split(" "));
    Assert.assertTrue(ransom.usefulMagazine("give one grand today".split(" ")));
  }

  @Test
  public void testNo() {
    RansomNote ransom = new RansomNote();
    ransom.setMagazine("two times three is not four".split(" "));
    Assert.assertFalse(ransom.usefulMagazine("two times two is four".split(" ")));
  }
}
