package mathproblems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};

        System.out.println("the minimum difference between array1 and array2 is "+
                findTheMinDiff(array1, array1.length));

    }

    static int findTheMinDiff(int[] array, int n)
    {
        // Initialize difference as infinite
        int difference = Integer.MAX_VALUE;

        // Find the minimum  difference by comparing difference
        // of all possible pairs in given array
        for (int i=0; i<n-1; i++)
            for (int j=i+1; j<n; j++)
                if (Math.abs((array[i] - array[j]) )< difference)
                    difference = Math.abs((array[i] - array[j]));

        return difference;
    }


}
