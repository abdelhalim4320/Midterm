package problemandsolutions;

public class SearchElementOfArray {
    // By using the sequential search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.


    public static void main(String[] args) {

        int num = 100;
        int[] number = {100,150,90,40,80,120};
        System.out.println(sequentialSearch(number, num));

    }

    public static boolean sequentialSearch(int[] a, int b){
        for (int i : a) {
            if (i==b){
                return true;
            }
        }
        return false;
    }


}




