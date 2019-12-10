package com.example;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoStrings {

  Set<Character> getSubstrings(String str) {
    return str.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
  }

  public String shareAny(String first, String second) {
    Set<Character> firstSubstrings = getSubstrings(first);
    Set<Character> secondSubstrings = getSubstrings(second);
    Set<Character> intersect = new HashSet<>(firstSubstrings);
    intersect.retainAll(secondSubstrings);

    if (intersect.size() > 0) {
      return "YES";
    }

    return "NO";
  }
}
