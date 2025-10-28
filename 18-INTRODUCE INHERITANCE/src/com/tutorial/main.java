package com.tutorial;

//inheritance is a pewarisan
public class main {
  public static void main(String[] args) {
    
    //1. create object w class hero
    hero hero1 = new hero();
    hero1.name = "rakha";
    hero1.display();

    //2. create object w class herohealth 
    //at class herohealth it doesnt have a atribut
    //it just by inheritance
    herohealth hero2 = new herohealth();
    hero2.name = "ahmad";
    hero2.display();

    //3. create object w classtrenght
    //at class herostrenght it doesnt have a atribut
    //it just by inheritance
    herostrenght hero3 = new herostrenght();
    hero3.name = "fabiano";
    hero3.display();
  }
}
