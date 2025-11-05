package com.hero;

public class herointel extends hero implements Iattack,Ispellskill {
  public herointel(String name,double health){
    super(name, health);
  }
  public void attack(hero enemy){
    System.out.println(this.getname()+" attacking "+enemy.getname());
  }
  public void spellskill (hero enemy){
    System.out.println("this is spell skill");
  }
}
