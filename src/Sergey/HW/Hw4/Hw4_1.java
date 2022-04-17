package Sergey.HW.Hw4;

public class Hw4_1 {
    public static void main(String[] args) {
        String line = "=================================";

       /** Задача №1
        *необходимо вывести сумму всех значений массива.
        */
       int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
       int sum = 0;
       for (int i = 0; i < array.length; i++) {
           sum = sum + array[i];
       }
       System.out.println("Задача №1\nСумма массива = " + sum + "\n" + line);

       /** Задача №2
        * необходимо вывести максимальное значение массива.
        */
       int max = array[0];   // (Integer.MIN_VALUE)
       for (int i = 0; i < array.length; i++) {
           if (array[i] > max)
               max = array[i];
       }
       System.out.println("Задача №2\nМаксимальное значение = " + max + "\n" + line);

       /** Задача №3
        * необходимо вывести минимальное значение массива.
        */
       int min = array[0]; // (Integer.MAX_VALUE)
       for (int i = 0; i < array.length; i++) {
           if (array[i] < min)
               min = array[i];
       }
       System.out.println("Задача №3\nMinimal = " + min + "\n" + line);


       /** Задача №4
        * необходимо вывести среднее арифметическое всех значений массива.
        */
       int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
       double sum1 = 0;
       for (int i = 0; i < array1.length; i++) {
           sum1 = sum1 + array1[i];
       }
       double average = sum1 / array1.length;
       System.out.println("Задача №4\nCреднее арифметическое = " + average + "\n" + line);

        /** Задача №5
         * необходимо вывести сумму элементов массива.
         */
        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};   // - {2, 3} {2, 3, 4} - рваные массивы
        int sum2 = 0;
        for (int i = 0; i < array2.length; i++) {                    // длинна (колличество элементов (4?"{}"))
            for (int j = 0; j < array2[i].length; j++) {             // array2[i] - b[0],b[1],b[2],b[3],
                sum2 = sum2 + array2[i][j];
            }
        }
                System.out.println("Задача №5\nCумму элементов массива = " + sum2 + "\n" + line);          // - все значения массивов

        /** Задача №6
         * необходимо вывести максимальное значение массива.
         */
        int max1 = array2[0][0];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (array2[i][j] > max1)
                    max1 = array2[i][j];
            }
        }
                System.out.println("Задача №6\nМаксимальное значение массива = " + max1 + "\n" + line);

        /** Задача №7
         * необходимо вывести количество элементов в массиве. (Объеденить 6 и 7 задания через If else)
         */

        int min1 = array2[0][0];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (array2[i][j] < min1)
                    min1 = array2[i][j];
            }
        }
        System.out.println("Задача №6\nМаксимальное значение массива = " + min1 + "\n" + line);


        // что бы посчитать количество элементов в массиве
        int count = 0;
        for (int i = 0; i < array2.length; i++) {
            count = count + array2[i].length;
        }
        System.out.println("Количество объектов в массиеве = " + count);


    }

}
