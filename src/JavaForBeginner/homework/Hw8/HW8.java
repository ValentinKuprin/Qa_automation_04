package JavaForBeginner.homework.Hw8;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class HW8 {


    // 7 Написать метод, который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел

    public static int[] getArray(int a, int b, int c, int d, int e) {
        int[] array = {a, b, c, d, e};
        return array;
    } //7


    //8 Написать метод, который принимает на вход 5 чисел типа double,  и возвращает массив из этих же чисел

    public static double[] getArray(double a, double b, double c, double d, double e) {
        double[] array = {a, b, c, d, e};
        return array;
    } //8

    // 9 Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
    public static String[] getArray(String a, String b, String c, String d, String e) {
        String[] array = {a, b, c, d, e};
        return array;
    }//9

    //10 Написать метод, который принимает на вход массив целых чисел,
    // и возвращает массив тех же чисел, умноженных на 2.5

    public static double[] getArrayMultTwoAndHalf(int[] array) {
        double[] arrayMult = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayMult[i] = array[i] * 2.5;
        }
        return arrayMult;
    } //10

    //11 Написать метод, который принимает на вход массив целых положительных чисел,
    // и возвращает количество четных чисел в этом массиве

    public static int getCountEvenNumbers(int[] array) {
        int count = 0;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0) {
                    count++;
                }
            }
            return count;
        } else {
        }
        return 0;
    }


    //  if (array.length == 0) {
    //      return count;
    //  } else if (array.length > 0  && array[i] % 2 ==0 ) {
    //      count++;
    //  }
    //  return count;


    public static void main(String[] args) {


        Integer a = 5;
        Double b = 5.5;
        String s = "Hello";

        /** 7
         * Написать метод, который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел
         */

        System.out.println("Массив int = " + Arrays.toString(getArray(1, 2, 3, 7, 8)));

        /** 8
         * Написать метод, который принимает на вход 5 чисел типа double,  и возвращает массив из этих же чисел
         */

        System.out.println("Массив double = " + Arrays.toString(getArray(2.2, 3.8, 9.8, 6.5, 7.7)));

        /** 9
         * Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
         */

        System.out.println("Массив String = "
                + Arrays.toString(getArray("Cat", "Dog", "Bird", "Snake", "Pig")));

        /** 10
         * Написать метод, который принимает на вход массив целых чисел,
         * и возвращает массив тех же чисел, умноженных на 2.5
         */

        System.out.println("Массив int * 2.5 = "
                + Arrays.toString(getArrayMultTwoAndHalf(getArray(1, 2, 3, 7, 8))));

        /** 11
         * Написать метод, который принимает на вход массив целых положительных чисел,
         * и возвращает количество четных чисел в этом массиве
         */

        System.out.println("Количество четный чисел в массиве = "
                + (getCountEvenNumbers(getArray(1, 2, 3, 4, 5))));

        System.out.println("Количество четный чисел в массиве = "
                + (getCountEvenNumbers(getArray(0, 2, 3, 4, 5))));

        System.out.println("Количество четный чисел в массиве = "
                + (getCountEvenNumbers(getArray(-1, 2, 3, 4, 5))));


        /** 12
         *  Написать метод, который принимает на вход массив целых положительных чисел,  и возвращает массив нечетных чисел
         */

    }


}

