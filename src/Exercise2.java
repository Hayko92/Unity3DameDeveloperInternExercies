import java.util.Arrays;
import java.util.Collections;

public class Exercise2 {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 3, 5, 7, 4, 3, 10, 13, 12};
        System.out.println(smallestPrime(numbers));

    }

    static int smallestPrime(int[] numbers) {
        //sorting array
        Arrays.sort(numbers);
        //find the maximum
        int maxNumberOfArray = numbers[numbers.length - 1];
        for (int i = 2; i < maxNumberOfArray; i++) {

            int conterOfDividers = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) conterOfDividers++;

            }
            //checking if array caontains the current prime number
            if (conterOfDividers <= 2) {
                boolean contains = false;
                for (int x : numbers) {
                    if (x == i) contains = true;
                }
                if (!contains) return i;
            }


        }
        return 0;
    }


}

