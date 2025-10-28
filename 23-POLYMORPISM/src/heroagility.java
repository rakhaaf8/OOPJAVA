public class heroagility extends hero{
  String type = "agility";

  heroagility(String nama){
		super(nama);
	}

	@Override
	void show(){
		super.show();
		System.out.println("Type \t: " + this.type);
	}


  //this is can call when the class is hero agility
	void showoff(){
		System.out.println("Saya hero Agility!!");
	}
}
