import java.util.Scanner;

public class ganjilGenap {
    public static void main(String[] args) {
 
        int angka;
        Scanner s = new Scanner(System.in);
        System.out.println("Masukan Angka:");
        angka =s.nextInt();
        if (angka %2 == 0) {
            System.out.println("Genap");
        }
        else{
            System.out.println("Ganjil");
        }
    }
}
