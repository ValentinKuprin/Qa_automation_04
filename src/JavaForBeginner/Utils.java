package JavaForBeginner;

import JavaForBeginner.homework.Hw5;
import JavaForBeginner.homework.Hw7;

import java.util.Arrays;

public class Utils {


    public static int taskNumbere = 1;

    public static void printTaskNumber() {
        System.out.println("******************** [ Задача № " + taskNumbere + " ]" + " ********************");
        taskNumbere++;
    } // Печать задачи

    public static void verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {       // сравнение двух int значений

            System.out.println("\u001B[32m" + "Test Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Test Fail" + "\u001B[0m");
        }
    } // TEST int

    public static void verifyEquals(String expectedResult, String actualResult) {

        if (expectedResult.equals(actualResult) == true) {       // сравнение двух строк
            System.out.println("\u001B[32m" + "Test Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Test Fail" + "\u001B[0m");
        }
    } //TEST String

    public static void verifyEquals(double expectedResult, double actualResult) {


        if (expectedResult == actualResult) {       // сравнение двух строк

            System.out.println("\u001B[32m" + "Test Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Test Fail" + "\u001B[0m");
        }
    } // TEST double

    public static double arrayAverage(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }

        return result / a.length;
    } //среднее значение массива


    /** Создать массив из 10 случайных положительных целых чисел */

    public static int[] randomArrayInt (int columb, int upper, int lower) {
        int[] array = new int[columb];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (upper - lower)) + lower;
        }
       // System.out.println(Arrays.toString(array));
        return array;
    } // Рандомный массив из 10 целых чисел (upper макс. значение (не включительно), lower min.)

    /** Создать массив четных чисел из элементов массива */

    public static int[] getArrayEvenNumbers(int[] array) {
        int countArrayEven = 0;
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    countArrayEven++;
                }
            }
            System.out.println(countArrayEven);
            int[] arriveEven = new int[countArrayEven];
            int countEven = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0 && arriveEven.length < array.length) {
                    arriveEven[countEven] = array[i];
                    countEven++;
                }
            }
            return arriveEven;
        } else {
            return null;
        }
    }

        /** Создать массив нечетных чисел из элементов массива */

        public static int[] getArrayOddNumbers(int[] array){
            int countArrayOdd = 0;
            if (array.length != 0) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] % 2 != 0) {
                        countArrayOdd++;
                    }
                }
                System.out.println(countArrayOdd);
                int[] arriveOdd = new int[countArrayOdd];
                int countOdd = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] % 2 != 0 && arriveOdd.length < array.length) {
                        arriveOdd[countOdd] = array[i];
                        countOdd++;
                    }
                }
                return arriveOdd;
            } else {
                return null;
            }
        }


    /** Проверка массива на положительное числа  */
   //public static boolean checkPositiveNumber(int[] array) {
  //      for (int i = 0; i < array.length; i++) {
  //          if (array[i] > 0) {
  //              return false;
  //          }
  //      }
  //      return true;
  //  } // Поиск положительного числа в массиве

    /** Проверка массива на отрицательные числа  */
    public static boolean checkNegativeNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                return false;
            }
        }
        return true;
    }//поиск отрицательного числа в массиве

    public static boolean checkLongArrayIsZero(int[] array) {
        if (array.length == 0 ) {
            return false;
        }
            return true;
    }


    /** метод, который принимает массив целых положительных чисел больше 0, и возвращает массив уникальных чисел. */
    public static int[] getUniqueArray(int[] array) {
        if (array.length == 0) {

            return array;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = -1;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                count++;
            }
        }
        int count1 = 0;
        int[] unicueArray = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                unicueArray[count1] = array[i];
                count1++;
            }
        }

        return unicueArray;
    }









}




