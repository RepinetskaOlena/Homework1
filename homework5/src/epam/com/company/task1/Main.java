package epam.com.company.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int ar_dim = sc.nextInt();
        int [] arrayInt = createArrayInt(ar_dim);

        System.out.println("Array ->" + Arrays.toString(arrayInt));
        System.out.println("Reverse array ->" + Arrays.toString(reverseArrayInt(arrayInt)));
    }

    static int [] createArrayInt (int ar_dim) {
        if (ar_dim < 1) {
            return null;
        }
        int [] arrayInt = new int[ar_dim];
        for (int i = 0; i <arrayInt.length ; i++) {
            arrayInt[i] = (int) (Math.random() * ar_dim);
        }
        return arrayInt;
    }
    static int [] reverseArrayInt (int[] array) {
        if (array == null || array.length < 2) {
            return null;
        }
        int [] reverseArrayInt = new int [array.length];
        int [] newArr = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length ; i++) {
            reverseArrayInt [i] = newArr [array.length - i - 1];
        }
        return reverseArrayInt ;
    }
}