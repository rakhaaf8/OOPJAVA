class buku {
  String judul;
  String penulis;

  buku (String judul, String penulis){
    this.judul = judul;
    this.penulis = penulis;
  }

  void display (){
    System.out.println("\njudul \t\t= "+this.judul);
    System.out.println("penulis \t= "+this.penulis);
  }
}


public class reference {
  public static void main(String[] args) {
    buku buku1 = new buku("jejak langkah", "fiersa besari");
    buku1.display();

    //menampilkan addres buku1
    String addressbuku1=Integer.toHexString(System.identityHashCode(buku1));
    System.out.println("address buku 1 = "+addressbuku1);
    
    //buat buku 2
    buku buku2 = buku1;
    buku2.display();
    String addressbuku2=Integer.toHexString(System.identityHashCode(buku2));
    System.out.println("address buku 2 = "+addressbuku2);
    //maka hasilnya akan sama, addressnya jg sama, jadi dia ga ngecopy object nya,
    //tpi ngecopy addressnya dgn variable baru

    //pembuktian
    buku1.judul = "atomic habit";
    buku1.display();
    buku2.display();
    //maka 22 nya akan berubah

    //ini akan bermasalah jika kita membuat method
    //cba kita panggil method nya
    fungsi(buku2);
    buku1.display();
    buku2.display();
    //akan berubah semua


  }
  public static void fungsi(buku databuku){
    String addressbook=Integer.toHexString(System.identityHashCode(databuku));
    System.out.println("\naddress dalam fungsi = "+addressbook);
    databuku.penulis = "raditya dika";

  }
}
