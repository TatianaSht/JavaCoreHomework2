import static task.AdjacentElement.numberAdjacentZeroElements;
import static task.DifferenceElement.numberDifference;
import static task.EvenElement.countEvenElement;

public class Main {
    public static void main(String[] args) {
        int lengthArray  = 5;
        System.out.println();
        System.out.println("\nКоличество чётных элементов массива:");
        countEvenElement(new int[lengthArray]);
        countEvenElement(new int[lengthArray]);
        countEvenElement(new int[lengthArray]);
        System.out.println("Разница между самым большим и самым маленьким элементами массива:");
        numberDifference(new int[lengthArray]);
        numberDifference(new int[lengthArray]);
        numberDifference(new int[lengthArray]);
        System.out.println("Возвращение истины, если в переданном массиве есть два соседних элемента, " +
                "с нулевым значением:");
        numberAdjacentZeroElements(new int[lengthArray]);
        numberAdjacentZeroElements(new int[lengthArray]);
        numberAdjacentZeroElements(new int[lengthArray]);
    }
}