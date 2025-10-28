public class hero {
  String name = "this is superclass name";

  void display (){
    System.out.println(this.name);
    this.dummymethod();
  }

  void dummymethod(){
    System.out.println("this is a superclass method");
  }
}
