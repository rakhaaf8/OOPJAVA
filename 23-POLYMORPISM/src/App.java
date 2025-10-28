public class App {
    public static void main(String[] args) throws Exception {
        hero hero1 = new hero("Ucup");
		herostrength hero2 = new herostrength("Otong");
		hero1.show();
		hero2.show();

		// Polymorphic
		hero hero3 = new heroagility("Maria");
		hero3.show();

		heroagility hero4 = new heroagility("Mahmud");
		hero4.show();
		hero4.showoff();
		// tidak bisa
		// HeroIntel hero4 = new hero("Mahmud");
		// hero4.show();

        // Array list
		hero[] kumpulanHero = new hero[4];
		kumpulanHero[0] = hero1;
		kumpulanHero[1] = hero2;
		kumpulanHero[2] = hero3;
		kumpulanHero[3] = hero4; // casting

		kumpulanHero[0].show();
		kumpulanHero[1].show();
		kumpulanHero[2].show();

        // method calls
		// kumpulanHero[3].showoff(); // ini tidak bisa
		hero4.showoff();

		// aplikasi
		// hero1.attack(hero2);
		// hero1.attack(hero3);
		// hero1.attack(hero4);
    }
}
