// import java.util.Scanner;

// public class ArrayRataNilai_22 {
    
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         int[] nilaiMhs = new int[10];
//         int total = 0;
//         double rata2;

//         for (int i = 0; i < nilaiMhs.length; i++) {
//         System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
//         nilaiMhs[i] = input.nextInt();
//         total += nilaiMhs[i];
        
//         }

//         rata2 = (double) total / nilaiMhs.length;
//         System.out.println("Total nilai: " + total);
//         System.out.println("Rata-rata: " + rata2);

//         int tertinggi = nilaiMhs[0];
//         int terendah = nilaiMhs[0];
//             for (int i = 1; i < nilaiMhs.length; i++) {
//                 if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
//                 if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
//         }

//         System.out.println("Nilai tertinggi: " + tertinggi);
//         System.out.println("Nilai terendah: " + terendah);

//         String status;
//         if (rata2 >= 85) {
//             status = "SANGAT BAIK";
//         } else if (rata2 >= 70) {
//             status = "BAIK";
//         } else {
//             status = "PERLU PENDAMPINGAN";
//         }

//         System.out.println("Predikat kelas: " + status);


//     }
// }

//Modifikasi 1
import java.util.Scanner;

public class ArrayRataNilai_22 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        int total = 0, l = 0, t = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
        nilaiMhs[i] = input.nextInt();
        total += nilaiMhs[i];

        if (nilaiMhs[i] > 70) {
                l++;
            } else {
                t++;
            }

        }

        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
            for (int i = 1; i < nilaiMhs.length; i++) {
                if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
                if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        String status;
        if (rata2 >= 85) {
            status = "SANGAT BAIK";
        } else if (rata2 >= 70) {
            status = "BAIK";
        } else {
            status = "PERLU PENDAMPINGAN";
        }

        System.out.println("Predikat kelas: " + status);
        System.out.println("Jumlah mahasiswa lulus (nilai > 70): " + l);
        System.out.println("Jumlah mahasiswa tidak lulus: " + t);


    }
}


//Modifikasi 2 
// import java.util.Scanner;

// public class ArrayRataNilai_22 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         int[] nilaiMhs = new int[10];
//         int total = 0, l = 0, t = 0;
//         double rata2;

//         System.out.print("Masukkan jumlah mahasiswa: ");
//         int jumlah = input.nextInt();

//         while (jumlah <= 0) {
//             System.out.print("Jumlah harus lebih dari 0, masukkan lagi: ");
//             jumlah = input.nextInt();
//         }

//         for (int i = 0; i < nilaiMhs.length; i++) {
//             System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
//             nilaiMhs[i] = input.nextInt();
//             total += nilaiMhs[i];
//         }

//         rata2 = (double) total / nilaiMhs.length;
//         System.out.println("Total nilai: " + total);
//         System.out.println("Rata-rata: " + rata2);

//         int tertinggi = nilaiMhs[0];
//         int terendah = nilaiMhs[0];
//         for (int i = 1; i < nilaiMhs.length; i++) {
//             if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
//             if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
//         }
//         System.out.println("Nilai tertinggi: " + tertinggi);
//         System.out.println("Nilai terendah: " + terendah);

//         String predikat;
//         if (rata2 >= 85) {
//             predikat = "SANGAT BAIK";
//         } else if (rata2 >= 70) {
//             predikat = "BAIK";
//         } else {
//             predikat = "PERLU PENDAMPINGAN";
//         }
//         System.out.println("Predikat kelas: " + predikat);

//         int jumlahLulus = 0;
//         for (int i = 0; i < nilaiMhs.length; i++) {
//             if (nilaiMhs[i] > 70) {
//                 jumlahLulus++;
//             }
//         }
//         System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
//     }
// }
