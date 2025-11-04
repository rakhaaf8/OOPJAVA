package com.hero;

public abstract class hero {
  private String name;
  private double health;

  public hero (String name,double health){
    this.name = name;
    this.health = health;
  }

  public void show (){
    System.out.println("name = "+this.name);
    System.out.println("health = "+this.health);
  }
}
