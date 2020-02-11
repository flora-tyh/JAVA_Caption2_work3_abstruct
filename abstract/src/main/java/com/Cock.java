package com;


public class Cock extends Chicken{

  public double getPrice() {
    return 5;
  }

  @Override
  public int buyChicken(int money) {
    return  (int) (money / getPrice());
  }

}
