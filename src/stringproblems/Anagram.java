package stringproblems;


import java.util.Arrays;

public class Anagram {


        public static void main(String[] args) {
            //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
            //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

            String x = "ARMY";
            String y = "MARY";


            boolean anagram = checkIfStringsAreAnagram(x, y);


            if (anagram) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

    public static boolean checkIfStringsAreAnagram(String a, String b) {

        char[] firstArray = a.toUpperCase().toCharArray();
        char[] secondArray = b.toUpperCase().toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray, secondArray);

    }




}