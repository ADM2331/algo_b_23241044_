import java.util.Scanner;

public class Bersarang {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("       SELAMAT DATANG DI ADAM_MARET");

        // BERTANYA KEPEMILIKAN MEMBER CARD
        System.out.println("APAKAH PELANGGAN MEMILIKI MEMBER CARD? (YES/NO");
        String Pengguna_Member = scanner.next();

        // DISKON PENGGUNA MEMBER CARD
        
        if (Pengguna_Member.equalsIgnoreCase("yes")) {
            System.out.println("Total Belanja: ");
            double total_Belanja = scanner.nextDouble();
            if (total_Belanja > 500000) {
                System.out.println("SELAMAT ANDA MENDAPAT POTONGAN HARGA SEBESAR Rp50.000.");

                System.out.println("        TERIMAKASIH TELAH BERBELANJA DI ADAM_MARET");
                System.out.println("              SEMOGA HARI ANDA MENYENANGKAN");}

            else if(total_Belanja > 100000) {
                System.out.println("SELAMAT ANDA MENDAPAT POTONGAN HARGA SEBESAR Rp15.000.");

                System.out.println("        TERIMAKASIH TELAH BERBELANJA DI ADAM_MARET");
                System.out.println("              SEMOGA HARI ANDA MENYENANGKAN");}

            else {
                System.out.println("            MOHON MAAF, BELANJA ANDA KURANG");

                System.out.println("        TERIMAKASIH TELAH BERBELANJA DI ADAM_MARET");
                System.out.println("              SEMOGA HARI ANDA MENYENANGKAN");
            }
        }
        
        // BUKAN PENGGUNA MEMBER CARD
        else {
            System.out.println("Total Belanja");
            double total_Belanja = scanner.nextDouble();

            if(total_Belanja > 100000) {
                System.out.println(" SELAMAT ANDA MENDAPAT POTONGAN HARGA SEBESAR Rp10.000");
                
                System.out.println("       TERIMAKASIH TELAH BERBELANJA DI ADAM_MARET");
                System.out.println("             SEMOGA HARI ANDA MENYENANGKAN");}
            
            else {
             System.out.println("            MOHON MAAF, BELANJA ANDA KURANG");
            
            System.out.println("        TERIMAKASIH TELAH BERBELANJA DI ADAM_MARET");
            System.out.println("              SEMOGA HARI ANDA MENYENANGKAN");}

        }
    }
}
