package com.tutorial;

import com.hero.*;

public class main {
  public static void main(String[] args) {
    heroagility hero1 = new heroagility("rakha",100);
    heroagility hero2 = new heroagility("ahmad",90);

    hero1.attackskill(new attackmeele(100));
    hero2.attackskill(new attackrange(100,50));
    
    hero1.attack(hero2);
    hero2.attack(hero1);
    
        hero1.show();
        hero2.show();
  }
}
