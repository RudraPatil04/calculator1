import java.util.Scanner;

public class arth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        
        double square = Math.pow(number, 2);
        System.out.println("Square of " + number + " = " + square);

        
        double cube = Math.pow(number, 3);
        System.out.println("Cube of " + number + " = " + cube);

        
        System.out.print("Enter another number for modulus: ");
        double modulusNumber = scanner.nextDouble();
        double modulusResult = number % modulusNumber;
        System.out.println("Modulus of " + number + " and " + modulusNumber + " = " + modulusResult);

        
        System.out.print("Enter an exponent for power calculation: ");
        double exponent = scanner.nextDouble();
        double powerResult = Math.pow(number, exponent);
        System.out.println(number + " raised to the power of " + exponent + " = " + powerResult);

        scanner.close();
}
}



