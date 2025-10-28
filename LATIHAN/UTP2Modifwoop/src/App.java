import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        hero hero1 = new hero("Lemon",25,10,5);
        hero hero2 = new hero("Kairi",15,20,10);
        hero hero3 = new hero("Vyn",10,5,15);

        double ip1 = hero1.ipcalculate(hero1.bonus());
        double ip2 = hero2.ipcalculate(hero2.bonus());
        double ip3 = hero3.ipcalculate(hero3.bonus());

        hero1.show();
        hero2.show();
        hero3.show();

        //top player
        String mvp = hero1.name;
        if(ip1<ip2){
            mvp = hero2.name;
        } else if(ip2<ip3){
            mvp = hero3.name;
        }
        System.out.println("Top Player = "+mvp);

        //ratarata
        double ratarata = (ip1+ip2+ip3)/3;
        System.out.printf("Rata-rata = %.2f",ratarata);

    }
}
