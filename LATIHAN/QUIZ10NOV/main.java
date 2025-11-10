public class main{
public static void main(String[] args){
        segitiga segitiga = new segitiga(6, 8);
        System.out.println("\n=== SEGITIGA ===");
        System.out.println("Alas     = " + segitiga.getalas());
        System.out.println("Tinggi   = " + segitiga.gettinggi());
        System.out.println("Luas     = " + segitiga.getluas());
        System.out.println("Keliling = " + segitiga.getkeliling());

        persegi persegi = new persegi(5);
        System.out.println("\n=== PERSEGI ===");
        System.out.println("Sisi     = " + persegi.getsisi());
        System.out.println("Luas     = " + persegi.getluas());
        System.out.println("Keliling = " + persegi.getkeliling());

        lingkaran lingkaran = new lingkaran(7);
        System.out.println("\n=== LINGKARAN ===");
        System.out.println("Jari-jari= " + lingkaran.getJariJari());
        System.out.println("Luas     = " + lingkaran.getLuas());
        System.out.println("Keliling = " + lingkaran.getKeliling());
}
}