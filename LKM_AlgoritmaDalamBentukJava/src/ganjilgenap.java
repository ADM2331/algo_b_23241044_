import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan sebuah bilangan
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = scanner.nextInt();
        
        // Memanggil fungsi untuk mengecek apakah bilangan ganjil atau genap
        cekGanjilGenap(bilangan);
    }

    // Fungsi untuk mengecek apakah suatu bilangan ganjil atau genap
    public static void cekGanjilGenap(int bilangan) {
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + "adalah bilangan genap.");
        } else {
            System.out.println(bilangan + "adalah bilangan ganjil");
        }
    }
}
