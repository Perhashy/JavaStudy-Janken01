package Janken01;

public class Main {
  public static void main(String[] args) {
  Hand player = new Hand();
  Hand computer = new Hand();
  player.setHand(2);
  computer.setHand(1);

  System.out.println(player.toString());
  System.out.println(computer.toString());
  }
}