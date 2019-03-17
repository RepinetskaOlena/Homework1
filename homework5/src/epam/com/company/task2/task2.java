package epam.com.company.task2;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int ar_dim = sc.nextInt();
        int[] arrayInt = createArrayInt(ar_dim);

        System.out.println("Array ->" + Arrays.toString(arrayInt));
        System.out.println("Колличество нечетных элементов в массиве равно " + countOdd(arrayInt));
        System.out.println("Сумма нечетных элементов в массиве равна " + sumOdd(arrayInt));

    }

    static int[] createArrayInt(int ar_dim) {
        if (ar_dim < 1) {
            return null;
        }
        int[] arrayInt = new int[ar_dim];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = (int) (Math.random() * ar_dim);
        }
        return arrayInt;
    }

    static Integer countOdd (int[] array) {
        if (array == null || array.length < 2) {
            return null;
        }
        int [] newArrayInt = Arrays.copyOf(array, array.length);
        int countOdd = 0;
        for (int i: newArrayInt
             ) {
            if ((i % 2) != 0) {
                countOdd++;
            }
        }
        return  countOdd;
    }

    static Integer sumOdd (int[] array) {
        if (array == null || array.length < 2) {
            return null;
        }
        int [] newArrayInt = Arrays.copyOf(array, array.length);
        int sumOdd = 0;
        for (int i: newArrayInt
        ) {
            if ((i % 2) != 0) {
                sumOdd += i;
            }
        }
        return sumOdd;
    }
}
