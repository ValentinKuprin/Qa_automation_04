package JavaForBeginner.homework.Hw8;

import JavaForBeginner.homework.Hw5;
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
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 0 && array[i] % 2 == 0) {
                    count++;
                }
            }
            return count;
        } else {
            return 0000;
        }

    } // Не работает проверка на отрицательное число !

//12 Написать метод, который принимает на вход массив целых положительных чисел,  и возвращает массив нечетных чисел

    public static int[] getArrayOddNumbers(int[] array) {
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0) { // >= должно быть, но проверка все равно не проходит
                    array[i] *= -1;
                }
            }
            return array;
        } else {
            return null;
        }
    } // 12 Не проверяет на [i] = 0 !, [i] < 0,

//13 Написать метод, который принимает на вход масив целых чисел,
// и возвращает массив значений true или false, если числа больше 10




    public static void main(String[] args) {
        Hw5.taskNumbere = 1;
        Hw5.printTaskNumber();

        Integer a = 5;
        Double b = 5.5;
        String s = "Hello";

        /** 7
         * Написать метод, который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел
         */
        Hw5.printTaskNumber();

        System.out.println("Массив int = " + Arrays.toString(getArray(1, 2, 3, 7, 8)));

        /** 8
         * Написать метод, который принимает на вход 5 чисел типа double,  и возвращает массив из этих же чисел
         */
        Hw5.printTaskNumber();

        System.out.println("Массив double = " + Arrays.toString(getArray(2.2, 3.8, 9.8, 6.5, 7.7)));

        /** 9
         * Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
         */
        Hw5.printTaskNumber();

        System.out.println("Массив String = "
                + Arrays.toString(getArray("Cat", "Dog", "Bird", "Snake", "Pig")));

        /** 10
         * Написать метод, который принимает на вход массив целых чисел,
         * и возвращает массив тех же чисел, умноженных на 2.5
         */
        Hw5.printTaskNumber();

        System.out.println("Массив int * 2.5 = "
                + Arrays.toString(getArrayMultTwoAndHalf(getArray(1, 2, 3, 7, 8))));

        /** 11
         * Написать метод, который принимает на вход массив целых положительных чисел,
         * и возвращает количество четных чисел в этом массиве
         */
        Hw5.printTaskNumber();

        System.out.println("Количество четный чисел в массиве = "
                + (getCountEvenNumbers(getArray(1, 2, 3, 4, 5))));

        System.out.println("Количество четный чисел в массиве = "
                + (getCountEvenNumbers(getArray(0, 2, 3, 4, 5))));

        System.out.println("Количество четный чисел в массиве = "
                + (getCountEvenNumbers(getArray(-1, 2, 3, 4, 5))));


        /** 12
         *  Написать метод, который принимает на вход массив целых положительных чисел,  и возвращает массив нечетных чисел
         */
        Hw5.printTaskNumber();

        System.out.println("Преобразование массива четных чисел в нечетный = "
                + Arrays.toString(getArrayOddNumbers(getArray(1, 2 , 9 , 13, 15))));

        System.out.println("Преобразование массива четных чисел в нечетный = "
                + Arrays.toString(getArrayOddNumbers(getArray(0, 2 , 9 , 13, 15))));

        System.out.println("Преобразование массива четных чисел в нечетный = "
                + Arrays.toString(getArrayOddNumbers(getArray(-1, 2 , 9 , 13, 15))));


    }


}

