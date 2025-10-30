

public class App {
    public static void main(String[] args) throws Exception {

        // object dengan class HeroIntel
        herointel hero1 = new herointel("Ucup",100);

		hero1.show();
		hero1.castMagic();
		
		// up casting
		hero heroUp = (hero) hero1;

		heroUp.show();

		// ada field dan method yang hilang
		// System.out.println(heroUp.type);
		// heroUp.castMagic();

		hero heroReg = new hero("Otong",100);

		heroReg.show();

		// down casting dari Superclass ke subclass, tidak bisa

		// HeroAgility heroDown = (HeroAgility) heroReg;

		// heroDown.display();

		// kita coba dari intel ke hero biasa lalu kita balikan ke intel

		herointel hero2 = (herointel) heroUp;

		// berhasil di down casting, dengan syarat bentuk awalnya adalah sama
		hero2.show();
		System.out.println(hero2.type);
		hero2.castMagic();
    }
}

//SUMMARY
//1. WE CAN UP CASTING, BUT ADA BBRP FIELD N METHOD YANG HILANG
//2. WE CANNOT DOWN CASTING, BUT IF WE UP CASTING AND THEN WE DOWN CASTING AGAIN TO 
//   THE FIRST CLASS... IT CAN
//3. THIS IS IMPORTANT IF WE CREATE A ARRAY (CLASS HERO/SUPER CLASS), INCLUDE OBJECT2 WITH
//   SUBCLASS
