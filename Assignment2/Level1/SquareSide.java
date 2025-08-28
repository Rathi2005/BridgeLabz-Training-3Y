package Assignment.Assignment2.Level1;

import java.util.Scanner;
//
//Write a program to find the side of the square whose parameter you read from user
//Hint => Perimeter of Square is 4 times side
//I/P => perimeter
//O/P => The length of the side is ___ whose perimeter is ____

public class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        int side = sc.nextInt();
        System.out.println("Area of Square = " + (side * side));
        sc.close();
    }
}

