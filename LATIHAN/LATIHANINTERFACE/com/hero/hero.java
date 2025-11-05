package com.hero;

public abstract class hero{
  private String name;
  private double health;
  private Iattackskill attackskill;

  public hero(String name,double health){
    this.name = name;
    this.health = health;
  }

  public void attackskill(Iattackskill attackskill){
    this.attackskill = attackskill;
  }

  public void attack (hero enemy){
    System.out.println(this.name +" is attacking");
    this.attackskill.attack(enemy);
  }

  //getter
  public String getname(){
    return this.name;
  }

  //setter
  public void setname(String name){
    this.name = name;
  }

  public void show(){
    System.out.println("name = "+this.name);
    System.out.println("health = "+this.health);
  }
}
