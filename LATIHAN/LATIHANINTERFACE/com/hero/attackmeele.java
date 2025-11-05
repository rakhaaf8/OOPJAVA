package com.hero;

public class attackmeele implements Iattackskill{
  private double power;

  public attackmeele(double power){
    this.power = power;
  }

  public void attack (hero enemy){
    System.out.println("attack "+ enemy.getname()+" with meele "+this.power);
  }
}
