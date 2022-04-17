package Sergey.HW;

public class Hw3 {

    public static void main(String[] args) {
        //  ДЗ 3.1
        int a = 9;
        int b = 7;
        if (a == b) {
            System.out.println("если переменные равны");
        } else if (a < b) {
            System.out.println("если переменная a меньше b");
        } else {
            System.out.println("если переменная b меньше a");
        }
        if ((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even - если сумма переменных четная");
        } else {
            System.out.println("some variable is odd - если сумма переменных нечетная");
        }
        int x = 25;
        if (x > 10) {
            System.out.println("больше 10 - если переменная больше 10");
        }
        if (x < 100) {
            System.out.println("меньше 100 - если переменная меньше 100");
        }
        if ((x / 2) > 20) {
            System.out.println("результат деления на 2 больше 20 - если это соответствует истине");
        }
        if ((x >= 5) && (x <= 40)) {
            System.out.println("значение переменной между 5 и 40 включительно - если это правда");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40 - если предыдущие условие ложное");
        }
        //  3.2  Задача №1
        //Необходимо вывести числа от 0 до 15.
        for (int i = 0; i <= 15; i = i + 1) {
            System.out.println(i);
        }
        int number = 5;
        int result = number;
        int ext = 1;
        for (; result <= 10000; result = number * result, ext = ext + 1) {
            System.out.println("Число " + number + " в степени " + ext + " = " + result);
        }
       /** Задача №3
        Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
                Реализовать 2 варианта:
        использовать конструкцию if для определения кратности(цикл с шагом 1, i = i + 1);
        без использования конструкции if (шаг цикла на ваше усмотрение).
        */
        for (int i = 40; i <= 60; ++i) {
            if (i % 4 == 0) {
                System.out.println("Число " + i + " кратное 4");
            } else {
                System.out.println("Число " + i + " НЕкратное 4");
            }
        }
        for (int i = 40; i <= 60; i = i + 4) {
            System.out.println(i);
        }
    }
}