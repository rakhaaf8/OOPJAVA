
import java.io.IOException;
//class player
import java.util.Scanner;

class player {
    String name;
    Double health;
    int level;

    // object turunan
    weapon weapon;
    armor armor;

    player(String name, double health) {
        this.name = name;
        this.health = health;
    }

    void attack(player musuh) {
        double attackpower = this.weapon.attackpower;
        System.out.println(this.name + " attacking " + musuh.name + " with " + attackpower + " power");
        musuh.defence(attackpower);
    }

    void defence(double attackpower) {
        double demage;
        if (this.armor.defencepower < attackpower) {
            demage = attackpower - this.armor.defencepower;
        } else {
            demage = 0;
        }
        this.health -= demage;
        System.out.println(this.name + " gets demage " + demage);
    }

    void equipweapon(weapon weapon) {
        this.weapon = weapon;

    }

    void equiparmor(armor armor) {
        this.armor = armor;

    }

    void display() {
        System.out.println("\n=====================================================");
        System.out.println("player name   = " + this.name);
        System.out.println("player health = " + this.health);
        this.weapon.show();
        this.armor.show();
        System.out.println("\n=====================================================");
        System.out.println("\n");
    }
}

// class weapon
class weapon {
    String weapon;
    double attackpower;

    weapon(String weapon, double attackpower) {
        this.weapon = weapon;
        this.attackpower = attackpower;
    }

    void show() {
        System.out.println("weapon type   = " + this.weapon + " | attack power = " + this.attackpower);

    }
}

// class armor
class armor {
    String armor;
    double defencepower;

    armor(String armor, double defencepower) {
        this.armor = armor;
        this.defencepower = defencepower;
    }

    void show() {
        System.out.print("armor type    = " + this.armor + " | defence power = " + this.defencepower);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean isgas = true;
        while (isgas) {
            clearScreen();

            System.out.println("=======WELCOME TO THE STAGE=======");

            // bikin player 1
            // bikin nama
            System.out.print("Masukan nama player 1 = ");
            String nama = input.nextLine();
            System.out.print("Masukan berapa darah dia = ");
            double health = input.nextDouble();
            player player1 = new player(nama, health);
            // bikin senjata
            // weapon
            input.nextLine();
            System.out.print("Masukan nama senjata anda = ");
            String senjata = input.nextLine();
            System.out.print("Masukan berapa power " + senjata + " anda = ");
            double powerattack = input.nextDouble();
            weapon weapon1 = new weapon(senjata, powerattack);
            // armor
            input.nextLine();
            System.out.print("Masukan nama armor anda = ");
            String defend = input.nextLine();
            System.out.print("Masukan berapa power defend " + defend + " anda = ");
            double powerdefend = input.nextDouble();
            armor armor1 = new armor(defend, powerdefend);
            // pake senjatanya
            player1.equipweapon(weapon1);
            player1.equiparmor(armor1);
            // display
            player1.display();

            // bikin player 2
            input.nextLine();
            // bikin nama
            System.out.print("Masukan nama player 2 = ");
            String nama2 = input.nextLine();
            System.out.print("Masukan berapa darah dia = ");
            double health2 = input.nextDouble();
            player player2 = new player(nama2, health2);
            // bikin senjata
            // weapon
            input.nextLine();
            System.out.print("Masukan nama senjata anda = ");
            String senjata2 = input.nextLine();
            System.out.print("Masukan berapa power " + senjata2 + " anda = ");
            double powerattack2 = input.nextDouble();
            weapon weapon2 = new weapon(senjata2, powerattack2);
            // armor
            input.nextLine();
            System.out.print("Masukan nama armor anda = ");
            String defend2 = input.nextLine();
            System.out.print("Masukan berapa power defend " + defend2 + " anda = ");
            double powerdefend2 = input.nextDouble();
            armor armor2 = new armor(defend2, powerdefend2);
            // pake senjatanya
            player2.equipweapon(weapon2);
            player2.equiparmor(armor2);
            // display
            player2.display();

            input.nextLine();
            System.out.print("\nLanjut pertempuran (y/n)= ");
            String jawaban = input.nextLine();
            if (jawaban.equalsIgnoreCase("n")) {
                isgas = false;
                break;
            } else {
                // boolean islanjut = true;
                String jaw;
                int i = 1;
                do {
                    clearScreen();
                    System.out.println("\nPERTEMPURAAAN");
                    System.out.println("\nEpisode - " + i);
                    System.out.print("player mana yang ingin menyerang (1/2) ? ");
                    int attack1 = input.nextInt();
                    input.nextLine();
                    if (attack1 == 1) {
                        player1.attack(player2);
                    } else if (attack1 == 2){
                        player2.attack(player1);
                    } else {
                        System.out.println("input ga valid");
                    }
                    player1.display();
                    player2.display();
                    i += 1;
                    System.out.print("\nLanjut ke episode selanjutnya (y/n) = ");
                    jaw = input.next();
                } while (!jaw.equalsIgnoreCase("n"));
            }
            isgas = false;
        }
    }

    public static void clearScreen() throws IOException {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex) {
            System.err.println("tidak bisa clear screen");
        }
    }
}