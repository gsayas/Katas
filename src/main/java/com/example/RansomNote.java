package com.example;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

  Map<String, Integer> magazine = new HashMap<>();

  public void setMagazine(String[] magazine) {
    for (String word : magazine) {
      if (this.magazine.containsKey(word)) {
        this.magazine.put(word, 1 + this.magazine.get(word));
      } else {
        this.magazine.put(word, 1);
      }
    }
  }

  public boolean wordExists(String word) {
    return magazine.containsKey(word);
  }

  public boolean usefulMagazine(String[] note) {

    for (String word : note) {
      if (!wordExists(word)) {
        return false;
      } else {
        if (this.magazine.get(word) > 1) {
          this.magazine.put(word, this.magazine.get(word) - 1);
        } else {
          this.magazine.remove(word);
        }
      }
    }

    return true;
  }
}
