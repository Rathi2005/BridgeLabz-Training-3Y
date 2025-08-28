package Assignment;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principle :");
        double p = sc.nextDouble();

        System.out.print("Rate :");
        double r = sc.nextDouble();

        System.out.print("Time :");
        double t = sc.nextDouble();

        Double res = (double) p*r*t/100;

        System.out.println("Simple Interest : " + String.format("%.2f", res));
    }
}
