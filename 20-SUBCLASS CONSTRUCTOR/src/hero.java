public class hero {
  String name;
  double power;

  //constructor1 
  hero(String name,double power){
    this.name = name;
    this.power=power;
  }
  //constructor2
  hero(String name){
    this.name = name;
  }

  void show (){
    System.out.println("name  = "+this.name);
    System.out.println("power = "+this.power);
  }


}
