package com.Hero;

public abstract class hero {
  private String name;

  public hero (String name){
    this.name = name;
  }

  public void show(){
    System.out.println("name = "+this.name);
  }
}
