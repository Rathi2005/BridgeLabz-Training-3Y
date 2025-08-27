import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1st :");
        double b = sc.nextDouble();

        System.out.print("2nd :");
        double e = sc.nextDouble();

        System.out.print("3rd :");
        double f = sc.nextDouble();

        double res = b+e+f/3;

        System.out.println("Result: " + res);
    }
}
