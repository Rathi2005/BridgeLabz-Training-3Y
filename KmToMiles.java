import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Distance(Kms) : ");
        double a = sc.nextDouble();

        double res = a * 0.621371;

        System.out.println("Distance (miles) : "+ String.format("%.2f",res));
    }
}
