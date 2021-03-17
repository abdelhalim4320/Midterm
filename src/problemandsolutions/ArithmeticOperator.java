package problemandsolutions;

import java.util.Scanner;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.


    public static void main(String[] args) {

        ArithmeticOperator.arithmetic(10,5);

    }

    public static void arithmetic (int number1, int number2) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the Number1:");
            int num1 = scanner.nextInt();
            System.out.print("Enter the Number2:");
            int num2 = scanner.nextInt();
            System.out.printf("%d + %d = %d", number1, number2, (number1 + number2)).println();
            System.out.printf("%d - %d = %d", number1, number2, (number1 - number2)).println();
            System.out.printf("%d * %d = %d", number1, number2, (number1 * number2)).println();
            System.out.printf("%d / %d = %d", number1, number2, (number1 / number2)).println();
        }catch (Exception e){
            System.out.println("ArithmeticException: / by zero");
        }
    }



}
