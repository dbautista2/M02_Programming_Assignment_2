// 11.1 

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the three sides of the triangle
        System.out.print("Enter side1 of the triangle: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side2 of the triangle: ");
        double side2 = input.nextDouble();
        System.out.print("Enter side3 of the triangle: ");
        double side3 = input.nextDouble();

        // Prompt the user to enter a color
        System.out.print("Enter the color of the triangle: ");
        String color = input.next();

        // Prompt the user to enter whether the triangle is filled
        System.out.print("Is the triangle filled (true/false)? ");
        boolean filled = input.nextBoolean();

        // Create a Triangle object with the input values
        Triangle triangle = new Triangle(side1, side2, side3, color, filled);

        // Display the area, perimeter, color, and whether the triangle is filled
        System.out.println("\nThe area of the triangle is " + triangle.getArea());
        System.out.println("The perimeter of the triangle is " + triangle.getPerimeter());
        System.out.println("The color of the triangle is " + triangle.getColor());
        System.out.println("Is the triangle filled? " + triangle.isFilled());
    }
}