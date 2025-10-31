package com.hero;

public abstract class Hero {
  //protected String name; //this is only useable for subclass
  //but rarely to use, bcs contradiction to encapsulation
  private String name;

  public Hero (String name){
    this.name = name;
  }

  //getter
  public String getname (){
    return this.name;
  }

  //setter
  public void setname (String name){
    this.name = name;
  }

  //abstract class
  public abstract void show();
}
