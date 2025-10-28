package com.tutorial;

public class hero {
  String name;
  double health, power;

  hero(String nameInput, double powerInput,double healthInput){
    this.name = nameInput;
    this.power = powerInput;
    this.health = healthInput;
  }

  void attack(hero enemy){
    System.out.println("\n"+this.name+" is attacking "+enemy.name);
    enemy.takedemage(this.power);
  }


  void takedemage (double demage){
    System.out.println(this.name+" receive "+demage);
    this.health = this.health-demage;
  }

  void show(){
    System.out.println("\nname = "+this.name);
    System.out.println("power = "+this.power);
    System.out.println("health = "+this.health);
  }
}
