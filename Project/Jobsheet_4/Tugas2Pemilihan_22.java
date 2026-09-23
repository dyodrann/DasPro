import java.util.Scanner;

public class Tugas2Pemilihan_22 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah SKS : ");
        int jumlahSKS = input.nextInt();

        if (jumlahSKS > 24) {
            System.out.println("Registrasi ditolak. Jumlah SKS melebihi batas maksimal");
        } else {
            System.out.println("Registrasi diterima");
        }

    }
}
