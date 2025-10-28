package com.tutorial;

public class herostrength extends hero{
  String type = "strength";

  herostrength(String nameInput, double powerInput,double healthInput){
  super(nameInput, powerInput, healthInput);
  }

  //overiding
  void show(){
    super.show();
    System.out.println("type = "+this.type);
  }

  //overiding again
  void takedemage (double demage){
    System.out.println(this.name+" receive half demage "+demage+" ==> "+0.5*demage);
    this.health = this.health-(0.5*demage);
  }

}
