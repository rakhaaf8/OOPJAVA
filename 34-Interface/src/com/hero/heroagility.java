package com.hero;

public class heroagility extends hero implements Iattack{
  public heroagility(String name, double health) {
    super(name, health);
  }

  public void attack (hero enemy){
    System.out.println(this.getname()+" attacking "+ enemy.getname());
  }
}
