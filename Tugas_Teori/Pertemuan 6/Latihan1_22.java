import java.util.Scanner;

public class Latihan1_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan satu: ");
        int bilangan1 = input.nextInt();

        System.out.print("Masukkan bilangan dua: ");
        int bilangan2 = input.nextInt();

        System.out.print("Masukkan bilangan tiga: ");
        int bilangan3 = input.nextInt();

        int terbesar;

        if(bilangan1 > bilangan2){
            if(bilangan1 > bilangan3){
                terbesar = bilangan1;
            } else {
            terbesar = bilangan3;
            }
        } else{
            if(bilangan2 > bilangan3){
            terbesar = bilangan2;
        } else {
            terbesar = bilangan3;
            }
        }

        System.out.println("Bilangan terbesar adalah: " + terbesar);
    }
}