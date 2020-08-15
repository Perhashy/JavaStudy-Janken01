package Janken01;

public class Main {
  public static void main(String[] args) {
    Hand player = new Hand();
    Hand computer = new Hand();

    System.out.println("じゃんけんを始めます！");
    player.setPlayerHand();
    computer.setHand(1);

    System.out.println("あなた：" + player.toString());
    System.out.println("あいて：" + computer.toString());
  }
}