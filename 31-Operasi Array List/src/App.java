import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
    hero hero1 = new hero("Ucup",100);
		hero hero2 = new hero("Otong",100);
		heroagility heroAgility = new heroagility("Dudung", 50);
		herointel heroIntel = new herointel("Johny", 20);

		ArrayList<hero> listHero = new ArrayList<>();

		// operasi satu: menambah member dengan add
		System.out.println("Operasi 1: add");
		listHero.add(hero1);
		listHero.add(hero2);
		listHero.add(heroAgility);
		
		System.out.println(listHero);
		System.out.println();
		
		// operasi dua: merubah member dengan set
		System.out.println("Operasi 2: set");
		listHero.set(1,heroIntel);
		System.out.println(listHero);
		System.out.println();
		
		// operasi ketiga: menghapus member dengan remove
		System.out.println("Operasi 3: remove");
		listHero.remove(1);
		System.out.println(listHero);
		System.out.println();
		
		// operasi keempat: mengakses member
		System.out.println("Operasi 4: get");
		System.out.println(listHero);
		hero heroAmbil = listHero.get(0);
		System.out.println(listHero);
		heroAmbil.show();
		System.out.println();

		// method pada arraylist
		System.out.println("method2");
		System.out.println("1. size()\t: " + listHero.size());
		System.out.println("2. isEmpty()\t: " + listHero.isEmpty());
		System.out.println("3. containts(hero2)\t: " + listHero.contains(hero2));
		System.out.println("   containts(heroAgility)\t: " + listHero.contains(heroAgility));
		System.out.println("4. indexOf(hero1)\t: " + listHero.indexOf(hero1));
		System.out.println("   indexOf(heroAgility)\t: " + listHero.indexOf(heroAgility));
    }
}
