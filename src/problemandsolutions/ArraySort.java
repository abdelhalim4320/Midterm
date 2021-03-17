package problemandsolutions;

public class ArraySort {
    // By using the bubble sort algorithm, write a Java program to sort an integer array of 10 elements in ascending.

    public static void main(String[] args) {

        int[] numbers = {12, 64, 2, 45, 90, 7, 23, 68, 54, 89};
        System.out.println("Before sort");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
       System.out.println();

        System.out.println("After sort");
        ArraySort.bubbleSort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");

        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }
}

