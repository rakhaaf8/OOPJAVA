package com.tutorial;

//import class console
import com.terminal.console;

//visibility default
class actor {
  private String name;

  actor (String name){
    this.name = name;
  }

  String getname (){
    return this.name;
  }

  void show (){
    console.log("menggunakan console log");
    console.log("player name = "+this.name);
  }



}
