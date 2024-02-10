import java.util.Scanner;

public class area{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // For Square
        System.out.println("Enter the side length of the square:");
        double sideLength = scanner.nextDouble();
        double squareArea = calculateSquareArea(sideLength);
        System.out.println("Area of the square: " + squareArea);
        
        // For Rectangle
        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();
        double rectangleArea = calculateRectangleArea(length, width);
        System.out.println("Area of the rectangle: " + rectangleArea);
        
        scanner.close();
    }

    // Method to calculate the area of a square
    public static double calculateSquareArea(double sideLength) {
        return sideLength * sideLength;
    }

    // Method to calculate the area of a rectangle
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
}
