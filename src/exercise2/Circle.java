package exercise2;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        int radius = input.nextInt();
        double Circumference = 2*Math.PI*radius;
        double Area = Math.PI*radius*radius;
        System.out.println("Circumference: " + Circumference);
        System.out.println("Area: " + Area);
    }
}