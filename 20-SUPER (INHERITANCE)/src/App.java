public class App {
    public static void main(String[] args) throws Exception {
        hero hero1 = new hero();
        hero1.display();
        
        System.out.println();

        heropower hero2 = new heropower();
        hero2.display();
    }
}

//SUMMARY
//THIS.NAME WILL ACCESS ARTIBUTE FROM SUBCLASS (IF THERE IS)
//IF THERE DONT HAVE, OTOMATICLY CALL FROM SUPERCLASS
//BUT
//SUPER.NAME ALWAYS ACCESS ATRIBUTE FROM SUPERCLASS 
//WHATEVER THE CONDITION
