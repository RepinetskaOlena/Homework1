package epam.com.company.task4;

import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int ar_dim = sc.nextInt();
        int[] arrayInt = createArrayInt(ar_dim);


        System.out.println("Исходный массив ->" + Arrays.toString(arrayInt));
        System.out.println("Массив позитивных значений  ->" + Arrays.toString(positiveArray(arrayInt)));
       System.out.println("Массив негативных значений ->" + Arrays.toString(negativeArray(arrayInt)));


    }

    static int[] createArrayInt(int ar_dim) {
        if (ar_dim < 1) {
            return null;
        }
        int[] arrayInt = new int[ar_dim];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = ((int) (Math.random() * ar_dim * 2)) - (ar_dim / 2);
        }
        return arrayInt;
    }
    static int[] positiveArray (int[] array1) {
        if (array1 == null || array1.length < 2) {
            return null;
        }

        int count_pos = 0;
        for (int i: array1
        ) {
            if (i > 0) {
                count_pos++;
            }
        }
            int a = 0;
            int [] newArrayInt = new int[count_pos];
            for (int j = 0; j < array1.length; j++) {
              if (array1[j] > 0) {
                  newArrayInt[a] = array1[j];
                  a++;
              }
            }

         return newArrayInt;
    }
    static int[] negativeArray (int[] array2) {
        if (array2 == null || array2.length < 2) {
               return null;
            }

        int count_neg = 0;
        for (int i: array2
        ) {
            if (i < 0) {
                count_neg++;
            }
        }
        int a = 0;
        int [] newArrayInt = new int[count_neg];
        for (int j = 0; j < array2.length; j++) {
            if (array2[j] < 0) {
                newArrayInt[a] = array2[j];
                a++;
            }
        }

        return newArrayInt;
    }
 }
