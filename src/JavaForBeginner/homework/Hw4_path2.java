package JavaForBeginner.homework;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Hw4_path2 {

    public static int taskNumbere = 10;

    public static void printTaskNumber() {
        System.out.println("******************** [ Задача № " + taskNumbere + " ]" + " ********************");
        taskNumbere++;
    }

    public static void division(double a, double b) {  //Задача 14
        double resultdivision = a / b;
        double resultMod = a % b;

        System.out.println("Результат деления k на l = " + resultdivision
                + ", а остаток от деления k на l = " + resultMod);
    }

    public static void intMax(int a) {
        int maxValue = MAX_VALUE;
        System.out.println(maxValue);
    }

    public static void intmin(int a) {
        int minValue = MIN_VALUE;
        System.out.println(minValue);
    }

    public static void intPow(int a) {
        int powValue = a * a;
        System.out.println(powValue);
    }

    // __________________________________________________________
   public static String decApples(int apples) {
       String apple = "";
       int applesNum = apples % 10; // Определяем на какое число заканчивается число

       if (apples % 10 == 0 || apples % 10 >= 5) {
           apple = "яблок";
       } else if (apples % 10 == 1) {
           apple = "яблоко";
       } else if (apples % 10 >= 2 && apples % 10 <= 4) {
           apple = "яблока";
       }
       if (apples % 100 >= 11 && apples % 100 <= 14) { // исключение 11-14
           apple = "яблок";
       } else {
           apple = "Error";
       }
       return apple;
    }

    public static void applesCount(int apples, int students) {  // Задача 15
        int result = 0;
        double mod = 0;
        String writeAplles = "";
        String str = decApples(apples);

        if (apples % students == 0) {
            result = apples / students;
        } else if (apples % students != 0) {
            result = apples / students;
            mod = apples % students;
        }

        System.out.println("Если " + apples + " " + str + " поделить " + students
                + " учеников, то каждый ученик получит по " + result + writeAplles + " и "
                + mod + writeAplles + " останется учителю.");
    }






    //_____________________________________________________
    public static void calculateDagree(double celsia) { // Задача 17
        double c;
        double Far = (celsia * 1.8) + 32;
        System.out.println("Температуры в Цельсиях = " + celsia + " , температура в Фаренгейтах = " + Far);
    }

    //_________________________________________________________________________________

    public static void main(String[] args) {
        String line = "==============================================================================";

        /** 10
         * Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
         * Выведите результат работы алгоритма на печать.
         * Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
         */

        int number = 0;
        int expectedResult = 0;

        if (number % 2 == 0) {
            number = number * 2;
        } else if (number % 2 != 0) {
            number = (int) Math.pow(number, 2);
        }
        printTaskNumber();
        System.out.println(number);

        // Test
        if (expectedResult == number) {


            System.out.println("\u001B[32m" + "Pass" + " Фактический результат = " + number
                    + " Ожидаемый результат = " + expectedResult + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + " Фактический результат = " + number
                    + " Ожидаемый результат = " + expectedResult + "\u001B[0m");
        }

        /** 11
         * Напишите алгоритм проверки возраста на соответствие условиям (if-else):
         * - Голосовать можно с 18 лет
         * - Машину можно водить с 16 лет
         * - В школу можно идти с 5 лет
         * - Выведите результат работы алгоритма на печать.
         */
        printTaskNumber();

        int age = 18;
        String expectedResult11;
        String years18 = " Голосовать можно ";
        String years16 = " Машину можно водить ";
        String years5 = " В школу можно идти ";
        String str = null;

        if (age >= 18) {
            str = years18 + years16 + years5;
            System.out.println(str);
        } else if (age >= 16 && age < 18) {
            str = years16 + years5;
            System.out.println(str);
        } else if (age >= 5 && age < 16) {
            str = years5;
            System.out.println(str);
        } else {
            System.out.println("Условиями не оговорено");
        }

//Test
        expectedResult11 = years18 + years16;
        if (expectedResult11.equals(str)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }

        /** 12
         *Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
         * 5 - выдать похвальную грамоту и перевести в следующий класс
         * 4 - перевести в следующий класс
         * 3 - дать задание на лето и перевести в следующий класс
         * 2 - вызвать родителей и оставить в текущем классе на второй год
         * Выведите результат работы алгоритма на печать.
         */

        int grade = 4;
        String result = " ";
        String expectedResult12 = "перевести в следующий класс";

        if (grade == 5) {
            result = "выдать похвальную грамоту и перевести в следующий класс";
        } else if (grade == 4) {
            result = "перевести в следующий класс";
        } else if (grade == 3) {
            result = "дать задание на лето и перевести в следующий класс";
        } else if (grade == 2) {
            result = "вызвать родителей и оставить в текущем классе на второй год";
        } else {
            result = "Не оговорено условиями";
        }
        printTaskNumber();
        System.out.println(result);


        // Test
        if (expectedResult12.equals(result) == true) {

            System.out.println("pass");
        } else {
            System.out.println("fail");
        }


        /** 13
         * Напишите алгоритм программы, которая проверяет 2 числа. Программа складывает числа, которые делятся на 3
         * без остатка, и вычитает числа, которые делятся на 5 без остатка. Программа умножает числа, которые делятся
         * на 2 без остатка, но если хотя бы одно число отрицательное, программа умножает результат предыдущего
         * действия на (-1).
         * Если числа не прошли ни одну проверку, программа выводит на печать ошибку о невозможности произвести действия
         */

        printTaskNumber();
        int num1 = -17;
        int num2 = 30 ;
        int sum;
        int sub;
        int mult;
        String a = "Оба числа делятся на";
        String b = "без остатка, ";


        if (num1 % 3 == 0 && num2 % 3 == 0) {
            sum = num1 + num2;
            System.out.println(a + " 3 " + b + num1 + " + " + num2 + " = " + sum);
        }
        if (num1 % 5 == 0 && num2 % 5 == 0) {
            sub = num1 - num2;
            System.out.println(a + " 5 " + b + num1 + " - " + num2 + " = " + sub);
        }
        if (num1 % 2 == 0 && num2 % 2 == 0) {
            mult = num1 * num2;
            System.out.println(a + " 2 " + b + num1 + " * " + num2 + " = " + mult);
            if (num1 < 0 || num2 < 0) {
                mult = mult * (-1);
                System.out.println("Так как " + a + " 2 " + b
                        + " но одно или два числа отрицательные, предыдущий результат умножить на -1, " + mult);
            }
        } else {
            System.out.println("Ошибка. Невозможно произвести действие");
        }

   //   if (expectedResult == sub) {
   //       System.out.println("Pass");
   //   } else {
   //       System.out.println("Fail");
   //   }

        /** 14
         * Распечатать следующие выражения, используя метод и параметры:
         * Результат деления k на l = …, а остаток от деления  = …
         * Результат деления k на m = …, а остаток от деления  = …
         * Результат деления l на m = …, а остаток от деления  = …
         * Результат деления m на k = …, а остаток от деления  = …
         * И так далее все возможные варианты.
         * Сравнить код из HW2 с кодом из HW4. Что для вас легче?
         */

        double k = 12;
        double l = 5;
        double m = 55;
        printTaskNumber();
        division(k, k);
        division(k, l);
        division(l, l);
        division(l, k);
        division(l, m);
        division(m, m);
        division(m, k);
        division(m, l);

        /** 15
         * Создать переменные apple и  student и присвоить им значения 40 и 6 соответственно. Распечатать выражение:
         * Если … яблок(а) поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
         * Распечатать это же выражение со значениями 100 и 21.
         */

        printTaskNumber();
        applesCount(0, 22);
        applesCount(1, 5);
        applesCount(4, 5);
        applesCount(5, 5);
        applesCount(20, 5);
        applesCount(21, 5);
        applesCount(11, 5);
        applesCount(101, 5);
        applesCount(111, 5);
        applesCount(-2, 5);








        /** 16
         * Выполнить задание 18 из HW2 с помощью метода и параметров:
         * Написать метод так, чтобы правильные склонения слов (н-р, яблок или яблока) печатались автоматически
         * в зависимости от значений параметров.
         * Распечатать выражение с параметрами:
         * apple = 42, 55, 1
         * student = 42, 5, 2
         */
        printTaskNumber();
        //            1 21 яблоко
        //            2-4 яблока
        //            5-20 яблок
        //             яблоко
        //            22-24 яблока
        //            25-30 яблок
        //            и так по кругу

        //            например, берем 501 яблоко
        //            501 % 100 = 1, значит яблокО

        //            или 311 яблок
        //            311 % 100 = 11, значит яблоК


        /** 17
         * Напишите метод, который примет на вход параметр температуры в Цельсиях, и распечатает результат
         * температуры в Цельсиях и в Фаренгейтах.
         */
        printTaskNumber();
        calculateDagree(15);

        /** 18
         * Создать метод, который примет на вход параметр i и распечатает таблицу:
         * поменять значение i и распечатать таблицу с новым значением i
         */
        int ber = 6;
        int per = 6;
        intPow(6);










        //     public static void valueMaxMin(int i) {
        //         int min = Integer.MIN_VALUE;
        //     }
        //     System.out.println();

        //     public static void valueMaxMax(int i) {
        //         int max = Integer.MAX_VALUE;
        //     }
        //     System.out.println();


    }
}

