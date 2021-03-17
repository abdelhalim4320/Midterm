package mathproblems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */

        int num=6;
        MakePyramid.printTriangle(5);
    }

    public static void printTriangle(int num) {

        for (int i=0; i<num; i++) {

            for (int j=num-i; j>1; j--) {
                // printing spaces
                System.out.print(" ");
            }

            for (int j=0; j<=i; j++) {
                // printing stars
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
