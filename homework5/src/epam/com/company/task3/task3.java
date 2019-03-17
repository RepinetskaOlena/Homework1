package epam.com.company.task3;

import java.util.Arrays;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите размерность массива");
    int ar_dim = sc.nextInt();
    int[] arrayIntOne = createArrayInt(ar_dim);
    int[] arrayIntTwo = createArrayInt(ar_dim);

    System.out.println("Первый массив ->" + Arrays.toString(arrayIntOne));
    System.out.println("Второй массив ->" + Arrays.toString(arrayIntTwo));
    System.out.println("Массив значений попарных сумм элементов 1 и 2 массивов ->" + Arrays.toString(
                                                                 sumArray(arrayIntOne,arrayIntTwo)));


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
    static  int[] sumArray (int[] array1, int[] array2) {
        if (array1 == null || array1.length < 2 || array2 == null || array2.length < 2) {
            return null;
        }
        int [] sumArray = new int [array1.length];

        for (int i = 0; i < array1.length ; i++) {
            sumArray [i] = array1[i] + array2[i];
        }
        return sumArray;
    }
}
