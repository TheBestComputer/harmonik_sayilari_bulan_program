
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double a, b = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz : ");
        a = scanner.nextInt();
        
        for(double i = 1; i <= a; i++){
            b += (1 / i);
        }
        System.out.println("Harmonik serinin sonucu : " + b);
        
    }
}
