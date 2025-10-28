public class herointel extends hero{
  String type = "intel";

  herointel(String nama){
		super(nama);
	}

	@Override
	void show(){
		super.show();
		System.out.println("Type \t: " + this.type);
	}
}
