package com.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MakingAnagrams {

  public Map<Character, Integer> getFrequencyMap(String str) {
    final char[] chars = str.toCharArray();
    Map<Character, Integer> result = new HashMap<>();

    for (char c : chars) {
      if (result.containsKey(c)) {
        result.put(c, 1 + result.get(c));
      } else {
        result.put(c, 1);
      }
    }

    return result;
  }

  private Set<Character> getIntersection(Set<Character> str1, Set<Character> str2) {
    Set<Character> intersection = new HashSet<>(str1);
    intersection.retainAll(str2);

    return intersection;
  }

  private Set<Character> getDifference(Set<Character> str1, Set<Character> str2) {
    Set<Character> diff = new HashSet<>(str1);
    diff.removeAll(str2);

    return diff;
  }

  public int getMakeAnagram(String str1, String str2) {
    int count = 0;
    Map<Character, Integer> freqs1 = getFrequencyMap(str1);
    Map<Character, Integer> freqs2 = getFrequencyMap(str2);
    Set<Character> intersection = getIntersection(freqs1.keySet(), freqs2.keySet());
    Set<Character> diff1 = getDifference(freqs1.keySet(), freqs2.keySet());
    Set<Character> diff2 = getDifference(freqs2.keySet(), freqs1.keySet());

    for (Character c : intersection) {
      if (freqs1.get(c) != freqs2.get(c)) {
        count += Math.abs(freqs1.get(c) - freqs2.get(c));
      }
    }

    for (Character c : diff1) {
      count += freqs1.get(c);
    }

    for (Character c : diff2) {
      count += freqs2.get(c);
    }

    return count;
  }
}
