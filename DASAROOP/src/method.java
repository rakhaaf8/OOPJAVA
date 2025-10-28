class mahasiswa {
  String nama = "nama default";
  String NIM  = "NIM default";

  mahasiswa(String nama, String NIM){
    this.nama = nama;
    this.NIM  = NIM;
    System.out.println(nama);
    System.out.println(NIM);
  }

  //membuat method (ada 4 jenis method)
  //1. method tanpa parameter dan tanpa return
  void show (){
    System.out.println("\n-----ini fungsi 1-----");
    System.out.println("nama : "+this.nama);
    System.out.println("NIM  : "+this.NIM);
  }
  //2. method dengan parameter dan tanpa return
  void sayhi (String nama){
    System.out.println("\n-----ini fungsi 2-----");
    System.out.println("halo "+(this.nama=nama));
  }
  //3. method tanpa parameter dan dengan return
  String getnama(){
    return this.nama;
  }
  //4. method parameter dan return
  String kirimpesan (String pesan){
    return "for "+this.nama+" "+pesan;
  }

}

public class method {
  public static void main(String[] args) {
    mahasiswa ma1 = new mahasiswa("rakha ahmad f", "20193020");
    mahasiswa ma2 = new mahasiswa("hassannauntauri", "90485080");

    //panggil method
    //fungsi 1
    ma1.show();
    ma2.show();
    //fungsi 2
    ma1.sayhi("bambang");
    ma2.sayhi("tono");
    //fungsi 3
    System.out.println("\n-----ini fungsi 3-----");
    String getnama1 = ma1.getnama();
    String getnama2 = ma2.getnama();
    System.out.println(getnama1);
    System.out.println(getnama2);
    //fungsi 4
    System.out.println("\n-----ini fungsi 4-----");
    String kirimpesan1 = ma1.kirimpesan("kamu ganteng banget deh ");
    String kirimpesan2 = ma2.kirimpesan("makasih ya udah lahir di dunia ");
    System.out.println(kirimpesan1);
    System.out.println(kirimpesan2);
  }
}
