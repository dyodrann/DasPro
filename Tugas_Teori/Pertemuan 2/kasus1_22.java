import java.util.Scanner;

public class kasus1_22 {
    
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);

        int Panjang, Lebar, Keliling;

        Panjang = input.nextInt();
        Lebar = input.nextInt();

        Keliling = 2 * (Panjang+Lebar);

        System.out.println(Keliling);

        input.close();


    }
}
