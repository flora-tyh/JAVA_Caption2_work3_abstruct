package com;

public class Hen extends Chicken{

  public double getPrice() {
    return 3;
  }

  @Override
  public int buyChicken(int money) {
    return  (int) (money / getPrice());
  }

}
