import java.util.Scanner;

public class KafeDoWhile_22 {
    public static void main(String[] args) {
        int hargaKopi = 12000, kopi;
        int hargaTeh = 7000, teh;
        int hargaRoti = 20000, roti;
        int totalHarga;
        String namaPelanggan;

        Scanner input = new Scanner(System.in); {
            do {
                System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
                namaPelanggan = input.nextLine();
                if (namaPelanggan.equalsIgnoreCase("batal")) {
                    System.out.println("Transaksi dibatalkan.");
                    break;
                }

                System.out.print("Jumlah kopi: ");
                kopi = input.nextInt();
                System.out.print("Jumlah teh: ");
                teh = input.nextInt();
                System.out.print("Jumlah roti: ");
                roti = input.nextInt();

                totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
                System.out.println("Total harga untuk " + namaPelanggan + ": Rp " + totalHarga);
                input.nextLine();
            } while (true);

            System.out.println("Semua transaksi selesai.");
        }
    }
}