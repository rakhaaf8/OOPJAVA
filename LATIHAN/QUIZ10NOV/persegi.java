public class persegi {
  private int sisi;
  public persegi(){
  }
  public persegi(int sisi){
    this.sisi = sisi;
  }

  //setter
  public void setter (int sisi){
    this.sisi = sisi;
  }

  //getter
  public int getkeliling(){
    return this.sisi*4;
  }
  public int getluas(){
    return this.sisi*this.sisi;
  }
  public int getsisi(){
    return this.sisi;
  }
}
