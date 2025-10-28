package com.tutorial;


//overpower, so the power is ++
public class heroop extends hero{
  double op = 10;
    heroop(String nameInput, double powerInput,double healthInput){
    super(nameInput, powerInput, healthInput);
  }

  //overiding
  void show(){
    super.show();
    System.out.println("more power = "+this.op);
  }

  //overiding again
  void takedemage (double demage){
    System.out.println(this.name+" receive more demage "+demage+" ==> "+(10.0+demage));
    this.health = this.health-(10.0+demage);
  }



}
