import java.util.Scanner;

public class diameterbola {
    public static void main(String[]args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan panjang jari-jari bola
        System.out.print("masukkan panjang jari-jari bola (dalam satuan meter); ");
        double jariJari = scanner.nextDouble();

        // Memanggil fungsi untuk menghitung volume bola
        double volume = hitungVolumeBola(jariJari);

        // Menampilkan hasil
        System.out.println("volume bola adalah: " + volume + "meter kubik.");
    }

    // Fungsi untuk menghitung volume bola berdasarkan jari-jari
    public static double hitungVolumeBola(double jarijari) {
        return (4.0 / 3.0) * Math.PI * Math.pow(jarijari,3);
    }
}