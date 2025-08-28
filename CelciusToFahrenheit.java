package Assignment;
import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature (in Celsius): ");
        float num = sc.nextFloat();

        float res = (num*((float) 9/5))+32;
        System.out.println("in Fahrenheit : " + res);
    }
}
