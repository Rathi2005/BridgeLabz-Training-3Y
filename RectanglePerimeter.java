import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b= sc.nextDouble();

        double res = 2*(l+b);

        System.out.println("Perimeter : " + String.format("%.2f", res));
    }
}
