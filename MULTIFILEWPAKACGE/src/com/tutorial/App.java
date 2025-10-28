package com.tutorial;
//import console biar bisa di pake
import com.terminal.console;

//ngambil class dari file aktor.java

public class App {
  public static void main(String[] args) {
    System.out.println("halo");
    aktor player1 = new aktor("rakha");
    player1.show();

    //kita panggil method dari console (diluar file)
    //harus import dlu
    console.log("halo rakha ganteng");
    console.showww("jamet");
  }
}
