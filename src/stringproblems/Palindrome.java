package stringproblems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String string, reverse = " ";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        string = sc.nextLine();

        int length = string.length();

        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + string.charAt(i);

        if (string.equals(reverse))
            System.out.println(string+" is a palindrome");
        else
            System.out.println(string+" is not a palindrome");

    }

}
