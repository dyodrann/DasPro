// public class SearchNilai_22 {
//     public static void main(String[] args) {
        
//         int[] nilai = {78, 65, 90, 55, 88, 72};
//         int key = 90;
//         boolean ditemukan = false;

//         for (int i = 0; i < nilai.length; i++) {
//             if (nilai[i] == key) {
//                 System.out.println("Nilai " + nilai [i] + " ditemukan pada indeks ke-" + i);
//                 ditemukan = true;
//                 break;
//             }
//         }

//         if (!ditemukan) {
//             System.out.println("Nilai " + key + " tidak ditemukan");
//         }
//     }
// }



//Modifikasi 1 Bagian A
// import java.util.Scanner;

// public class SearchNilai_22 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n;
        
//         System.out.print("Masukkan banyak nilai: ");
//         n = sc.nextInt();
//         int[] nilai = new int[n];

//         for (int i = 0; i < nilai.length; i++) {
//             System.out.print("Masukkan nilai indeks ke-" + i + ": ");
//             nilai[i] = sc.nextInt();
//         }

//         int key;

//         System.out.print("Cari nilai: ");
//         key = sc.nextInt();

//         boolean ditemukan = false;

//         for (int i = 0; i < nilai.length; i++) {
//             if (nilai[i] == key) {
//                 System.out.println("Nilai " + nilai [i] + " ditemukan pada indeks ke-" + i);
//                 ditemukan = true;
//                 break;
//             }
//         }

//         if (!ditemukan) {
//             System.out.println("Nilai " + key + " tidak ditemukan");
//         }
//     }
// }

// Modifikasi 2 Bagian A
import java.util.Scanner;

public class SearchNilai_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Masukkan banyak nilai: ");
        n = sc.nextInt();
        int[] nilai = new int[n];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai indeks ke-" + i + ": ");
            nilai[i] = sc.nextInt();
        }

        int key;

        System.out.print("Cari nilai: ");
        key = sc.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + nilai [i] + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan");
            System.out.println("Silakan periksa kembali nilai yang Anda cari.");
        }
    }
}