package Janken01;

import java.util.Scanner;

public class Hand {
  private int hand;

  public int getHand() {
    return this.hand;
  }

  public void setHand(int hand) {
    this.hand = hand;
  }

  public void setPlayerHand() {
    Scanner sc = new Scanner(System.in);
    System.out.println(
      "手を数字で入力してください" + "\n" +
      "1：グー、2：チョキ、3：パー"
    );
    int playerHand = sc.nextInt();
    if (playerHand > 0 && playerHand <= 3) {
      this.hand = playerHand;
    } else {
      System.out.println("正しくない手を出しました、あなたの負けです");
      System.exit(0);
    }
  }

  @Override
  public String toString() {
    switch (this.hand) {
      case 1: return "グー";
      case 2: return "チョキ";
      case 3: return "パー";
    }
    throw new IllegalStateException();
  }
}