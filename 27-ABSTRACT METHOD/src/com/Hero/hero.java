package com.Hero;

public abstract class hero {
  public String name;
  int level;

  public hero (String name){
    this.name = name;
    this.level = 1;
  }

  public void show (){
    System.out.println("player name = "+this.name);
    System.out.println("level = "+this.level);
  }

  //abstract method
  public abstract void levelup();


  //setter lvl up
  public void setlevel (int deltalevel){
    this.level += deltalevel;
  }
}