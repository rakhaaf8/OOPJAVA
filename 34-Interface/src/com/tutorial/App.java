package com.tutorial;

import com.hero.*;

public class App {
    public static void main(String[] args) throws Exception {
        hero hero1 = new hero("rakha",100);
        heroagility hero2 = new heroagility("ahmad",200);
        herointel hero3 = new herointel("fabiano",150);
        hero1.show();
        hero2.show();
        hero3.show();
        hero1.attack(hero2);
        hero2.attack(hero1);
        hero3.spellskill(hero1);

    }
}


//SUMMARY
//INTERFACE MEMAKSA OTHER CLASS TO USE ITS METHOD

//the difference beetween interface and abstract
//abstract cant add at the subclass (cannot multi extends)
//interface can (using implement)


//abstract to is a
//interface to has a(behavior from the object)