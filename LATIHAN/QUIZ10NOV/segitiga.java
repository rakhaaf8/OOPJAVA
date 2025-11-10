public class segitiga {
  private double tinggi,alas;
  public segitiga(){
  }
  public segitiga(double tinggi,double alas){
    this.alas = alas;
    this.tinggi = tinggi;
  }

  //setter
  public void setter (double tinggi,double alas){
    this.alas = alas;
    this.tinggi = tinggi;
  }
  //getter
  public double getluas(){
    return (this.alas*this.tinggi)/0.5;
  }
  public double getkeliling(){
    double sisimiring = Math.sqrt(Math.pow(alas / 2, 2) + Math.pow(tinggi, 2));
    return this.alas+this.tinggi+sisimiring;
  }
  public double getalas(){
    return this.alas;
  }
  public double gettinggi(){
    return this.tinggi;
  }
}
