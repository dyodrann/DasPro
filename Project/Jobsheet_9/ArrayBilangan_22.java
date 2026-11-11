import java.util.Arrays;

public class ArrayBilangan_22 {
    public static void main(String[] args) {
        
        int[] bil = new int[4];

        bil[0] = 5;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil [" + i + "] = " + bil[i]);
        }

        for (int nilai : bil) {
            System.out.println(nilai);
        }

        System.out.println(Arrays.toString(bil));
    }
}


//Modifikasi

// import java.util.Arrays;

// public class ArrayBilangan_22 {

//     public static void main(String[] args) {
        
//         int[] bil = {5, 13, -7, 17};

//         for (int i = 0; i < 4; i++) {
//             System.out.println("bil[" + i + "] = " + bil[i] + ", double = " + (bil[i] * 2));
//         }
         
//         System.out.println(Arrays.toString(bil)); 
//     }
// }