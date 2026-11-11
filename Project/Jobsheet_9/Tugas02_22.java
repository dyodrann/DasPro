import java.util.Scanner;

public class Tugas02_22{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng",
            "Mie Goreng",
            "Roti Bakar",
            "Kentang Goreng",
            "Teh Tarik",
            "Cappucino",
            "Chocolate Ice"
        };

        int[] harga = {
            15000, 13000, 10000, 12000,
            8000, 18000, 20000
        };

        System.out.println("===== MENU KAFE KAMPUS =====");

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]
                    + " - Rp" + harga[i]);
        }

        System.out.print("\nMasukkan nama menu yang ingin dicari: ");
        String cari = input.nextLine();

        int posisi = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari.trim())) {
                posisi = i;
                break;
            }
        }

        if (posisi != -1) {
            System.out.println("Menu ditemukan!");
            System.out.println("Nama menu : " + menu[posisi]);
            System.out.println("Harga     : Rp" + harga[posisi]);
        } else {
            System.out.println("Maaf, menu tidak tersedia.");
        }

        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int jumlah = input.nextInt();
        input.nextLine();

        String[] pesanan = new String[jumlah];

        int totalBiaya = 0;

        for (int i = 0; i < pesanan.length; i++) {

            boolean valid = false;

            while (!valid) {
                System.out.print("\nMasukkan nama menu pesanan ke-"
                        + (i + 1) + ": ");

                String pilihan = input.nextLine();

                int index = -1;

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(pilihan.trim())) {
                        index = j;
                        break;
                    }
                }

                if (index != -1) {
                    pesanan[i] = menu[index];
                    totalBiaya += harga[index];

                    System.out.println("Pesanan berhasil ditambahkan!");
                    valid = true;
                } else {
                    System.out.println("Menu tidak tersedia!");
                    System.out.println("Silakan masukkan nama menu yang benar.");
                }
            }
        }

        System.out.println("\n===== STRUK PEMESANAN =====");

        for (int i = 0; i < pesanan.length; i++) {

            for (int j = 0; j < menu.length; j++) {
                if (pesanan[i].equals(menu[j])) {
                    System.out.println((i + 1) + ". "
                            + pesanan[i] + " - Rp" + harga[j]);
                    break;
                }
            }
        }

        System.out.println("---------------------------");
        System.out.println("Total biaya: Rp" + totalBiaya);
        System.out.println("===========================");
        System.out.println("Terima kasih telah memesan!");

    }
}
