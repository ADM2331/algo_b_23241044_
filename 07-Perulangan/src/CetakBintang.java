import java.util.Scanner;

public class CetakBintang {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Bintang (*) :");
        int Bintang = scan.nextInt();
        int a,b;

        for(a = 0; a < Bintang ; a+=1){
            for(b = 0; b < a ; b+=1){
                System.out.print("*");
            }
        System.out.println("*");
        }
    }
}
