package com.test.numbers;

public class ShiftVsPower {
  public static void main(String...args) {
    long s1 = 1<<30;
    long p1 = (long) Math.pow(2, 30);
    long s2 = 1<<31;
    long p2 = (long) Math.pow(2, 31);
    System.out.println((s1==p1) + "," + (s2==p2));
    System.out.println(s1+" "+p1+" "+s2+" "+p2);
  }
}