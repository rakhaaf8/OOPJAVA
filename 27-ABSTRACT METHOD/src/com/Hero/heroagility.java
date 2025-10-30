package com.Hero;

public class heroagility extends hero{
  public heroagility(String name){
    super(name);
  }

  //kita buat level nya naik 1 
  public void levelup(){
    this.setlevel(1);
  }
}
