public class hero{
  String name;
  double health;

  public hero (String name, double health){
    this.name = name;
    this.health = health;
  }

  public void show (){
    System.out.print("name   = "+this.name);
    System.out.println(" | health = "+this.health);
  }

  //setter
  public void setname(String newname){
    this.name = newname;
  }
}