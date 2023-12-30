import java.util.Scanner;

public class CetakAngka {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Angka :");
        int Angka = scan.nextInt();

        
        for(int a=1; a <= Angka; a+=1) {
        System.out.print(a +" ");

        }
        
    }
    
}
