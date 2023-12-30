import java.util.Scanner;

public class AngkaGenap {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Angka :");
        int Angka = scan.nextInt();

        
        for(int a=2; a <=Angka; a+=2) {
        System.out.print(a +" ");

        }
        
    }
    
}
