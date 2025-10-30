public class hero {
  String name;
  double health;

  hero (String name, double health){
    this.name= name;
    this.health = health;
  }

  //setter
  void setname (String name){
    this.name = name;
  } 
  void sethealth (double health){
    this.health = health;
  } 

  //getter
  String getname (){
    return this.name;
  }
  double gethealth (){
    return this.health;
  }

  void show (){
    System.out.println(this.name + " is a regular hero");
    System.out.println("health = "+this.health);
  }

}
