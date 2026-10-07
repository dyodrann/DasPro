package Project.Jobsheet_6;
import java.util.Scanner;

public class StudiKasus1_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hargaCup=18000;
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;
        
        System.out.print("Jumlah Cup: ");
        jumlahCup = scanner.nextInt();

        System.out.print("Uang Bayar: ");
        uangBayar = scanner.nextInt();
        
        totalHarga = hargaCup * jumlahCup;
        diskon = 0;

        System.out.println("Total Harga: " + totalHarga);

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        totalBayar = totalHarga - diskon;
            System.out.println("Total Harga: " + totalHarga);
            System.out.println("Diskon: " + diskon);
            System.out.println("Total Bayar : " + totalBayar);
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian : " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp." + kurang);
        }

    }
}
