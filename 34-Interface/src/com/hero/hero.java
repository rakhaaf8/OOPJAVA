package com.hero;

public class hero { // using implements
    private String name;
    private double health;

    public hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    // public void attack(hero enemy) {
    //     System.out.println(this.name + " attacking " + enemy.name);
    // }

    public void show() {
        System.out.println("name = " + this.name);
        System.out.println("health = " + this.health);
    }

    public String getname() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }
}
