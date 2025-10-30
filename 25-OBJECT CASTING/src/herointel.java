public class herointel extends hero{
  String type;

  herointel(String name, double health){
    super(name,health);
    this.type = "intel";
  }

  void show (){
    System.out.println(this.getname() + " is an "+ this.type+" hero");
  }

  public void castMagic(){
		System.out.println("Mengeluarkan Mejik");
	}
}
