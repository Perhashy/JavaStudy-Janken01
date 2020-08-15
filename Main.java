package Janken01;

public class Main {
  public static void main(String[] args) {
    Hand player = new Hand();
    Hand computer = new Hand();

    System.out.println("じゃんけんを始めます！");
    do {
      player.setPlayerHand();
      computer.setComputerHand();
      System.out.println("あなた：" + player.toString());
      System.out.println("あいて：" + computer.toString());
    }while(Game.draw(player.getHand(), computer.getHand()));
  }
}