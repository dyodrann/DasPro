public class piramida {

    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i <= 10; i++) {
            for (int j=0; j < 10 -i; j++){
                System.out.print("");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
