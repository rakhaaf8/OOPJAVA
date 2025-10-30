package com.tutorial;

import com.Hero.heroagility;
import com.Hero.herointel;
import com.Hero.herostrength;

public class App {
    public static void main(String[] args) throws Exception {
        //create a object with non abstract class
        heroagility hero1 = new heroagility("rakha");
        hero1.show();
        //create a object with non abstract class
        herointel hero2 = new herointel("ahmad");
        hero2.show();
        //create a object with non abstract class
        herostrength hero3 = new herostrength("fabiano");
        hero3.show();


        //penggunaan abstract method
        hero1.levelup();
        hero2.levelup();
        hero1.show();
        hero2.show();

        hero3.levelup();
        hero3.show();


    }
}
