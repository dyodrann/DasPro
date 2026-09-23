import java.util.Scanner;

public class TugasParkir_22 {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int jamParkir;
    int biayaParkir;

    System.out.print("Masukkan jam lama parkir: ");
    jamParkir = scanner.nextInt();

    if (jamParkir <= 2) {
        biayaParkir = 2000;

    } else {
        biayaParkir = 2000 + (jamParkir - 2) * 1000;
    }

    System.out.println("Biaya parkir: " + biayaParkir);
    
    }
}