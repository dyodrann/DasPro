import java.util.Scanner;

public class SiakadWhile_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0, jumlah, nilai;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlah = input.nextInt();
        
        i++;
        while (i < jumlah) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = input.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan nilai yang valid!");
                continue;
            }

            if (nilai > 80) {
                System.out.println("nilai mahasiswa ke-" + (i + 1) + " adalah: A");
                System.out.println("Bagus, pertahankan nilainya");
            } else if (nilai > 73) {
                System.out.println("nilai mahasiswa ke-" + (i + 1) + " adalah: B+");
            } else if (nilai > 65) {
                System.out.println("nilai mahasiswa ke-" + (i + 1) + " adalah: B");
            } else if (nilai > 60) {
                System.out.println("nilai mahasiswa ke-" + (i + 1) + " adalah: C+");
            } else if (nilai > 50) {
                System.out.println("nilai mahasiswa ke-" + (i + 1) + " adalah: C");
            } else if (nilai > 39) {
                System.out.println("nilai mahasiswa ke-" + (i + 1) + " adalah: D");
            } else {
                System.out.println("nilai mahasiswa ke-" + (i + 1) + " adalah: E");
            }
            i++;
        }
    }
}