package com.tutorial;

//import class console
import com.terminal.console;

//import method log dari class console(use static)
import static com.terminal.console.log;

public class main {
  public static void main(String[] args) {
    actor player1 = new actor ("rakha");
    player1.show();

    console.log("display with console log");
    console.log(player1.getname());


    log("display with method log");
    log(player1.getname());
  }
}

//SUMMARY
//default ==> only can used for multifile with same folder
//public  ==> can used for multifile with different folder
//private ==> it cant be used, and will error