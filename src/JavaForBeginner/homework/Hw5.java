package JavaForBeginner.homework;

import com.sun.source.tree.PackageTree;

import java.sql.SQLOutput;

public class Hw5 {

    public static int taskNumbere = 2;

    public static void printTaskNumber() { // TaskNumber
        System.out.println("******************** Задача № " + taskNumbere + " ********************");
        taskNumbere++;
    } // TaskNumber

    public static void verifyEquals(String expectedResult, String actualResult) {

        if (expectedResult.compareTo(actualResult) == 0) {       // сравнение двух строк
            System.out.println("\u001B[32m" + "Test Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Test Fail" + "\u001B[0m");
        }
    }

    public static void verifyEquals(int expectedResult, int actualResult) {


        if (expectedResult == actualResult) {       // сравнение двух строк

            System.out.println("\u001B[32m" + "Test Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Test Fail" + "\u001B[0m");
        }
    } // TEST

    public static void verifyEquals(double expectedResult, double actualResult) {


        if (expectedResult == actualResult) {       // сравнение двух строк

            System.out.println("\u001B[32m" + "Test Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Test Fail" + "\u001B[0m");
        }
    } // TEST

    public static String weekDay(int a) {   //2

        String day = "";
        if (a <= 7 && a >= 1) {
            if (a == 1) {
                day = "Monday"; //ретерн бы сэкономил время, лучше указывать его
            } else if (a == 2) {
                day = "Tuesday";
            } else if (a == 3) {
                day = "Wednesday";
            } else if (a == 4) {
                day = "Thursday";
            } else if (a == 5) {
                day = "Friday";
            } else if (a == 6) {
                day = " Saturday";
            } else if (a == 7) {
                day = "Sunday";
            } else {

            }
            day = "Введите диапазон от 1 до 7";
        }
        return day;

    } //2

    public static Integer sayMeLargestWithMathMethod(int a, int b, int c) {
        int max1 = (Math.max(Math.max(a, b), c));
        return max1;
    } //3 method 1

    public static int largestValue(int a, int b, int c) {
        int largest;

        if (a < b) {
            largest = b;
        } else {
            largest = a;
        }
        if (largest < c) {
            largest = c;
        }

        return largest;

    } //3 method 2

    public static int determineTheSmallestValue(int a, int b, int c) {
        int min = a; //(или минимальное значение при определенном условии, ___)
        if (min > b) {
            System.out.println(min = b);
        } else if (min > c) {
            System.out.println(min = c);
        } else {
            System.out.println(min);
        }
        return min;
    } //4 method 1

    public static int smallestValue(int a, int b, int c) {
        int smallest;

        if (a < b) {
            smallest = a;
        } else {
            smallest = b;
        }
        if (smallest > c) {
            smallest = c;
        }

        return smallest;
    } //4

    public static String temperatureCatAgerage(double a, double b, double c, double e, double d) {
        double catMaxT = 40.55;
        double catMinT = 35.15;
        //if (a >= catMinT && (a <= cataxT).........)
        double result = (a + b + c + e + d) / 5;
        String tAverage = String.format("%.1f", result);    // Найти вариант округления до десятых

        return tAverage;
    } //5 ДОДЕЛАТЬ !!!

    public static String price(double a) {
        if (a > 0) {
            String money = String.format("%.2f", a);
            int index = money.indexOf(",");
            String rub = money.substring(0, index);
            String penny = money.substring(index + 1);

            return rub + " руб " + penny + " коп";
        } else {

            return "Введите корректную сумму";
        }
        //  public static void returnStringFromDouble(double f1) { // доп метод
        //      int num1 = (int) f1;
        //      int num2 = (int) Math.round(100 * (f1 - num1));
//
        //      System.out.println(num1 + " руб " + num2 + " коп");
//
        //  }

        // price * 100 - ruble * 100

    } // 6

    public static String weight(double a) {

        String money = String.format("%.3f", a);
        int index = money.indexOf(",");
        String kg = money.substring(0, index);
        String gr = money.substring(index + 1);

        return kg + " кг " + gr + " гр";
        // return (int) Math.floor(a) + " кг " + (int) ((a - ((int) a)) * 1000) + " гр";

    } //7

    public static double priceAndCount(double price, double weight) {

        double sum = price * weight;
        if (price <= 0 && weight <= 0) {
            System.out.println("Введите корректное число");
        }

        return sum;
    } // 8 поправить, ghb не работает 10.00 коп.

    public static void check(String apples, String unit, double price, double weight) {
        String say = apples;
        String count = unit;
        String priceOneKg = "Цена за 1 ";
        String countGoods = "Количество товара 1";
        String sum = "Сумма к оплате ";
        String line = "_________________________________";
        //price(price);
        // weight(weight);
        priceAndCount(price, weight);
        System.out.println(say + "\n" + priceOneKg + count + "          " + price(price) + "\n" + countGoods + count
                + "  " + weight(weight) + "\n" + line + "\n" + sum + "      " + price(priceAndCount(price, weight)));

    } //9  Округление

    public static String salary(int hours, double bid, int days) {
        double sum = hours * bid * days;
        // Math.floor(sum);
        // String resultDec = String.format("%.0f", ((sum - Math.floor(sum)) * 100));
        // String resultInt = String.format("%.0f", Math.floor(sum));
        // String resultRub = resultInt + " руб ";
        // String resultPenny = resultDec + " коп";

        // return resultRub + resultPenny;
        if (bid > 0) {
            String money = String.format("%.2f", sum);
            int index = money.indexOf(",");
            String rub = money.substring(0, index);
            String penny = money.substring(index + 1);

            return rub + " руб " + penny + " коп";
        } else {

            return "Введите корректную сумму";
        }
    } //10

    public static void journalSalary(String fio, int hours, double bid, int days) {
        // double sum = hours * bid * days;
        // String name = fio;
        // Math.floor(sum);
        // String resultDec = String.format("%.0f", ((sum - Math.floor(sum)) * 100));
        // String resultInt = String.format("%.0f", Math.floor(sum));
        // String resultRub = resultInt + " руб ";
        // String resultPenny = resultDec + " коп";
        // String salary = resultRub + resultPenny;
        // String data = "Март 2022";
        // System.out.println(data);
        // System.out.println((name + "  " + salary));
        String name = fio;
        salary(hours, bid, days);

        String data = "Март 2022";
        System.out.println(data);
        System.out.println((name + "  " + salary(hours, bid, days)));


    }


    public static String trueAndFalse(int a) {

        if (a < 0) {
            return a + "x is negative";
        } else if (a > 0) {
            return a + "x is positive";
        } else {
            return a + "x is zero";
        }

    } // 12

    public static int luckyNumber(int a) {

        int result = (a % 10) + (a / 10 % 10) + (a / 100 % 10) + (a / 1000 % 10);
        if (result < 9) {
            System.out.println("Счастливое число = " + result);
        } else {
            result = (result % 10) + (result / 10 % 10);
            if (result < 9) {
                System.out.println("Счастливое число = " + result);
            } else {
                result = (result % 10) + (result / 10 % 10);
                if (result < 9) {
                    System.out.println("Счастливое число = " + result);
                }
            }
        }
        return result;
    } //13

    public static int median(int a, int b, int c) {

        if ((a <= b) && (b <= c))
            return b;  // a b c
        if ((a <= c) && (c <= b))
            return c;  // a c b
        if ((b <= a) && (a <= c))
            return a;  // b a c
        if ((b <= c) && (c <= a))
            return c;  // b c a
        if ((c <= a) && (a <= b))
            return a;  // c a b

        return b; //c b a
    } //mediana

    public static void difBetweenAverAndMedian(int a, int b, int c) {
        String say;
        double average = (a + b + c) / 3;
        int median = median(a, b, c);
        double result = Math.abs(average - median);

        if (result > 2) {
            say = "Среднее значение " + average + " отличается от медианы " + median + " на " + result;
            System.out.println(say);
        } else {
            say = "Среднее значение = " + average + ", медиана = " + median;
            //System.out.println(say);
        }
        System.out.println(say);
    } // 14a

    public static void difBetweenAverAndMedianMath(double a, double b, double c) {
        String say;
        double min;
        double max;
        if (Math.min(a, b) < Math.min(b, c)) {
            min = Math.min(a, b);
        } else {
            min = Math.min(b, c);
        }

        if (Math.max(a, b) > Math.max(b, c)) {
            max = Math.max(a, b);
        } else {
            max = Math.max(b, c);
        }
        double sumABC = (a + b + c);
        double average = sumABC / 3;

        Double mediana = sumABC - (max + min);


        double  result = Math.abs(average - mediana);

        if (result > 2) {
            say = "Среднее значение " + average + " отличается от медианы " + mediana + " на " + result;
        } else {
            say = "Среднее значение = " + average + ", медиана = " + mediana;
        }
        System.out.println(say);
    } //14 b

    public static String payment(double a) {
        long rubInt = Math.round(a);
        long rubles = 0;
        String say;

        if (rubInt <= 0 ) {

            return say = "Введите корректное число";
        } else if (rubInt <= a) {
            rubles = rubInt;
        } else {
            rubles = rubInt - 1;
        }

        return String.valueOf(rubles) + " руб 00 коп";
    } //15

    public static double calculate(int a, int b, int c) {

        double result = Math.ceil((Math.sqrt(Math.multiplyExact((Math.multiplyExact(a, b) + c),
                +(int) Math.pow(a, b)))) / Math.PI);

        return result;
    } //16

    public static void randomNumberInPow(int a) {
        int random1 = ((int) (Math.random() * 100) + 1);
        Long result = Math.round((Math.pow(random1, a)));

        System.out.println("Число " + random1 + " в степени " + a + " = " + result);

} //18 без проверки

    public static int randomNumber() {
        int result  = ((int)(Math.random() *100)+1);
        return result;
    } //19 Без проверки


    public static void main(String[] args) {

        /** 2
         * Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.
         */
        printTaskNumber();
        System.out.println(weekDay(1));
        verifyEquals("Введите диапазон от 1 до 7", weekDay(1));

        /** 3 НАПИСАТЬ ТЕСТ
         *
         */
        printTaskNumber();
        int largeValue = (largestValue(199, 66, -55));
        System.out.println(largestValue(166, 55, -31));
        verifyEquals(199, largeValue);


        /** 4 НАПИСАТЬ ТЕСТ
         *  используя вложенный оператор if, напишите фрагмент кода, который печатает
         *  наименьшее значение, содержащееся в переменных a, b, c
         */
        printTaskNumber();
        System.out.println(smallestValue(-6, 6, 155));
        int smallValue = smallestValue(-6, 6, 155);
        verifyEquals(-6, smallValue);


        /** 5
         *  Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.
         */
        printTaskNumber();
        System.out.println(temperatureCatAgerage(5, 5, 5, 5, 5));
        String tAvg = temperatureCatAgerage(5, 5, 5, 5, 5);
        verifyEquals("5,0", tAvg);

        /** 6
         *  Написать метод, который принимает на вход десятичное число (например, 10.75),
         *  и возвращает строку “10 руб 75 коп”.
         */
        printTaskNumber();
        System.out.println(price(10.05));
        verifyEquals("10 руб 75 коп", price(10.75));


        /** 7
         * Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.
         */
        printTaskNumber();
        System.out.println(weight(10.75));
        verifyEquals("10 кг 750 гр", weight(10.75));

        /** 8
         * Написать метод, который принимает на вход 2 параметра -  цену и количество товара (может быть вес товара,
         * или количество в штуках). Алгоритм возвращает сумму покупки в виде десятичного числа.
         */
        printTaskNumber();
        priceAndCount(10.75, 7);
        System.out.println(priceAndCount(0.00, 0));
        verifyEquals(0.00, priceAndCount(-10.00, 0));


        /** 9
         * Написать метод, который принимает на вход необходимые параметры, и печатает чек.
         */
        printTaskNumber();
        check("Яблоки", "шт", 50.75, 3.400);

        /** 10
         * Написать метод, который принимает на вход количество часов работы в день и стоимость одного часа работы,
         * и возвращает заработную плату в месяц
         */
        printTaskNumber();
        System.out.println(salary(0, 0.00, 0));
        verifyEquals("0 руб 00 коп", salary(0, 0.00, 0));

        /** 11
         * Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости выдачи зарплаты
         * сотрудникам.
         */
        printTaskNumber();
        journalSalary("Смирнова Мария Ивановна", 8, 750, 23);
        journalSalary("Серебряков Иван Петрович ", 8, 1750, 23);


        /** 12
         * Записать в виде метода:
         */
        printTaskNumber();
        System.out.println(trueAndFalse(2));
        // verifyEquals();


        /** 13
         * Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
         * Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9,
         * снова считается сумма всех чисел.
         */
        printTaskNumber();
        System.out.println(luckyNumber(1999));
        verifyEquals(1, luckyNumber(1999));


        /** 14
         * а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
         * Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
         * Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
         *
         * b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать
         */

        printTaskNumber();
        difBetweenAverAndMedian(289, 4, 555);
        //  verifyEquals();
        difBetweenAverAndMedianMath(2, 9, 9);
        // verifyEquals();

        /** 15
         * Написать метод, который использует методы класса Math, принимает на вход
         * сумму к оплате (например, 10.75) и округляет сумму в пользу покупателя.
         * Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.
         */
        printTaskNumber();
        System.out.println(payment(-10.00));
        verifyEquals("Введите корректное число", payment(-5.00));

        /**
         * 16
         * Посчитать с помощью методов класса Math. Вернуть значение с округлением в бОльшую сторону.
         */
        printTaskNumber();
        System.out.println(calculate(3, 4, 20));

        /**17
         *
         */

        /** 18
         * Написать метод, который с помощью методов класса Math высчитывает любую степень сгенерированного
         * случайного числа. Метод возвращает математически округленное целое значение и выводит на экран:
         */
        printTaskNumber();
        randomNumberInPow(2);

        /** 19
         * Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.
         */
        printTaskNumber();
        System.out.println(randomNumber());

        /** 20
         *
         */





    }

}
