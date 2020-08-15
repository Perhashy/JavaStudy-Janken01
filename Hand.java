package Janken01;

public class Hand {
  private int hand;

  public int getHand() {
    return this.hand;
  }

  public void setHand(int hand) {
    this.hand = hand;
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