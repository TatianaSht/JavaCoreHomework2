package task;

import java.util.Arrays;
import java.util.Random;

public class AdjacentElement {

    public static int[] numberAdjacentZeroElements(int[] array) {
        Random random = new Random();
        boolean pairZero = false;
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = random.nextInt(0, 10);
            if (array[i] == 0  && array[i + 1] == array[i]) {
                pairZero = true;
                break;
            }
        }
        System.out.print("(" + Arrays.toString(array) + ") -> " + pairZero + "\n");
        return array;

    }
}
