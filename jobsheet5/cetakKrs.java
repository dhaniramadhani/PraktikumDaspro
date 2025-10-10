
import java.util.Scanner;
public class cetakKrs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("== Cetak KRS ==");
        System.out.println("Apakah UKT Lunas: (True/False)");
        boolean uktlunas = sc.nextBoolean();
        if (uktlunas) {
            System.out.println("Pembayaran UKT Terverifikasi");
            System.out.println("Silahkan Cetak KRS dan Minta TTD ke DPA");
        }
        
    }
    
}
