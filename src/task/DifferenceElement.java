package task;

import java.util.Arrays;
import java.util.Random;

public class DifferenceElement {

    public static int[] numberDifference(int[] array) {
        Random random = new Random();
        int min = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-10,10);
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        int result = max - min;
        System.out.print("(" + Arrays.toString(array) + ") -> " + result + "\n");
        return array;
    }
}
