package Assignment;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base:");
        double b = sc.nextDouble();

        System.out.print("Exponent :");
        double e = sc.nextDouble();

        double res = 1;
        for(int i=0; i<e; i++){
            res*=b;
        }

        System.out.println("Result: " + res);
    }
}
