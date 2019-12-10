package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NewYearChaosTest {

  NewYearChaos chaos;

  @Before
  public void setUp() throws Exception {
    chaos = new NewYearChaos();
  }

  @Test
  public void testGetOffset() {

    int sticker = 2;
    int position = 1;

    int offset = chaos.getOffset(sticker, position);
    Assert.assertEquals(1, offset);

  }

  @Test
  public void testChaos() {
    int[] queue = {2, 1, 5, 3, 4};

    String result = chaos.getChaos(queue);
    Assert.assertEquals("3", result);

  }

  @Test
  public void testInvalidChaos() {

    int[] queue = {2, 5, 1, 3, 4};

    String result = chaos.getChaos(queue);
    Assert.assertEquals("Too chaotic", result);

  }

  @Test
  public void test3() {
    int[] queue = {1, 2, 5, 3, 7, 8, 6, 4};

    String result = chaos.getChaos(queue);
    Assert.assertEquals("7", result);
  }

  @Test
  public void testBribeOneLeft() {
    int[] adjacencies = {0, 0, 1, 2, 3, 4, 5, 6, 7};
    chaos.bribeOneLeft(adjacencies, 5);
    System.out.println(adjacencies);
  }
}
