package com.example;

public class NewYearChaos {

  int[] bribesReceived;
  int[] adjacent;

  public String getChaos(int[] queue) {
    int len = queue.length;
    bribesReceived = new int[len + 1];
    adjacent = new int[len + 1];
    int totalBribes = 0;
    int offset;

    for (int i = 0; i < len; i++) {
      offset = getOffset(queue[i], i + 1);

      if (offset > 0) {
        //has bribed, has not been bribed
        if (offset >= 3) {
          return "Too chaotic";
        } else if (offset == 2) {
          totalBribes += 2;
          bribesReceived[queue[i] - 2]++;
          bribesReceived[queue[i] - 3]++;
        } else { //offset == 1
          totalBribes += 1;
          bribesReceived[queue[i] - 2]++;
        }
      } else if (offset < 0) {
        if (bribesReceived[queue[i] - 1] > Math.abs(offset)) {//has been bribed, has bribed
          totalBribes += bribesReceived[queue[i] - 1] + offset;
        }
      }
    }

    return Integer.toString(totalBribes);
  }

  int getOffset(int sticker, int position) {
    return sticker - position;
  }

  void bribeOneLeft(int[] adjacent, int pos) {
    int leftElementIndex = adjacent[pos];
    int originalLeft = adjacent[leftElementIndex];
    //bribesReceived[leftElementIndex]++;
    adjacent[leftElementIndex] = pos;
    adjacent[pos] = originalLeft;
  }


}
