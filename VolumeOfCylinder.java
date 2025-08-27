import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius (in meters) :");
        double radius = sc.nextDouble();

        System.out.print("Enter Height (in meters) :");
        double height = sc.nextDouble();

        double area = Math.PI*radius*radius*height;
        System.out.println("Area of Cylinder : " + String.format("%.2f", area) + " meter-cube");
    }
}
