public class herostrength extends hero {

  String type = "strength";
  herostrength(String nama){
		super(nama);
	}

	@Override
	void show(){
		super.show();
		System.out.println("Type \t: " + this.type);
	}
}
