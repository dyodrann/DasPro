package Project.Jobsheet_6;
import java.util.Scanner;

public class StudiKasus2_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkatJuara, statusPendanaan, kurang;

        System.out.print("Nama Mahasiswa: ");
        namaMahasiswa = scanner.nextLine();

        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = scanner.nextLine();

        

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
        System.out.print("Jumlah Dokumen(0-4): ");
        jumlahDokumen = scanner.nextInt();
            System.out.print("Peringkat Juara (1-3): ");
            peringkatJuara = scanner.nextInt();

              if (peringkatJuara >=1 && peringkatJuara<=3){
                if (jumlahDokumen == 4){
                    System.out.print("Status : Dokumen lengkap");
                    
                }
                else {
                   
                    kurang = 4-jumlahDokumen;
                    System.out.print("Status : Dokumen tidak lengkap kurang " + kurang + " dokumen");
                }
            } else {
                System.out.print("Dana pernghargaan tidak diberikan");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            
            System.out.print ("Status Pendanaan (1:LOLOS, 2:TIDAK LOLOS) : ");
            statusPendanaan = scanner.nextInt(); 
            
            
            if (statusPendanaan == 1) {
                System.out.print("Jumlah Dokumen: ");
            jumlahDokumen = scanner.nextInt();

                if (jumlahDokumen == 4){
                    System.out.print("Status : Dokumen lengkap");
                    
                }
                else {

                    kurang = 4-jumlahDokumen;
                    System.out.print("Status : Dokumen tidak lengkap kurang " + kurang + " dokumen");
                }
                
            } else {
                System.out.print("Status : Pendanaan tidak lolos");
            }         
        } else {
            System.out.print("Jenis kegiatan tidak diketahui");
        }

    }
}