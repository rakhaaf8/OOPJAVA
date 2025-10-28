public class hero {
  String name;

  hero(String name){
    this.name = name;
  }

  void show (){
    System.out.println("name = "+this.name);
  }


  //it will use when we create this method
  void attack (){
    System.out.println("menyerang");
  }
  //void attack (hero attack){
  //  System.out.println("menyerang");
  //}
  //we can input attack with several type
  //(magic damage, physical demage dll)


}
