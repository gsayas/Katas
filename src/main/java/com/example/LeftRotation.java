package com.example;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LeftRotation {

  public int[] rotate(int[] arr, int n) {
    Deque<Integer> deque = new LinkedList<>(arrayToList(arr));

    for (int i = 0; i < n; i++) {
      deque.addLast(deque.pop());
    }

    int[] result = deque.stream().mapToInt(i -> i).toArray();

    return result;
  }

  private List<Integer> arrayToList(int[] arr) {
    Integer integerArray[] = {1, 66, 88, 100, 201};
    //return Arrays.stream(arr).boxed().collect(Collectors.toList());
    //return IntStream.of(arr).boxed().collect(Collectors.toList());
    return Arrays.asList(integerArray);
  }

  private int[] listToArray(List<Integer> list) {
    //return list.stream().toArray(String[]::new);
    return list.stream().mapToInt(i -> i).toArray();
  }

}
