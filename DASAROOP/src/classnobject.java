//membuat class sebagai objek
class mahasiswa{
    int umur;
    String nama;
}



public class classnobject {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //instansiasi/membuat objek
        //objek 1
        mahasiswa mahasiswa1 = new mahasiswa();
        mahasiswa1.nama = "rakha";
        mahasiswa1.umur = 19;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.umur);

        //objek 2
        mahasiswa mahasiswa2 = new mahasiswa();
        mahasiswa2.nama = "hasan";
        //mahasiswa2.umur = 18;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.umur); //akan null karna belum diisi
    }
}