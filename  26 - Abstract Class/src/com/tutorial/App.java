package com.tutorial;

import com.Hero.hero;
import com.Hero.heroagility;
import com.Hero.herointel;

public class App {
    public static void main(String[] args) throws Exception {
        
        //create object w non abstract class

        herointel hero1 = new herointel("rakha");
        hero1.show();

        //create object w non abstract class

        heroagility hero2 = new heroagility("ahmad");
        hero2.show();

        //create object w abstract class

        // hero hero3 = new hero("rakha");
        // hero3.show();
        //===> we cant create object w abstract class

    }
}

//SUMMARY
//1. IF WE CREATE A GAME, WE CANT CRATE A HERO FROM THE SUPER CLASS
// WE MUST BE OBJECT WITH SUB CLASS, THATS WHY WE USE ABSTRACT CLASS
// BCS THE ABSTRACT CLASS CANT CREATE A OBJECT
//2. SO IN SIMPLE TERM, ABSTRACT CLASS JUST USEFUL FOR TEMPLATE FOR A "HERO"
//3. ABSTRACT CLASS ALSO FORCE THEIR SUB CLASS TO INHERITANCE ITS ATRIBUTE