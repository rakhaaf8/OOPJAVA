
public class App {
    public static void main(String[] args) throws Exception {
        //using constructor from super class
        hero hero1 = new hero("rakha",10);
        hero1.show();

        //using constructor from sub class
        hero hero2 = new hero("ahmad",8);
        hero2.show();

        //using constructor from sub class
        hero hero3 = new hero("fabiano",10);
        hero3.show();
    }
}
