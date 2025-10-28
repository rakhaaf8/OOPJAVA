package com.tutorial;

//ini digunakan oleh file multifilewpakacge.java
//untuk membuat object

class aktor{
  private String name;

  aktor (String name){
    this.name = name;
  }

  void setname (String name){
    this.name = name;
  }

  void show (){
    System.out.println("aktor name = "+this.name);
  }
}
