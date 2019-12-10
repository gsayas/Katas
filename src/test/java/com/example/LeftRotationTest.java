package com.example;

import org.junit.Assert;
import org.junit.Test;

public class LeftRotationTest {

  @Test
  public void testOneLeftRotation() {

    int[] arr = {1, 2, 3, 4, 5};
    int[] correct = {5, 1, 2, 3, 4};
    int n = 4;

    LeftRotation rotator = new LeftRotation();
    int[] result = rotator.rotate(arr, n);

    for (int i = 0; i < arr.length; i++) {
      Assert.assertEquals(correct[i], result[i]);
    }

  }
}
