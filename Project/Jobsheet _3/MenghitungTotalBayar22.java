import java.util.Scanner;

public class MenghitungTotalBayar22 {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

        int harga;
        double potongan, jml_bayar;
        double diskon = 0.1;

        System.out.print("Masukkan harga barang: ");
        harga = sc.nextInt();
        
        potongan = diskon * diskon;
        jml_bayar = harga - potongan;

        System.out.println("Potongan harga: " + potongan);
        System.out.println("Jumlah yang harus dibayar: " + jml_bayar);

    sc.close();

    }
}
