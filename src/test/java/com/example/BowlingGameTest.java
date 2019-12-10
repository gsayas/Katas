package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {

  BowlingGame game;

  @Before
  public void setUp() throws Exception {
    game = new BowlingGame();
  }

  @Test
  public void testGutterGame() {
    rollMany(20, 0);
    assertEquals(0, game.getScore());
  }

  @Test
  public void testAllOnes() {
    rollMany(20, 1);
    assertEquals(20, game.getScore());
  }

  @Test
  public void testOneSpare() {
    rollSpare();
    game.roll(3);
    rollMany(17, 0);
    assertEquals(16, game.getScore());
  }

  @Test
  public void testOneStrike() {
    rollStrike();
    game.roll(3);
    game.roll(4);
    rollMany(16, 0);
    assertEquals(24, game.getScore());
  }

  @Test
  public void testPerfectGame() {
    rollMany(12, 10);
    assertEquals(300, game.getScore());
  }

  private void rollMany(int times, int pins) {
    for (int i = 0; i < times; i++) {
      game.roll(pins);
    }
  }

  private void rollSpare() {
    game.roll(5);
    game.roll(5);
  }

  private void rollStrike() {
    game.roll(10);
  }
}
