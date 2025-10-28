//membuat class sebagai objek
class mahasiswa {
    String nama;
    //int umur;
    String jurusan;

    //membuat contructor
    mahasiswa(String inputnama, String inputjurusan){
      nama = inputnama;
      jurusan = inputjurusan;

      System.out.println(nama);
      System.out.println(jurusan);
    }
    
}


public class constructor {
  public static void main(String[] args) throws Exception{
    mahasiswa mahasiswa1 = new mahasiswa("rakha","sistem informasi");
    mahasiswa mahasiswa2 = new mahasiswa("hasan","hukum");

    System.out.println(mahasiswa1.nama);
    System.out.println(mahasiswa2.jurusan);
  }
}
