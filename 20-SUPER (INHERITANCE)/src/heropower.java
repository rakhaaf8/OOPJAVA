//subclass

public class heropower extends hero {
  String name = "this is subclass name";

  void display (){
    System.out.println(this.name);
    this.dummymethod(); //it will call dummy from subclass
    super.dummymethod(); //it will call dummy from superclass
  }

  void dummymethod(){
    System.out.println("this is a subclass method");
  }
}
