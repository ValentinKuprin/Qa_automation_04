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


/**
 * PS D:\Файлы Outlook\Qa_automation_04> git status
 * On branch Home25_04
 * Your branch is up to date with 'origin/Home25_04'.
 *
 * nothing to commit, working tree clean
 * PS D:\Файлы Outlook\Qa_automation_04> git pull
 * fatal: unable to access 'https://github.com/xbrookx/Qa_automation_04.git/': SSL certificate problem: unable to get local issuer certificate
 * PS D:\Файлы Outlook\Qa_automation_04> git status
 * On branch Home25_04
 * Your branch is up to date with 'origin/Home25_04'.
 *
 * Changes not staged for commit:
 *   (use "git add/rm <file>..." to update what will be committed)
 *   (use "git restore <file>..." to discard changes in working directory)
 *         modified:   out/production/Qa_automation_04/JavaForBeginner/Utils.class
 *         deleted:    out/production/Qa_automation_04/JavaForBeginner/homework/Hw7_21.class
 *         modified:   out/production/Qa_automation_04/JavaForBeginner/homework/Hw8/HW8.class
 *         modified:   out/production/Qa_automation_04/JavaForBeginner/homework/Hw8/Hw8_17.class
 *         modified:   src/JavaForBeginner/Utils.java
 *         modified:   src/JavaForBeginner/homework/Hw8/HW8.java
 *         modified:   src/JavaForBeginner/homework/Hw8/Hw8_17.java
 *
 * no changes added to commit (use "git add" and/or "git commit -a")
 * PS D:\Файлы Outlook\Qa_automation_04> git add.
 * git: 'add.' is not a git command. See 'git --help'.
 *
 * The most similar command is
 *         add
 * PS D:\Файлы Outlook\Qa_automation_04> git add .
 * PS D:\Файлы Outlook\Qa_automation_04> git commit -m "refactor"
 * [work 910cecb] refactor
 *  7 files changed, 110 insertions(+), 99 deletions(-)
 *  delete mode 100644 out/production/Qa_automation_04/JavaForBeginner/homework/Hw7_21.class
 *  rewrite out/production/Qa_automation_04/JavaForBeginner/homework/Hw8/HW8.class (84%)
 *  rewrite out/production/Qa_automation_04/JavaForBeginner/homework/Hw8/Hw8_17.class (100%)
 *  rewrite src/JavaForBeginner/homework/Hw8/Hw8_17.java (66%)
 * PS D:\Файлы Outlook\Qa_automation_04> git push
 * fatal: The current branch work has no upstream branch.
 * To push the current branch and set the remote as upstream, use
 *
 *     git push --set-upstream origin work
 *
 * PS D:\Файлы Outlook\Qa_automation_04> git push --set-upstream origin work
 * Username for 'https://github.com': xbrookx
 * Password for 'https://xbrookx@github.com':
 * Enumerating objects: 33, done.
 * Counting objects: 100% (33/33), done.
 * Delta compression using up to 4 threads
 * Compressing objects: 100% (16/16), done.
 * Writing objects: 100% (18/18), 7.66 KiB | 1.91 MiB/s, done.
 * Total 18 (delta 7), reused 0 (delta 0), pack-reused 0
 * error: RPC failed; curl 92 HTTP/2 stream 5 was not closed cleanly before end of the underlying stream
 * send-pack: unexpected disconnect while reading sideband packet
 * fatal: the remote end hung up unexpectedly
 * Everything up-to-date
 * PS D:\Файлы Outlook\Qa_automation_04>
 */






}




