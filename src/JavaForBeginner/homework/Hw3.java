package JavaForBeginner.homework;

import static java.lang.Double.sum;
import static java.lang.Float.sum;
import static java.lang.Integer.*;

public class Hw3 {
    private static Object toString;

    public static void main(String[] args) {
        /**  Task 2
         Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона.
         */
        String line = "____________________________";
        String line2 = "___________________________________________________________________________";

        byte a = 25;
        byte b = 36;
        System.out.println(line);
        System.out.println("Task 2\na = " + a + "\nb = " + b);


        /** Task 3
         Cоздать переменные s и t типа short, присвоить им негативное и позитивное значения с разницей 60000.
         */

        short s = Short.MAX_VALUE;
        short t = (short) (s - 60000);
        System.out.println(line);
        System.out.println("Task 3\n s =" + s + "\nt = " + t);

        /** Task 4
         Создать переменную i типа int и присвоить ей минимально возможное значение этого типа. Затем присвоить
         максимально возможное значение этого типа. Распечатать оба значения в виде таблицы: РАЗОБРАТЬСЯ С ИМПОРТОМ
         */
        int max = MAX_VALUE;
        int min = MIN_VALUE;

        System.out.println(line);
        System.out.println("Task 4\n");
        System.out.println(line);
        System.out.println("|int max     |" + MAX_VALUE + "   |");
        System.out.println(line);
        System.out.println("|int min     |" + MIN_VALUE + "  |");
        System.out.println(line);

        /** Task 5
         * Создать переменную phoneNumber и присвоить ей значение номера телефона с кодом страны и города
         *  (можно ненастоящий номер телефона, например, 18009998877)
         */

        long phoneNumber = 18009998877L;
        System.out.println(line);
        System.out.println("Task 5\n" + phoneNumber);


        /** Task 6
         Создать переменную f типа float и присвоить ей значение 100.101101. Создать переменную d типа double
         и присвоить ей значение 1000.101101.
         */

        float f = 100.101101f;
        double d = 1000.101101;
        System.out.println(line);
        System.out.println("Task 6");
        System.out.println(line);
        System.out.println("|float f = 100.101101    |" + f + "   |");
        System.out.println(line);
        System.out.println("|float d = 100.101101    |" + d + "   |");
        System.out.println(line);

        /** Task 7
         a) Создать переменную типа Double с именем dd  и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
         b) Создать переменную типа Float с именем ff  и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
         */

        Double dd = sum(10.09999, 20.099999);
        Float ff = sum(10.09999f, 20.099999f);
        System.out.println(line);
        System.out.println("Task 7");
        System.out.println("|Double dd =     |" + dd + "   |");
        System.out.println(line);
        System.out.println("|Float ff =     |" + ff + "   |");
        System.out.println(line);

        /** Task 8
         Создать переменную result и присвоить ей значение выражения 10 / 3 (с максимальной точностью)
         */

        double result = 10 / 3.0; //(3D)
        System.out.println(line);
        System.out.println("Task 8\n" + result);

        /** Task 9 -------------------------------------------
         Создать переменные sum, product, quotient и reminder, и  присвоить им значения вычислений переменных f и d
         //       НЕ СДЕЛАНО !!!!!!!!! РАЗОБРАТЬСЯ С ИМПОРТОМ
         */

        double sum = (f + d);
        double product = (f * d); // умножение
        double quotient = (f / d); // частное
        double reminder = (f % d); // остаток от деления
        System.out.println(line);
        System.out.println("Task 9\n");
        System.out.println("sum(f + d) " + sum);
        System.out.println("product(f * d) " + product);
        System.out.println("quotient(f / d) " + quotient);
        System.out.println("reminder(f % d) " + reminder);


        /** Task 10 -------------------------------
         * Распечатать слово HELLO точками ПРОПУЩЕНО !!!
         */
        String line10 = ".    . ..... .     .     .....";
        String line11 = ".    . .     .     .     .   .";
        String line12 = "...... ..... .     .     .   .";
        String line13 = ".    . .     .     .     .   .";
        String line14 = ".    . ..... ..... ..... .....";
        System.out.println(line);
        System.out.println("Task 10");
        System.out.println(line10 + "\n" + line11 + "\n" + line12 + "\n" + line13 + "\n" + line14 + "\n");


        /** Part 2 Task 11
         * Создать переменные подходящего ссылочного типа данных(выбирать минимально достаточный
         * диапазон значений):
         */
        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = -505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666D;
        Double t8 = -1000000.001D;
        Short t9 = 1010;
        System.out.println(line);
        System.out.println("Task 11");
        System.out.println("Byte t1 = " + t1 + "\nShort t2 = " + t2 + "\nByte t3 = " + t3 + "\nFloat t4 = " + t4
                + "\nInteger t5 = " + t5 + "\nLong t6 = " + t6
                + "\nDouble t7 = " + t7 + "\nDouble t8 = " + t8 + "\nShort t9 = " + t9);

        /** Task 12
         С помощью полей классов ссылочного типа распечатать таблицу:
         */

        byte b_size = Byte.SIZE;
        byte b_min = Byte.MIN_VALUE;
        byte b_max = Byte.MAX_VALUE;
        short s_size = Short.SIZE;
        short s_min = Short.MIN_VALUE;
        short s_max = Short.MAX_VALUE;
        int i_size = Integer.SIZE;
        int i_min = Integer.MIN_VALUE;
        int i_max = Integer.MAX_VALUE;
        long l_size = Long.SIZE;
        long l_min = Long.MIN_VALUE;
        long l_max = Long.MAX_VALUE;
        float f_size = Float.SIZE;
        float f_min = Float.MIN_VALUE;
        float f_max = Float.MAX_VALUE;
        double d_size = Double.SIZE;
        double d_min = Double.MIN_VALUE;
        double d_max = Double.MAX_VALUE;

        System.out.println(line);
        System.out.println("Task 12");
        System.out.println(line2);
        System.out.println("|  TYpe   | Size in bits |           min        |           max           |");
        System.out.println(line2);
        System.out.println("|  Byte   |      " + Byte.SIZE + "       |          " + Byte.MIN_VALUE
                + "        |           " + Byte.MAX_VALUE + "           |");
        System.out.println(line2);
        System.out.println("|  Short  |      " + Short.SIZE + "      |          " + Short.MIN_VALUE
                + "      |          " + Short.MAX_VALUE + "          |");
        System.out.println(line2);
        System.out.println("| Integer |      " + Integer.SIZE + "      |         " + Integer.MIN_VALUE
                + "  |       " + Integer.MAX_VALUE + "        |");
        System.out.println(line2);
        System.out.println("|  Long   |      " + Long.SIZE + "      | " + Long.MIN_VALUE + " |   "
                + Long.MAX_VALUE + "   |");
        System.out.println(line2);
        System.out.println("|  Float  |      " + Float.SIZE + "      |          " + Float.MIN_VALUE
                + "     |      " + Float.MAX_VALUE + "       |");
        System.out.println(line2);
        System.out.println("|  Double |      " + Double.SIZE + "      |          " + Double.MIN_VALUE
                + "    |  " + Double.MAX_VALUE + " |");
        System.out.println(line2);

        /** Task 13
         Создать 2 переменные референсного типа Integer - num1 и num2, присвоить им одинаковые значения, сравнить
         2 переменные друг с другом с помощью метода .equal. Вывести результат сравнения на печать в виде выражения:
         “Если num1 = num2, то результат сравнения методом .equal = …”
         Присвоить переменным разные значения, сравнить,  и вывести результат на печать:
         “Если num1 не равно num2, то результат сравнения методом .equal = …”
         */

        Integer num1 = 12;
        Integer num2 = 13;
        num1.equals(num2);
        if (num1 == num2) {
            System.out.println(line);
            System.out.println("Task 13\nЕсли num1 = num2 то " + num1.equals(num2));
        } else {
            System.out.println(line);
            System.out.println("Task 13\nЕсли num1 != num2 то " + num1.equals(num2));


            /** Task 14
             Создать 2 переменные примитивного типа int - number1 and number2. Инициализаровать их
             а) одинаковыми значениями
             b) number1 < number2
             c) number1 > number2
             сравнить их подходящим методом класса Integer (посмотрите, какой метод подойдет),
             и вывести результаты сравнения на печать в виде выражений:
             “Если number1 = number2, то результат сравнения методом … = …”
             “Если number1 < number2, то результат сравнения методом … = …”
             “Если number1 > number2, то результат сравнения методом … = …”
             */
            int number1 = 3;
            int number2 = 4;
            compare(number1, number2);
            if (number1 == number2) {
                System.out.println(line);
                System.out.println("Task 14\nЕсли number1 = number2, то " + compare(number1, number2));
            } else if (number1 < number2) {
                System.out.println(line);
                System.out.println("Task 14\nЕсли number1 < number2, то " + compare(number1, number2));
            } else {
                System.out.println(line);
                System.out.println("Task 14\nЕсли number1 > number2, то " + compare(number1, number2));
            }

            /** Task 15
             *Создать переменную типа Float, присвоить ей значение 234.9999 и распечатать значение в int
             */

            Float ab = 234.9999F;
            int abc = ab.intValue();
            System.out.println(line);
            System.out.println("Task 15\n" + abc);

            /** Task 16
             * С помощью метода sum() класса Double посчитать сумму двух переменных типа double
             */

            double a2 = 45.0;
            double b2 = 76.0;
            System.out.println(line);
            System.out.println("Task 16\n" + Double.sum(a2, b2));

            /** Task 17
             * С помощью метода sum() класса Integer посчитать сумму двух переменных типа Float.
             */

            Float f1 = 45.15F;
            Float f2 = 55.15F;
            f1.intValue();
            f2.intValue();
            System.out.println(line);
            System.out.println("Task 17\n" + Integer.sum(f1.intValue(), f2.intValue()));

            /**Task 18
             * Создать 2 переменные типа Short:
             * Распечатать фразу:
             * “12000 - 12300 = -300”
             * где значение -300 выведено с помощью метода класса Short, а не операцией вычисления
             * Присвоить переменной short1 значение 12500, вывести фразу:
             * “12500 - 12300 = 200”
             * где значение 200 выведено с помощью метода класса Short, а не операцией вычисления
             */

            Short short1 = 12000;
            Short short2 = 12300;
            System.out.println(line);
            System.out.println("Task 18");
            System.out.println((short1 + " - " + short2) + " = " + Short.compare(short1, short2));
            short1 = 12500;
            System.out.println((short1 + " - " + short2) + " = " + Short.compare(short1, short2));


            /** Task 19 -----------------
             *Создать переменные:
             * Распечатать результат doub1 - doub2
             * Используя методы ссылочного типа данных, посчитать и распечатать результат str1 - str2
             */

            String str1 = "123.56";
            String str2 = "123.55";
            Double doub1 = 123.56;
            Double doub2 = 123.55;

            System.out.println(line);
            System.out.println("Task 19");
            System.out.println(doub1 - doub2);
            System.out.println(Double.parseDouble(str1) - Double.parseDouble(str2));
            System.out.println(Double.valueOf(str1) - Double.valueOf(str2));

            /** Task 20
             * Создать переменную подходящего типа данных для хранения результатов измерения температуры
             * тела кота (значения температуры в Цельсиях). Присвоить этой переменной сначала максимальное значение,
             * затем минимальное значение. Посчитать и распечатать среднее значение, округленное
             * с помощью метода класса Math. Распечатать результат среднего значения температуры тела кота.
             */

            float tmax;
            float tmin;
            tmax = 40.55F;
            tmin = 35.15F;
            Float average = Float.sum(tmax, tmin) / 2;
            System.out.println(line);
            System.out.println("Task 20\nСредняя температура кота = " + Math.round(average));
            //////
            Double temCat = 41.00D;
            temCat = temCat + 35.2;
            temCat = temCat / 2;
            System.out.println("Средняя температура кота = " + Math.round(temCat));

            /** Task 21
             * Создать переменную n типа Number, присвоить ей максимально возможное значение.
             * Присвоить n значение 10,
             * затем присвоить n значение 10.999999999.
             */

            Number n = Double.MAX_VALUE;
            System.out.println(line);
            System.out.println("Task 21\nПеременная n может принимать значения \nn = " + Double.MAX_VALUE);
            n = 10;
            System.out.println("n = " + n);
            n = 10.999999999;
            System.out.println("n = " + n + "\nЭто возможно, потому что это Number");

            /** Task 22 ------------------------------
             * Создать переменную Integer numberInteger = 100.
             * Доказать, что numberInteger имеет тип Integer,
             * а numberInteger.toString() имеет тип String.
             */

            Integer numberInteger = 100;
            String numInt = numberInteger.toString();
            System.out.println("Task 22\nЗапись numberInteger + 1 будет иметь вид: " + (numberInteger + 1));
            System.out.println("Запись numberInteger + 1 будет иметь вид: " + numberInteger.toString() + 1);
            // или
            System.out.println(numberInteger.getClass());
            System.out.println(numInt.getClass());
            // numberInteger instanceof Integer (мы справшиваем этот клас такой то? и получаем ответ true or false)

            /** Task 23 --------------------
             * Вывести на экран следующие выражения, используя для печати только переменные:
             * “36.6 градусов по Цельсию  = … градусов по Фаренгейту”, где значение по Фаренгейту
             * должно быть вычислено по формуле
             * “50 kilogram = … lbs,  50 lb = … kg”, где значения должны быть вычислены по формулам
             */

            Float tC = 36.6F;
            String gradus = " градусов по ";
            String Celsia = "Цельсию";
            String Faringae = "Фаренгейту";
            String equals = " = ";
            String kil = " kilogram";
            String lbs = " lbs,";
            String lb1 = " lb";
            String kg1 = " kg";
            int fiftyKg = 50;
            int fiftyLb = 50;
            double Far = (tC * 1.8) + 32;
            Float oneKg = 2.20462F;
            Float oneLbs = 0.453592F;
            float resultLbsIn50kg = fiftyKg / oneLbs;
            float resultKgIn50lb = fiftyLb / oneKg;
            System.out.println(line);
            System.out.println("Task 23");
            System.out.println(tC + gradus + Celsia + equals + Far + gradus + Faringae);
            System.out.println(fiftyKg + kil + equals + resultLbsIn50kg + lbs + fiftyLb + lb1 + equals
                    + resultKgIn50lb + kg1);


        }
    }
}







