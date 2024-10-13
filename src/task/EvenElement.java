package task;

import java.util.Arrays;
import java.util.Random;

public class EvenElement {

    public static int[] countEvenElement(int[] array) {
        Random random = new Random();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            if (array[i] % 2 == 0) count++;
        }
        System.out.print("(" + Arrays.toString(array) + ") -> " + count + "\n");
        return array;
    }
}
