import java.util.Scanner;

public class GajiKaryawan22 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int gajiPokok;
        double bonus, totalGaji;
        double tunjanganTransportasi = 600000;
        double tunjanganMakan = 400000;

        System.out.print("Masukkan gaji pokok karyawan: ");
        gajiPokok = sc.nextInt();

        bonus = 0.05 * gajiPokok;
        totalGaji = gajiPokok + tunjanganTransportasi + tunjanganMakan + bonus - (0.1 * gajiPokok);

        System.out.println("Bonus karyawan: " + bonus);
        System.out.println("Total gaji karyawan: " + (int) totalGaji);

    sc.close();

    }
}
