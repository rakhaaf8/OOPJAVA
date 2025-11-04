package com.hero;

public class hero {
  private String name;
  private double health;

  hero(String name, double health) {
    this.name = name;
    this.health = health;
  }

  void show() {
    System.out.println("Name: " + this.name);
    System.out.println("Health: " + this.health);
  }
}
