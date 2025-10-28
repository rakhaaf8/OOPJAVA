import java.util.ArrayList;

class charakter {
  private static ArrayList<String> namelist = new ArrayList<String>();
  private static int numberofchar;
  private String name;

  charakter(String name){
    this.name = name;
    this.numberofchar++;
    charakter.namelist.add(this.name);
  }

  void show (){
    System.out.println("charakter name = "+this.name);
  }

  static void shownumberofchar(){
    System.out.println("number of character = "+charakter.numberofchar);
  }

  static ArrayList<String> getname(){
    return namelist;
  }
}


public class staticorclassmethod {
  public static void main(String[] args) {
    charakter player1 = new charakter("jokowi");
    charakter player2 = new charakter("prabowo");
    charakter player3 = new charakter("gibran");
    charakter player4 = new charakter("megawati");
    charakter player5 = new charakter("sahroni");
    player1.show();
    player2.show();
    player3.show();
    player4.show();
    player5.show();

    System.out.println("name = "+charakter.getname());


    charakter.shownumberofchar();
    
    
  }
}
