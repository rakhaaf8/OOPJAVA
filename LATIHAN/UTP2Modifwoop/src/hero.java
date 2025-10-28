public class hero {
  String name;
  int kill,death,assist,bonus;
  double ip;

  hero(String name, int kill, int assist, int death){
    this.name = name;
    this.kill = kill;
    this.death = death;
    this.assist = assist;
  }

  void show(){
    System.out.print(this.name);
    System.out.printf(" %.2f ",this.ip);
    message(this.ip);
  }

  int bonus (){
    if(this.kill>(2*this.death)){
      this.bonus = 15;
    } else if(this.kill>this.death){
      this.bonus = 10;
    } else if(this.kill==this.death){
      this.bonus = 5;
    } else {
      this.bonus = 0;
    }
    return this.bonus;
  }

  double ipcalculate (int bonus){
    this.ip = ((2.0 * (double)this.kill) + (double)this.assist) / Math.sqrt((double)this.death + 1.0) + (double)bonus;
    return this.ip;
  }

  void message (double ip){
    if (ip>=100){
      System.out.println("MVP");
    } else if (ip>=70){
      System.out.println("Pro Player");
    } else if (ip>=40){
      System.out.println("Average");
    } else {
      System.out.println("Needs Practice");
    }
  }
}
