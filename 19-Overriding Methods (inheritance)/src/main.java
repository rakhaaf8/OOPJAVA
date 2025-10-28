public class main {
  public static void main(String[] args) {

    // this is use display from super class
    player player1 = new player();
    player1.name = "rakha";
    player1.display();


    //this is use display from subclass
    powerplayer player2 = new powerplayer();
    player2.name = "mahmud";
    player2.power = 1.000;
    player2.display();
  }
}

//SUMMARY
//overriding is a condition when method call the sub class first (if there is),
//if sub class doesnt have, so it call from the super class
