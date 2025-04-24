import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        int originalNumber = number;

        // Get sum of digits
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }

        System.out.println("Sum of the digits is " + sum);

 
    }
}