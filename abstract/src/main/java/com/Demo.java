package com;

public class Demo {

  public static void main(String[] args) {
    Cock cock = new Cock();
    Hen hen = new Hen();
    ChildChicken childChicken = new ChildChicken();

    System.out.format("100元可以买%s %d只\n", cock.getType(), cock.buyChicken(100));
    System.out.format("100元可以买%s %d只\n", hen.getType(), hen.buyChicken(100));
    System.out.format("100元可以买%s %d只\n", childChicken.getType(), childChicken.buyChicken(100));
  }

}
