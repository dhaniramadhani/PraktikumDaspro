import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        int sks;
        String user;
        Scanner s  = new Scanner(System.in);

         System.out.println("Masukan Nama Pengguna? (Dosen/Mahasiswa)");
        user = s.nextLine();

        if (user.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses Diberikan");
        } 
        else if (user.equalsIgnoreCase("Mahasiswa")) {
            System.out.println("Input Jumlah SKS? ");
            sks = s.nextInt();

            if (sks >= 12) {
                System.out.println("Akses Diberikan");
            } else {
                System.out.println("Akses Ditolak karena kurang dari 12 SKS");
            }
        } 
        else {
            System.out.println("Akses Ditolak (User tidak dikenali)");
        }
    }
}
        
    
    

