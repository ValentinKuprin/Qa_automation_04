package JavaForBeginner.homework;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class Hw7 {

    public static int arrayAverage(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }

        return result / a.length;
    }

    public static int[] getMinMaxAvg(int[] array) {
        int[] result = new int[3];
        int min = array[0];
        int max = array[0];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
            sum += array[i];
        }
        int average = sum / array.length;

        result[0] = min;
        result[1] = max;
        result[2] = average;
        return result;
    } //21


    public static void main(String[] args) {
        Hw5.taskNumbere = 1;
        String line = "______________";

        /** 1
         * Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).
         */
        Hw5.printTaskNumber();
        String[] catsNames = new String[]{"Васька", "Черный", "Мурзик", "Машка", "Мишка", "Барс", "Рыжик2", "Лева"};
        System.out.print(Arrays.toString(catsNames));
        System.out.println("\n");


        /** 2
         * В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”,
         * а значение элемента с индексом 1 на “Черныш”.
         */
        Hw5.printTaskNumber();
        for (int i = 0; i < 8; i++) {
            if (i == 4) {
                catsNames[i] = "Рыжик";
            } else if (i == 1) {
                catsNames[i] = "Черныш";
            }
        }
        System.out.println(Arrays.toString(catsNames));

        /** 3
         * Создать массив catsColors и заполнить его значениями.
         */
        Hw5.printTaskNumber();
        String[] catsColors;
        catsColors = new String[8];
        catsColors[0] = "Серый";
        catsColors[1] = "Черный";
        catsColors[2] = "Серый";
        catsColors[3] = "Полосато_коричнвый";
        catsColors[4] = "Рыжий";
        catsColors[5] = "Серый";
        catsColors[6] = "Песочный";
        catsColors[7] = "Серый";
        System.out.println(Arrays.toString(catsColors));

        /** 4
         * Создать массив catsAges и заполнить его любыми значениями.
         */
        Hw5.printTaskNumber();
        int[] catsAges = {1, 2, 3, 4, 5, 6, 7, 0};
        System.out.println(Arrays.toString(catsAges));

        /** 5
         * Создать массив isCatRed и заполнить его соответствующими значениями
         */
        Hw5.printTaskNumber();
        boolean[] isCatRed = new boolean[8];
        isCatRed[0] = false;
        isCatRed[1] = false;
        isCatRed[2] = false;
        isCatRed[3] = false;
        isCatRed[4] = true;
        isCatRed[5] = false;
        isCatRed[6] = true;
        isCatRed[7] = false;
        System.out.println(Arrays.toString(isCatRed));


        /** 6
         * Распечатать для массивов catsNames и catsColors:
         * имя кота в коробке с номером 6
         * имена котов из коробок с четными индексами
         * имена котов из коробок, чьи индексы кратны 4
         * цвет котов из коробок с нечетными индексами
         * цвет котов из коробок, чьи индексы кратны 3
         */
        Hw5.printTaskNumber();
        for (int i = 0; i < 8; i++) {
            if (i == 6) {
                System.out.println(catsNames[i] + "[" + i + "]");
            }
        }
        System.out.println(line);
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                System.out.println(catsNames[i] + "[" + i + "]");
            }
        }
        System.out.println(line);
        for (int i = 0; i < 8; i++) {
            if (i % 4 == 0) {
                System.out.println(catsNames[i] + "[" + i + "]");
            }
        }
        System.out.println(line);
        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0) {
                System.out.println(catsColors[i] + "[" + i + "]");
            }
        }
        System.out.println(line);
        for (int i = 0; i < 8; i++) {
            if (i % 3 == 0) {
                System.out.println(catsColors[i] + "[" + i + "]");
            }
        }
        System.out.println(line);

        /** 7
         * Распечатать “Накорми кота!” для всех серых котов
         */
        Hw5.printTaskNumber();

        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Серый")) {
                System.out.println("Накорми кота!" + "[" + i + "]");
            }
        }

        /** 8
         * Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
         */
        Hw5.printTaskNumber();
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 0 && catsAges[i] > 50) {
                System.out.println("Error");
            } else if (catsAges[i] < 2) {
                System.out.println("Отнеси кота на прививку!" + "[" + i + "]");
            } else {
                System.out.println("Привика не требуется");
            }
        }

        /** 9
         * Для кота в последней коробке распечатать имя, цвет, возраст
         */
        Hw5.printTaskNumber();
        for (int i = 0; i < catsNames.length; i++) {
            if (catsNames.length == catsColors.length && catsNames.length == catsAges.length &&
                    catsNames.length != 0 || catsColors.length != 0 || catsAges.length != 0) //ВОПРОС, если поставить перед циклом !
                if (i == catsNames.length - 1) {
                    System.out.println("Имя: " + catsNames[i]
                            + " Цвет: " + catsColors[i] + "  Возраст: " + catsAges[i]);
                }
        }// или
        System.out.println(catsNames[catsNames.length - 1] + ", "
                + catsColors[catsColors.length - 1] + ", " + catsAges[catsAges.length - 1]);

        /** 10
         * Распечатать имена всех котов, чей возраст больше 2 лет
         */
        Hw5.printTaskNumber();
        if (catsNames.length == catsColors.length && catsNames.length == catsAges.length &&
                catsNames.length != 0 || catsColors.length != 0 || catsAges.length != 0)
            for (int i = 0; i < catsAges.length; i++) {
                if (catsAges[i] > 2) {
                    System.out.println(catsNames[i] + "[" + i + "]");
                }
            }

        /** 11
         * Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true
         */
        Hw5.printTaskNumber();
        if (catsNames.length == isCatRed.length && catsNames.length != 0)
            for (int i = 0; i < catsNames.length; i++) {
                if (catsNames[i].equals("Рыжик") && isCatRed[i] == true) {
                    System.out.println(catsNames[i]);
                }
            }

        /** 12
         * Распечатать средний возраст котов из массива catsAges
         */
        Hw5.printTaskNumber();
        double result = 0;
        for (int i = 0; i < catsAges.length; i++) {
            result = result + catsAges[i];
        }
        System.out.println("Средний возраст котов = " + result / catsAges.length + " года");

        /** 13
         * Распечатать возраст самого молодого кота
         */
        Hw5.printTaskNumber();
        int min = catsAges[0]; // Или максимально возможжное значение из бизнес логики(сколько живет кот)
        for (int i = 0; i < catsAges.length; i++) {
            if (min > catsAges[i]) {
                min = catsAges[i];
            }
        }
        System.out.println("Возраст самого младшего кота " + min);

        /** 14
         *  Распечатать возраст самого старого кота
         */
        Hw5.printTaskNumber();
        int max = catsAges[0];//MIN_VALUE;
        for (int i = 0; i < catsAges.length; i++) {
            if (max < catsAges[i]) {
                max = catsAges[i];
            }
        }
        System.out.println("Возраст самого младшего кота " + max);

        /** 15
         * Распечатать количество серых котов
         */
        Hw5.printTaskNumber();
        int greyCat = 0;
        for (int i = 0; i < catsAges.length; i++) {
            if (catsColors[i].equals("Серый")) {
                greyCat++;
            }
        }
        System.out.println("Количество серых котов = " + greyCat);

        /** 16
         *  Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет
         */
        Hw5.printTaskNumber();
        if (catsAges.length == catsNames.length && catsNames.length != 0)
            for (int i = 0; i < catsAges.length; i++) {
                if (i % 2 == 0 && catsAges[i] <= 3) {
                    System.out.println(catsNames[i] + "[" + i + "]");
                }
            }

        /** 17
         *  Создать массив четных положительных чисел, значения которых не больше 10. (заполняем значения с помощью цикла for)
         */
        Hw5.printTaskNumber();
        int count = 0;
        for (int i = 0; i < 11; i++) {
            if (i % 2 ==0) {
                count++;
            }

        }

        int[] evenNumbers1 = new int[count];
        for (int i = 0, j = 0; i < evenNumbers1.length; i++, j++) {
            evenNumbers1[i] = j++;
        }
        System.out.println(evenNumbers1[2]);
////////////////////////////////////////////////////
        int[] evenNumbers = new int[6]; // высчитать  длину массива
        int k = 0;
        int b = 0;
        while (k < 6) {
            evenNumbers[k] = b;
            b += 2;
            k++;
        }
        System.out.println(evenNumbers[0]);
////////////////////////////////////////////////////

        int count1 = 0;
        for (int j = 0; j < 11; j++) {
            if (j % 2 == 0) {
                count1++;
            }
        }
        int[] evenNumbers2 = new int[count1];
        int num = 0;
        for (int i = 0; i < evenNumbers2.length; i++) {
                evenNumbers2[i] = num;
            num+= 2;
        }
        System.out.println(Arrays.toString(evenNumbers2));


        /** 18
         * Написать метод, который принимает на вход массив int, и возвращает среднее значение.
         * Проверить работу метода тестом, если параметр - массив catsAges
         */
        Hw5.printTaskNumber();
        int[] array = new int[]{2, 5, 7, 8, 9};

        System.out.println(arrayAverage(array));

        /** 19
         * Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900
         */
        Hw5.printTaskNumber();
        int count2 = 0;
        for (int i = -1000; i < -900; i++) {
            if (i % 2 != 0) {
                count2++;
            }
        }
        int[] ArrayEvenNegativeNum = new int[count2];
        int a = 0;
        for (int j = -1000; j < ArrayEvenNegativeNum.length; j++) {
            if (j % 2 != 0 && a < ArrayEvenNegativeNum.length) {
                ArrayEvenNegativeNum[a] = j++;
                a++;
            }
        }
        System.out.println(Arrays.toString(ArrayEvenNegativeNum));



        /** 20 //
         * Создать массив из 10 случайных положительных целых чисел
         */
        Hw5.printTaskNumber();
        int[] arrayRandomEvenNumb = new int[10];
        for (int i = 0; i < 10; i++) {
            arrayRandomEvenNumb[i] = (int) ((Math.random() * 100) + 1);
            System.out.print(arrayRandomEvenNumb[i] + " ");
        }
        System.out.println("\n");


        /** 21
         * Создать метод, который принимает на вход массив int,  и возвращает минимальное значение, максимальное
         * значение и среднее значение всех чисел массива. Проверить работу метода на массиве из задания 20.
         */
        Hw5.printTaskNumber();
        int[] catsAges1 = arrayRandomEvenNumb;
        System.out.println(Arrays.toString(getMinMaxAvg(catsAges1)));


        /** 22
         * Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 20.
         */
        Hw5.printTaskNumber();

        int countArrayEven = 0;
        int countArrayOdd = 0;
        for (int i = 0; i < arrayRandomEvenNumb.length; i++) {
            if (arrayRandomEvenNumb[i] % 2 == 0) {
                countArrayEven++;
            } else {
                countArrayOdd++;
            }
        }
        System.out.println(countArrayEven);
        System.out.println(countArrayOdd);

        int[] arriveEven = new int[countArrayEven];
        int[] arriveOdd = new int[countArrayOdd];
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < arrayRandomEvenNumb.length; i++) {
            if (arrayRandomEvenNumb[i] % 2 == 0 && countEven < arriveEven.length) {
                arriveEven[countEven] = arrayRandomEvenNumb[i];
                countEven++;
            } else if (countOdd < arriveOdd.length){
                arriveOdd[countOdd] = arrayRandomEvenNumb[i];
                countOdd++;
            }
        }
        System.out.println(Arrays.toString(arriveEven));
        System.out.println(Arrays.toString(arriveOdd));


        /** 23
         *  Создать двумерный массив, который состоит из имен, возрастов, цветов котов:
         */
        Hw5.printTaskNumber();
        String[][] twoDimArray = new String[3][8];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < catsNames.length; j++) {
                if (i == 0) {
                    twoDimArray[i][j] = catsNames[j];
                } else if (i == 1) {
                    twoDimArray[i][j] = String.valueOf(catsAges[j]);
                } else if (i == 2) {
                    twoDimArray[i][j] = catsColors[j];
                }
            }
        }
        System.out.println(Arrays.deepToString(twoDimArray));

        /** 24
         *  Создать двумерный массив целых случайных чисел от 1 до 10 размерности 4*8.
         */
        Hw5.printTaskNumber();
        int[][] randomArray = new int[4][8];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < randomArray[0].length; j++) {
                randomArray[i][j] = (int) ((Math.random() * 10) + 1);
            }
        }
        System.out.println(Arrays.deepToString(randomArray));

        /** 25
         *  Вывести сумму всех четных чисел массива из задания 24.
         */
        Hw5.printTaskNumber();

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                if (randomArray[i][j] % 2 == 0) {
                    sum = sum + randomArray[i][j];
                }

            }
        }
        System.out.println("Сумма массива " + Arrays.deepToString(randomArray) + " = " + sum);


    }
}

