public class hero{
  String name;
  double health;

  public hero (String name, double health){
    this.name = name;
    this.health = health;
  }

  void setname (String name){
    this.name = name;
  }

  void show (){
    System.out.println("name = "+this.name+" | health = "+ this.health);
  }

  public String toString(){
    return "Hero: " + this.name;
  }
}