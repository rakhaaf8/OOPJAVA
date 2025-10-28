package com.tutorial;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        hero hero1 = new hero ("rakha",10,100);
        herostrength hero2 = new herostrength("ahmad", 20, 100);

        hero1.show();
        hero2.show();
        
        hero1.attack(hero2);
        hero1.show();
        hero2.show();

        heroop hero3 = new heroop("fabiano", 15, 100);

        hero1.attack(hero3);
        hero1.show();
        hero3.show();
    }
}
