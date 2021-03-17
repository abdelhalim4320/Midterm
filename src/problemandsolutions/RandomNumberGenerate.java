package problemandsolutions;

import java.util.Random;

public class RandomNumberGenerate {
    //Write Java program to generate a random number between 1 to 8.

    public static void main(String[] args) {


        Random random = new Random();

        for (int i = 0; i < 1; i++) {
            int randomNumber = random.nextInt(8) + 1;
            System.out.println("random Number : "+randomNumber);
        }

    }

}
