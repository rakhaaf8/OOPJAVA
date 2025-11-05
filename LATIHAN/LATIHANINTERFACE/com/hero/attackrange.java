package com.hero;

public class attackrange implements Iattackskill {
  private double power;
  private double range;

  public attackrange(double power,double range){
    this.power = power;
    this.range = range;
  }

  public void attack(hero enemy){
    System.out.println("attack "+ enemy.getname()+" with power "+this.power+" with range "+this.range);
  }
}
