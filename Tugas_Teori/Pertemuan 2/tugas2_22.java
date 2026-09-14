import java.util.Scanner;

public class tugas2_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        double PanjangTanah,LebarTanah,DiameterKolam,SisiTaman,LuasTanah,JariJari,LuasKolam,LuasTaman,LuasSisa; 

        // Input
        System.out.print("Masukkan panjang tanah (m): ");
        PanjangTanah = input.nextDouble();

        System.out.print("Masukkan lebar tanah (m): ");
        LebarTanah = input.nextDouble();

        System.out.print("Masukkan diameter kolam ikan (m): ");
        DiameterKolam = input.nextDouble();

        System.out.print("Masukkan sisi taman bunga (m): ");
        SisiTaman = input.nextDouble();

        // Proses
        LuasTanah = PanjangTanah * LebarTanah;
        JariJari = DiameterKolam / 2;
        LuasKolam = Math.PI * JariJari * JariJari;
        LuasTaman = SisiTaman * SisiTaman;
        LuasSisa = LuasTanah - LuasKolam - LuasTaman;

        // Output
        System.out.println("Luas tanah keseluruhan : " + LuasTanah + " m2");
        System.out.println("Luas kolam ikan         : " + LuasKolam + " m2");
        System.out.println("Luas taman bunga        : " + LuasTaman + " m2");
        System.out.println("Luas tanah tidak digunakan: " + LuasSisa + " m2");

        input.close();
    }
}