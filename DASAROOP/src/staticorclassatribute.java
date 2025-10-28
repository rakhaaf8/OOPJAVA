
class display{
  static String type = "display";
  private String name;

  display (String name){
    this.name = name;
  }

  void settype(String newtype){
    //type = newtype; //cara 1
    //this.type = newtype; //cara 2
    display.type = newtype; //cara 3
    //cara 3 is the most recomended
    
  }
  void show(){
    System.out.println("display name = "+this.name);
  }
}

public class staticorclassatribute {
  public static void main(String[] args) {
    display display1 = new display("monitor");
    display1.show();
    display display2 = new display("smartphone");
    display2.show();

    //ini bagian untuk merubah si static nya
    display1.settype("martabak enak");

    //System.out.println(display1.type); //object 1
    //System.out.println(display2.type);//object 2
    System.out.println(display.type);//class

    //so static is a condition of a data that for every object
    //(for display1,display2,class dll)
    //if i change the static data in one of the object (ex = line 27)
    //static in every object will change too


  }
}
