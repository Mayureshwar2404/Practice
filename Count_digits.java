import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // for handling negative numbers
        int count = 0;
        int temp = Math.abs(number); 

        // for counting 0
        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }
        }

        System.out.println("Number of digits is :" + count);

       
    }
}