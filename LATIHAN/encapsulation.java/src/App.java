class player {
    private String name;
    private int basehealth;
    private int baseattack;
    private int incrementhealth;
    private int incrementattack;
    private int level;
    private int totaldemage;
    private boolean isalive;

    //object
    private armor armor;
    private weapon weapon;

    player(String name){
        this.name = name;
        this.basehealth=100;
        this.baseattack=100;
        this.level=1;
        this.incrementhealth=20;
        this.incrementattack=20;
        this.isalive = true;
    }

    private String getname (){
        return this.name;
    }
    public void show(){
        System.out.println("\nnama \t\t= "+this.name);
        System.out.println("level \t\t= "+this.level);
        System.out.println("health  \t= "+this.gethealth()+ "/"+this.maxhealth());
        System.out.println("attack \t\t= "+this.getattackpower());
        System.out.println("alive \t\t= "+this.isalive);
        //System.out.println("armor \t= "+this.armor.name);
    }

    private int gethealth(){
        return this.maxhealth() - this.totaldemage;
    }
    public void attack (player opponent){
        //hitung demage
        int demage = this.getattackpower();
        //hitung event
        System.out.println("\n"+this.name +" is attacking "+opponent.getname()+" with "+demage);
        //attack si opponent
        opponent.defend(demage);

        this.levelup(); //jadi setiap attack bakal level up
        //ini supaya level up nya kepake
    }

    private void defend (int demage){
        //receive demage
        int defendpower = this.armor.getdefencepower();
        int deltademage;
        System.out.println(this.name +" defence power = "+defendpower);
        if (demage > defendpower){
            deltademage = demage - defendpower;
        } else {
            deltademage = 0;
        }
        System.out.println("demage earned = "+deltademage);

        //adding total demage
        this.totaldemage += deltademage;

        //check is alive
        if (gethealth()<=0){
            this.isalive = false;
            this.totaldemage = this.maxhealth();
        }
        this.show();
    }
    public void setweapon(weapon weapon){
        this.weapon = weapon;
    }
    private void levelup (){
        this.level++;
    }
    public void setarmor (armor armor){
        this.armor = armor;
    } 

    private int maxhealth (){
        return this.basehealth+this.incrementhealth*this.level+this.armor.getaddhealth()*10;
    }

    private int getattackpower(){
        return this.baseattack+this.level*this.incrementattack+this.weapon.getattack();
    }
}

class weapon{
    private String name;
    private int attack;
    weapon (String name, int attack){
        this.name = name;
        this.attack = attack;
    }

    int getattack (){
        return this.attack;
    }
    
}

class armor{
    private String name;
    private int strenght;
    private int health;

    armor (String name, int strenght,int health){
        this.name = name;
        this.strenght = strenght;
        this.health = health;
    }

    int getaddhealth (){
        return this.strenght*10 + this.health;
    }
    int getdefencepower(){
        return this.strenght*2;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("==========LATIHAN ENCAPSULATION==========");

        //player 1
        player player1 = new player("joko");
        armor armor1 = new armor("baju besi",5,20);
        weapon weapon1 = new weapon("pedang",10);
        player1.setarmor(armor1);
        player1.setweapon(weapon1);
        player1.show();
        
        
        //player 2
        player player2 = new player("wido");
        armor armor2 = new armor("vest",1,20);
        weapon weapon2 = new weapon("gun",40);
        player2.setarmor(armor2);
        player2.setweapon(weapon2);
        player2.show();
        
        player1.attack(player2);
        player2.attack(player1);



    }
}
