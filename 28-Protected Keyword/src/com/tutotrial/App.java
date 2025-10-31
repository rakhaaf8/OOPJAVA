package com.tutotrial;

import com.hero.herointel;
import com.hero.Hero;

public class App {
    public static void main(String[] args) throws Exception {
        herointel hero1 = new herointel("Otong", 1000);

        hero1.show();

        hero1.setname("ahmad");

        hero1.show();
    }
}
