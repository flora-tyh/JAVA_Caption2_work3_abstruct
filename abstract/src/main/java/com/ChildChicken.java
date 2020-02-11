package com;

public class ChildChicken extends Chicken{

  public double getPrice() {
    return 1;
  }

  @Override
  public int buyChicken(int money) {
    return  (int) (money / getPrice());
  }

}
