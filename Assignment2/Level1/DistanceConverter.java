package Assignment.Assignment2.Level1;

import java.util.Scanner;
//Write a program the find the distance in yards and miles for the distance provided by user in feets
//Hint => 1 mile = 1760 yards and 1 yard is 3 feet
//I/P => distanceInFeet
//O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in yards: ");
        double yards = sc.nextDouble();

        double miles = yards / 1760.0; // 1760 yards = 1 mile

        System.out.println(yards + " yards = " + miles + " miles");

        sc.close();
    }
}

