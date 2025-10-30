public class heroagility extends hero{
  String type;

  heroagility(String name, double health){
    super(name,health);
    this.type = "agility";
  }

  void show (){
    System.out.println(this.getname() + " is an "+ this.type+" hero");
  }
}
