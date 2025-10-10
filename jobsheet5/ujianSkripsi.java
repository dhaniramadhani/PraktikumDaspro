package PraktikumDaspro.jobsheet5;
import java.util.Scanner;
public class ujianSkripsi {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String pesan= "",bk;
        int bp1,bp2;

        System.out.println("Apakah Mahasiswa sudah bebas Kompen: (Tidak/Ya) ");
        bk =sc.nextLine().trim();
        System.out.println("Masukan jumlah Log bimbingan pengajar 1:");
        bp1 = sc.nextInt();
        System.out.println("Mauskan jumlah Log bimbingan pengajar 2: ");
        bp2 = sc.nextInt();

        if (bk.equalsIgnoreCase("Ya")) {
            if (bp1 >= 8 && bp2 >= 4) {
                pesan = "Semua Syarat Terpenuhi, Mahasiswa boleh Mendaftar Ujian Skripsi.";
            } 
            else if (bp1 < 8 && bp2 < 4) {
                pesan = "Gagal, Log bimbingan P1 kurang dari 8 kali dan bimbingan P2 kurang dari 4 kali.";
            } 
            else if (bp1 < 8) {
                pesan = "Gagal, bimbingan P1 kurang dari 8 kali.";
            } 
            else if (bp2 < 4) {
                pesan = "Gagal, bimbingan P2 kurang dari 4 kali.";
            }
        } else {
            pesan = "Gagal, KAMU MASIH PUNYA BANYAK TANGGUNGAN!!!";
        }

        System.out.println(pesan);
    }
}
