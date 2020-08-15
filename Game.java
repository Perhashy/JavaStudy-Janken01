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
  public static void result(int player, int computer) {
    String result;
    if ((player == 1 && computer == 2) ||
        (player == 2 && computer == 3) ||
        (player == 3 && computer == 1)) {
          result = "勝ちです！";
        } else {
          result = "負けです";
        }
    System.out.println("あなたの" + result);
  }
}