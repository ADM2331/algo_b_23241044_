import java.util.Scanner;

public class IFelse {
    public static void main(String[] args) {
    
        // Data Member
        int total_belanja = 0;

        // membuat scanner menerima input dari kyboard
        Scanner scan = new Scanner (System.in);

        // memanggil input dari kyboard
        System.out.print("Masukkan Total Belanja : ");
        total_belanja = scan.nextInt();

        // cek total belanja
        if (total_belanja >= 50000) {
            System.out.println( "Anda Mendapatkan Mouse : ");

        } else {
            System.out.println( "Belanja Anda Kurang Dari Rp.50000");
        }

        System.out.println("Terimakasih Telah Berbelanja Di Toko Adam");
        
        }
    }

