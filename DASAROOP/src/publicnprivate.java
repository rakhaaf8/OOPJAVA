class player {
  String name; //ini default(public) bisa dibaca dan ditulis di luar class
  public int exp; //ini public bisa dibaca dan ditulis di luar class
  private int health; //cuma bisa dibaca dan ditulis di dalam class player


  player(String name,int exp,int health){
    this.name = name;
    this.exp = exp;
    this.health = health;
  }

  //method
  //default
  void display(){
    tambahexp(); //contoh penerapan private method, tiap display health +100
    System.out.println("\nnama\t= "+this.name);
    System.out.println("exp\t= "+this.exp);
    System.out.println("health\t= "+this.health); //ini bisa dilakukan karna di dalam class
  }
  //public
  public void ubahhealth (int newhealth){
    this.health = newhealth;
  }

  //private 
  private void tambahexp (){
    this.exp += 100;
  }

}


public class publicnprivate {
  public static void main(String[] args) {
    player player1 = new player("rakha",0,100);

    //default
    System.out.println(player1.name); //ini membaca data
    player1.name = "joko"; //ini menulis data
    System.out.println(player1.name); //ini membaca data
    
    //public
    System.out.println(player1.exp); //ini membaca data
    player1.exp = 50; //ini menulis data
    System.out.println(player1.exp); //ini membaca data
    
    //private
    // System.out.println(player1.health); //ini membaca data
    // player1.health = 90; //ini menulis data
    // System.out.println(player1.health); //ini membaca data
    // karena ini private jadi gabakal bisa

    //method

    //default
    player1.display();

    //public
    player1.ubahhealth(80);
    player1.display();

    //private
    //player1.tambahexp();
    //gabisa di panggil karena beda class


  }
}
