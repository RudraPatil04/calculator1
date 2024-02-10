public class math {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = Math.max(a, b);
        System.out.println("Maximum of " + a + " and " + b + " is: " + max);
        int min = Math.min(a, b);
        System.out.println("Minimum of " + a + " and " + b + " is: " + min);
        double x = -10.5;
        double abs = Math.abs(x);
        System.out.println("Absolute value of " + x + " is: " + abs);
        double number = 5.7;
        long roundedNumber = Math.round(number);
        System.out.println("Rounded value of " + number + " is: " + roundedNumber);
        double y = 2.0;
        double log = Math.log(y);
        System.out.println("Natural logarithm of " + y + " is: " + log);
        double random = Math.random();
        System.out.println("Random number between 0.0 and 1.0: " + random);
    }
}



