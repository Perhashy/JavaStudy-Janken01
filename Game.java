package Janken01;

public class Game {
  public static boolean draw(int player, int computer) {
    if (player == computer) {
      System.out.println("あいこです！");
      return true;
    } else {
      return false;
    }
  }
}