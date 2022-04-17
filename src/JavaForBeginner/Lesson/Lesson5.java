package JavaForBeginner.Lesson;

public class Lesson5 {

    public static int countMinOfThree(int a, int b, int c) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (min < c) {

            return min;
        } else {
            min = c;

            return min;
        }
        // return min  -> верхние можно сократить и поменять условие, если min > c min = c;
    }

    public static double average(int a, int b, int c) {

        return ((double) a + b + c) / 3;

    }

    public static double returnAbc(double number) {
        if (number < 0) {
            number = -number;
        }
            return number;
        }

        public static double countDifferenceBetweenMinAndMaxAverage ( int a, int b, int c) {
            int min = countMinOfThree(a, b, c);
            double average = average(a, b, c);

            return returnAbc(min - average);
    }

    public static String displayMessage(int a, int b, int c) {
        String message;
        if (countDifferenceBetweenMinAndMaxAverage (a, b, c) > 3.51) {
            message = "Большой разброс чисел";
            System.out.println(message);
        } else {
            message = "Маленький разброс чисел";
            System.out.println(message);
        }
        return message;
    }

    public static void main(String[] args) {
        // Даны 3 числа.
// Необходимо найти максимально точную разницу
// между минимальным числом и средним значением.
// Если разница больше 3.51,
// показать пользователю сообщение "Большой разброс чисел",
// иначе показать сообщение "Маленький разброс чисел"

        int a = 5;
        int b = 2;
        int c = 10;

    //    System.out.println(countMinOfThree(a, b, c));
    //    System.out.println(average(a, b, c));
        displayMessage(a, b, c);





    }
}
