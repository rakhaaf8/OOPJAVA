package com.hero;

public class herointel extends Hero {
  private int speed;

  public herointel(String name,int speed){
    super(name);
    this.speed = speed;
  }

  public void show(){
    System.out.println(getname()+" with "+this.speed);
  }
}
