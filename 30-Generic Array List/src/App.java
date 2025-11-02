import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        hero hero1 = new hero("rakha",100);
        hero hero2 = new hero("ahmad",200);
        herointel herointel = new herointel("fabiano",300);
        heroagility heroagility = new heroagility("cia",400);

        // Array sederhana
        hero[] kumpulanHero = new hero[3]; //this is array fix
        //we are declaration the length of array

        // masukan anggota
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = herointel;
        // kumpulanHero[3] = heroagility; //it cant bcs array fix (only 3)
        //and we cant add the data

        for(hero hero:kumpulanHero){
            hero.show();
        }
        
        // Array List
        ArrayList<hero> listHero = new ArrayList<hero>();
        
        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(herointel);
        listHero.add(heroagility);
        
        System.out.println("\nArrayList\n");
        for(hero hero:listHero){
            hero.show();
        }
        
        // referens
        herointel.setname("Dudung");
        
        System.out.println("\nArrayList\n");
        for(hero hero:listHero){
            hero.show();
        }
        
        System.out.println("\nArray\n");
        for(hero hero:kumpulanHero){
            hero.show();
        }
    }
}

//SUMMARY
//WITH ARRAY LIST WE CAN ADD HOWEVER MUCH OF DATA, WITHOUT DECLARATION THE LENGTH
//THE ARRAY, IT REALLY USEFULL
//THE SINTAKS = ArrayList<hero> listHero = new ArrayList<hero>();
