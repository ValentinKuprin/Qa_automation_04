package JavaForBeginner.homework;

public class HW6 {

    public static void printStepsDec(double start, double end, double step) {
        double result = start;
        if (step > 0) {
            if (start < end) {
                for (double i = start; i < end; i = i + step) {
                    System.out.println(i);
                }
            } else {
                System.out.println("Десятичных чисел, соответствующих данному "
                        + " условию не найдено.");
            }
        } else if (step == 0) {
            System.out.println("Цикл будет выполняться бесконечно и печать "
                    + " значение start = " + start);
        } else {
            if (start > end) {
                for (double i = start; i < end; i = i + step) {
                    System.out.println((Math.ceil(i * 10)) / 10);
                }
            } else {
                System.out.println("Десятичных чисел, соответствующих данному "
                        + " условию не найдено.");
            }
        }

    } //10  Перепроверить сауты !

    public static void seq10(double start, double end, double step) {
        // increasing start < end, step > 0;
        // decreasing start > end, step < 0
        if (start < end && step > 0) {
            for (start = start; start < end; start += step) {
                System.out.println(start);
            }
        } else if (start > end && step < 0) {
            for (start = start; start > end; start += step) {
                System.out.println(start);
            }
        } else {
            System.out.println("Invalid data");
        }
    } // написать самому !

    public static void getLong(int l) {
        int a = l;
        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    } // 11

    public static void nPow(int a, int n) {
        int result = 1;
        for (int i = 1; i < n + 1; i++) {
            result = a * (i - i + result);
            System.out.println("Число " + a + " в степени " + i + " = " + result);
        }
    } // 12

    public static void printSquare(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(String.format("%2.0f", Math.pow(2, i)));
        }
    }

    public static void getParam(int n, int m, int l) {
        for (int i = n; i < l; i = m++)
            if (i % 2 != 0) {
                System.out.println(i);
            }
    } //16 разобраться с условиями !

    public static void task16(int n, int m, int l) {
        if (n % 2 == 0 && m % 2 == 0) {
            System.out.println("Все числа четные, выберите другое число, или измените шаг");
        }
        while (l > 0) {
            if (n % 2 != 0) {
                System.out.println(n + " ");
                l--;
            }
            n = n + m;
        }
    } // 16 разобраться

    public static void seq17(int n) {
        int l = n + 5;
        for (; n < l; n++) {
            System.out.println("[" + (n + 1) + "]" + " = " + (n + 2));
        }
    } // 17 разобраться

    public static void printSubsequenceNumber(int n, int l) {
        for (int i = n; i < l; i++) {
            n = i * 2;
            System.out.println("при i = " + i + ", n = " + n);
        }
    }  //18 ошибка ! перерешать ! ОСТАНОВИЛСЯ ТУТ !!

    //  public static void seq18 (int n, int l) {
    //      if(n<l){
    //          System.out.println("[" + (n) + "]" + " = " + n);
    //      for (int i = n; i < l; i++){
    //          if (i == n ) {

    //          }
    //              System.out.println("[" + (i) + "]" + " = " + (n + 2));

    //      } else {
    //          System.out.println("Invalid data");
    //      }

    public static void functionValue(double x) {
        double y;
        double y1;
        if (x > 1.5) {
            y = (2.5 * Math.pow(x, 3)) + (6 * Math.pow(x, 2)) - 30;
            y1 = (Math.fma(2.5, Math.pow(x, 3), (6 * (Math.pow(x, 2))))) - 30;
            System.out.println(y + ", " + y1);
        } else if (x >= 0 && x <= 1.5) {
            y = x + 1;
            System.out.println(y);
        } else {
            y = x;
            System.out.println(y);

        }
    } // 20;

    public static void main(String[] args) {
        Hw5.taskNumbere = 1;

        /** 1
         *  Распечатать последовательность чисел от 0 до 9 включительно.
         */
        Hw5.printTaskNumber();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        /**2
         * Распечатать последовательность чисел от 10 исключительно до 0 включительно.
         */
        Hw5.printTaskNumber();
        for (int i = 9; i > -1; i--)
            System.out.println(i);

        /** 3
         * Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
         */
        Hw5.printTaskNumber();
        System.out.println("Вариант 1");
        for (int i = 50; i < 56; i += 2) {
            System.out.println(i);
        }

        System.out.println("Вариант 2");
        for (int i = 50; i < 56; i += 1) {
            if (i % 2 == 0) {

                System.out.println(i);
            }
        }
        /** 4
         *  Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
         */
        Hw5.printTaskNumber();

        for (int i = 326; i > 300; i -= 1) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        /** 5 РАЗОБРАТЬСЯ
         *  Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
         */
        Hw5.printTaskNumber();
        for (double i = 12; i < 13.01; i += 0.1) {
            System.out.println((Math.ceil(i * 100)) / 100);
        }


        /** 6
         *  Распечатать последовательность четных чисел от 215 до 237 включительно
         */
        Hw5.printTaskNumber();
        for (int i = 215; i < 238; i += 1) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }

        /** 7
         * Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.
         */
        Hw5.printTaskNumber();
        for (int i = 8; i < 14; i += 1) {
            if (i % 7 == 0) {
                //    System.out.println(i);
            } else {
                System.out.println("Таких чисел нет");
            }
        }

        /** 8
         * Распечатать последовательность которая начинается с минимального значения типа данных short и заканчивается
         * максимальным значением short. Числа в последовательности должны быть кратны 15001.
         */
        Hw5.printTaskNumber();
        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
                System.out.println(i);
            }
        }

        /** 9
         * Распечатать последовательность чисел в промежутке от -10 до 34 включительно. Числа, кратные 11,
         * должны быть распечатаны синим цветом. Числа, кратные 12, должны быть распечатаны красным цветом.
         * А ноль необходимо распечатать словом ZERO.
         */
        Hw5.printTaskNumber();
        for (int i = -10; i < 35; i++)
            if (i == 0) {
                System.out.println("Zero");
            } else if (i % 11 == 0) {
                System.out.println("\u001B[34m" + i + "\u001B[0m");
            } else if (i % 12 == 0) {
                System.out.println("\u001B[31m" + i + "\u001B[0m");
            }

        /** 10
         * Написать метод, который принимает на вход параметры start,  end, step, и печатает последовательность
         * десятичных  чисел, начиная с числа start, с шагом step. Точка выхода из цикла - число end.
         */
        Hw5.printTaskNumber();
        printStepsDec(1, 2.1, 0.1);
        seq10(10.5, 20.75, 1.29);

        /** 11
         *  Написать метод, который принимает параметр l и печатает l последовательность четных чисел от нуля.
         *  Длина последовательности = l.
         */
        Hw5.printTaskNumber();

        getLong(10);

        /** 12
         * Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно
         */
        Hw5.printTaskNumber();
        nPow(2, 3);
        // printSquare(2, );

        /** 13 РЕШИТЬ САМОМУ НЕСКОЛЬКИМИ СПОСОБАМИ !
         * Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
         */
        Hw5.printTaskNumber();
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                String str = Integer.toString(j);
                if (i == 1) {
                    System.out.print(str);
                } else if (i == 2) {
                    System.out.print(str + str);
                } else if (i == 3) {
                    System.out.print(str + str + str);
                } else if (i == 4) {
                    System.out.print(str + str + str + str);
                }
            }
        }
        System.out.println("\n");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                String str = Integer.toString(j);
                System.out.print(j);
                System.out.print(str.repeat(i));
            }
        }
        System.out.println("\n");

        String result = "";
        String result2 = "";
        String result3 = "";
        String result4 = "";
        for (int i = 0; i < 10; i++) {
            result = result + i;
            result2 = result2 + i + i;
            result3 = result3 + i + i + i;
            result4 = result4 + i + i + i + i;
        }
        System.out.print(result + result2 + result3 + result4);

        System.out.println("\n");

        /** 14 РЕШИТЬ САМОМУ НЕСКОЛЬКИМИ СПОСОБАМИ, ОСОБЕННО ПОСЛЕДНИМ !
         * Распечатайте последовательность чисел:
         * 0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
         */
        Hw5.printTaskNumber();
        System.out.print(0);
        for (int i = 1; i < 6; i++) {
            System.out.print(", " + i);
            int a = -i;
            System.out.print(", " + a);

        }
        System.out.println("\n");

        for (int i = 0; i < 6; i++) {
            System.out.print(i + ", ");
            if (i != 0 && i < 5) {
                System.out.print(-i + ", ");
            } else if (i == 5) {
                System.out.println(-i);
            }
        }

        System.out.println("\n");

        for (int i = 0, j = 1; i > -6 || j <= 5; i--, j++) {
            if (j < 6) {
                System.out.print(i + ", " + j + ", ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println("\n");


        /** 15
         * Распечатать последовательность чисел:
         * 0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
         */

        Hw5.printTaskNumber();
        for (int i = 0; i < 26; i++) {
            if (i == 25) {
                System.out.println(i);
            } else if
            (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n");


        /** 16 ПЕРЕРЕШАТЬ С УСЛОВИЯМИ 0 -1 разобраться с while
         * Написать метод, который принимает параметры n, m, , и печатает последовательность нечетных чисел начиная
         * с числа n, с шагом m,длина последовательности l.
         */

        Hw5.printTaskNumber();
        getParam(0, 1, 10);

        /** 17
         * Сгенерируйте и распечатайте последовательность по формуле: n + 1 = n + 2
         */

        Hw5.printTaskNumber();
        seq17(5);


        //  int n = 5;
        //  for (int i = n + 1; i < (n + 15); i++) {
        //      n = i + 2;
//
        //      System.out.println(n);


        /** 18
         *Написать метод, который принимает параметры , n, и печатает последовательность чисел, начиная с числа n,
         *  по формуле для n + 1 члена последовательности:
         */
        Hw5.printTaskNumber();
        printSubsequenceNumber(1, 50);

        /** 19
         *  Сгенерируйте последовательность целых положительных  двузначных чисел, в которых разница между первой
         *  цифрой (десятки) и второй цифрой (единицы) не превышает 3.
         */
        Hw5.printTaskNumber();

        for (int i = 10; i < 100; i++) {
            if (Math.abs((i / 10) - (i % 10)) <= 3) {
                System.out.print(i + ", ");
            }

        }
        /** 20
         * Написать метод, который вычислит значение функции:
         */
        Hw5.printTaskNumber();
        functionValue(1.4);


    }
}
















