package mathproblems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArraysAndRemoveDuplicatesProgram {

    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}


    public static void main(String[] args) {

        int[] array1 = new int[] {1,3,4};

        int[] array2 = new int[] {4,5,6,7};

        int[] mergedArray = mergeArraysAndRemoveDuplicates(array1, array2);

        System.out.println("Array 1 : "+ Arrays.toString(array1));

        System.out.println("Array 2 : "+Arrays.toString(array2));

        System.out.println("Sorted Merged Array With No Duplicates : ");

        System.out.println(Arrays.toString(mergedArray));

    }

    private static int[] mergeArraysAndRemoveDuplicates(int[] arrayA, int[] arrayB) {
        return IntStream.concat(IntStream.of(arrayA), IntStream.of(arrayB))
                .distinct()
                .sorted()
                .toArray();
    }







}
