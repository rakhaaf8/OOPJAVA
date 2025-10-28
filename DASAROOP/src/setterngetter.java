class data {
  public int intPublic;
  private int intPrivate;

  public data(){
    this.intPublic=0;
    this.intPrivate=10;
  }

  //getter (ngambil data/read)
  public int getintPrivate(){
    return this.intPrivate;
  }

  //setter (write)
  public void setintPrivate(int setangkabaru){
    this.intPrivate = setangkabaru;
  }
}

class lingkaran {
    private double diameter;

    lingkaran(double diameter){
      this.diameter = diameter;
    }

    //setter
    public void setjari2 (double newjari2){
      this.diameter = newjari2*2;
    }

    //getter
    public double getjari2 (){
      return this.diameter/2;
    }

    //getter luas lingkaran
    public double getluas (){
      return 3.14*this.diameter*this.diameter/4;
    }
  }

public class setterngetter{
  public static void main(String[] args) {
    //public
    //read n write menggunakan public
    data object = new data();
    object.intPublic=5; //write
    System.out.println("\ndata public = "+object.intPublic);//read

    //private
    //1. getter = mengambil/read only
    int getter = object.getintPrivate();
    System.out.println("data private (getter) = "+ getter);
    
    //2. setter = write
    //write only
    object.setintPrivate(100);


    //lingkaran
    lingkaran lingkaran1 = new lingkaran (9.0);
    System.out.println("jari jari : "+lingkaran1.getjari2());
    lingkaran1.setjari2(8.0);
    System.out.println("jari jari : "+lingkaran1.getjari2());
    System.out.println("luas lingkaran = "+lingkaran1.getluas());
    





  }
}
