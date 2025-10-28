//this is subclass

public class powerplayer extends player {
  Double power;

  void display(){
    System.out.println("\nini display dari subclass");
    System.out.println("player name = "+this.name);
    System.out.println("player power = "+this.power);
  }
}
