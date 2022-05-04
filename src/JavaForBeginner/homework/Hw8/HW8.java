package JavaForBeginner.homework.Hw8;

import JavaForBeginner.Utils;
import JavaForBeginner.homework.Hw5;

import java.util.Arrays;

import static JavaForBeginner.Utils.*;
import static JavaForBeginner.Utils.getUniqueArray;


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
        if (array.length > 0) {
            double[] arrayMult = new double[array.length];
            for (int i = 0; i < array.length; i++) {
                arrayMult[i] = array[i] * 2.5;
            }
            return arrayMult;
        }
        return new double[]{}; // или вернуть тот же array который пришел пустым () если тип соответствует
    } //10

    public static double[] createArrayByMultiple(int[] array, double a) {
        double[] arrayMult = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayMult[i] = array[i] * a;
        }
        return arrayMult;
    } // 10 способ 2 как сделать без проверки на пустой массив, (возвращаем пустой массив, а если бы захотели вернуть пустой эррэй, он не подошел бы по типу)


//11 Написать метод, который принимает на вход массив целых положительных чисел,
// и возвращает количество четных чисел в этом массиве

    public static int getCountEvenNumbers(int[] array) {
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    return Integer.MAX_VALUE;
                } else {
                    int count = 0;
                    if (array.length > 0) {
                        for (int j = 0; j < array.length; j++) {
                            if (array[j] >= 0 && array[j] % 2 == 0) {
                                count++;
                            }
                        }
                        return count;
                    }
                }
            }
        }
        return 0; //при каких условиях вернется 0 ?
    } // 11

    public static int getCountNumbers(int[] array) {
        if (checkNegativeNumber(array) && array.length != 0) {
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0)
                    count++;
            }
            return count;

        }
        return 11111111;
    }

//12 Написать метод, который принимает на вход массив целых положительных чисел,  и возвращает массив нечетных чисел

    public static int[] getArrayOddNumbers(int[] array) {
        //if(array.lenght >0){}
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                return null;
            } else {
                array[i] *= -1;
            }
        }

        return array;
    } //разобраться со скобками !


//13 Написать метод, который принимает на вход массив целых чисел,
// и возвращает массив значений true или false, если числа больше 10

    public static boolean[] getBool(int[] array) {
        boolean[] arrayBool = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                return null;
            }
            if (array[i] >= 0 && array[i] < 11) {// внедрить проверку на длину массива, arrayBool = array
                arrayBool[i] = true;
            } else {
                arrayBool[i] = false;
            }
        }
        return arrayBool;
    }

//14 Написать метод, который принимает на вход массив слов,  и возвращает строку, состоящую из этих слов

    public static String getStringFromArray(String[] array) {
        String string = "";
        for (int i = 0; i < array.length; i++) {
            string += array[i] + ' ';
            // System.out.println(string);
        }
        return string;
    }

// 15 Написать метод, который принимает массив целых чисел и считает сумму чисел во второй половине массива

    public static int sumOfSecondHalfArray(int[] array) {
        int halfNumber = 0;
        int sum = 0;
        if (array.length != 0) {
            //  for (int i = 0; i < array.length; i++) {
            halfNumber = array.length / 2;
            System.out.println("Начало второй половины массива " + halfNumber);
            //  }
        }
        for (int i = halfNumber; i < array.length; i++) {
            sum += array[i];
            //    System.out.println(sum);
        }
        return sum;
    } // 15

//16 Написать метод, который принимает на вход целое положительные число в пределах от 1 до 10 исключительно, и
// возвращает таблицу умножения на это число в виде массива
//Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}

    public static int[] getMultiplicationTable(int number, int lenghtArray) {
        int[] multiplicationTable = new int[lenghtArray];
        int factor = 1;
        if (number > 0 && number < 10) {
            for (int i = 0; i < multiplicationTable.length; i++) {
                multiplicationTable[i] = number * factor;
                factor++;
            }
            return multiplicationTable;
        }
        return new int[]{};

    } // как правильно оформить негативные кейсы.


// 17 Написать метод, который принимает массив целых чисел и возвращает массив четных чисел, если четных чисел больше,
// или массив нечетных чисел, если нечетных чисел больше

    public static int[] getArrayEvenNumbersOrOddNumbers(int[] array) {
        if (array.length != 0) {
            int countArrayEven = 0;
            int countArrayOdd = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
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
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0 && countEven < arriveEven.length) {
                    arriveEven[countEven] = array[i];
                    countEven++;
                } else if (countOdd < arriveOdd.length) {
                    arriveOdd[countOdd] = array[i];
                    countOdd++;
                }
            }
            System.out.println(Arrays.toString(arriveEven));
            System.out.println(Arrays.toString(arriveOdd));

            if (countArrayEven > countOdd) {
                return arriveEven;
            } else if (countArrayEven > countOdd) {
                return arriveOdd;
            }

        }
        return new int[0];
    } //17


// 18 Написать метод, который принимает на вход длину массива и генерирует массив случайных положительных чисел
// от 0 до 100 исключительно.

    public static int[] randomArrayInt(int columb, int upper, int lower) {
        int[] array = new int[columb];
        if (array.length <= 0) {
            return new int[]{};
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (upper - lower)) + lower;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }// 18

// 19 Написать метод, который принимает на вход длину массива l и количество знаков d
// (однозначные, двузначные, трехзначные и тд числа), и генерирует массив случайных целых положительных чисел
// длины l, в котором все числа имеют количество знаков d

    public static int[] getArrayLondLAndD(int l, int d) {
        int[] array = new int[l];
        if (array.length <= 0) {
            return array;
        } else {
            for (int i = 0; i < array.length; i++) {
                array[i] = d;//d править
            }
        }
        return new int[]{}; //править
    }


// 20 Написать метод, который принимает на вход массив целых положительных чисел, и возвращает массив только
// двузначных чисел. ПРоверить работу метода на массиве из задания 18.

    public static int[] getDoubleFigures(int[] array) {
        int count = 0;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 9 && array[i] < 100) {
                    count++;
                }
            }
            System.out.println(count);
            int[] arrayDoubleFigures = new int[count];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 9 && array[i] < 100) {
                    arrayDoubleFigures[arrayDoubleFigures.length - 1] = array[i];
                    count--;
                }
            }
            //System.out.println(Arrays.toString(arrayDoubleFigures));
            return arrayDoubleFigures;
        }
        return new int[0];
    }//20

// 21 Написать метод, который принимает на вход массив целых положительных двузначных чисел,
// и возвращает массив разниц между десятками и единицами

    public static int[] getBetweenTensAndOnes(int[] array) {
        int count = 0;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 9 && array[i] / 10 != 0)
                    count++;
            }
        }
        System.out.println(count);
        int[] betweenTensAndOnes = new int[count];
        int step = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] / 10 != 0 && betweenTensAndOnes.length <= array.length && array[i] > 9) {
                betweenTensAndOnes[step] = Math.abs(array[i] / 10 - array[i] % 10);
                step++;
            }
        }
        return betweenTensAndOnes;
    } //21

//22 Написать метод, который принимает массив из 11 целых положительных чисел от 0 до 9, и возвращает массив,
// который содержит номер телефона, состоящий из этих чисел,  и название страны, которой номер принадлежит.
//Например:
//method({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}

    public static String[] getArrayPhoneNomberAndCountryName(int[] array) {

        String[] str1 = new String[2];

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 1) {
               str1[1] = "USA";
            }
            if (i == 1) {
                str1[0] += "(";
            }
            if (i == 4) {
                str1[0] += ")";
            }
            if (i == 7) {
                str1[0] += "-";
            }
            if (i == 9) {
                str1[0] += "-";
            }
            str1[0] += (array[i]);

        }
        return str1;
    }

    //23 Написать метод, который принимает массив целых положительных чисел больше 0, и возвращает массив уникальных чисел
    public static int[] getUniqueArray(int[] array) {
        if (array.length == 0) {

            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] <= 0) {
                    return new int[]{-1};
                }
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
        System.out.println(count);
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


// 24 Написать метод, который принимает на вход массив целых положительных чисел,
// и возвращает количество уникальных и неуникальных элементов в этом массиве

    public static int[] getCountUniqueNonUnique(int[] array) {
        int n = 0;

        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 0) {
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[i] == array[j]) {
                            array[j] = -1;
                            n++;
                        }
                    }
                }

            }
            return new int[]{array.length - n, n};
        }
        return new int[]{0,0};
    } //24

 //25 Написать метод, который принимает на вход массив целых положительных чисел,
// и 2 целых положительных числа (значения индексов). Метод возвращает массив,
// который содержит только числа из первого массива в промежутке между индексами.
 //Например:
 //method({1, 2, 3, 4, 5}, 1, 3) -> {2, 3, 4}
 public static int[] getArrayFromIndAtoIndB(int[] array, int indexStart, int indexEnd) {

     if (array.length > 0) {
         int count = 0;
         if (indexStart >= 0 && indexEnd >= 0) {
             if (indexStart <= array.length - 1 && indexEnd <= array.length - 1 && indexStart <= indexEnd) {
                 for (int i = indexStart; i <= indexEnd; i++) {
                     if (array[i] >= 0) {
                         count++;
                     } else {
                         return new int[]{};
                     }
                 }
                 System.out.println(count);
                 int[] newArray = new int[count]; // Можно  вычислить без каун, взять конечный индекс - стартовый + 1
                 int count1 = 0;
                 for (int i = indexStart; i <= indexEnd; i++) {
                     newArray[count1] = array[i];
                     count1++;

                 }
                 return newArray;
             }
             System.out.println("Индекс выходит за пределы массива");
             return new int[]{};
         }
         System.out.println("Неверно указан индекс");
         return new int[]{};
     }
     return new int[]{};
 }
//    public static int[] getArrayFromIndAtoIndB(int[] array, int indexStart, int indexEnd) {
//
//        if (array.length > 0) {
//            if (indexStart >= 0 && indexEnd >= 0) {
//                if (indexStart <= array.length - 1 && indexEnd <= array.length - 1 && indexStart <= indexEnd) {
//                    int[] newArray = new int[indexEnd - indexStart + 1];
//                    for (int i = 0; i < newArray.length; i++) {
//                        if (array[indexStart] >= 0) {
//                            newArray[i] = array[indexStart];
//                            indexStart++;
//                        } else {
//                            return new int[]{};
//                        }
//                    }
//                    return newArray;
//                }
//                System.out.println("Индекс выходит за пределы массива");
//                return new int[]{};
//            }
//            System.out.println("Неверно указан индекс");
//            return new int[]{};
//        }
//        return new int[]{};
//    } ВЕРСИЯ КОРОЧЕ без вычисления длинны массива циклом


 // 26 Написать метод, который принимает на вход 2 массива int[] и возвращает
 // объединенный массив уникальных неповторяющихся элементов
 public static int[] getUniqueSumArray(int[] array, int[] array1) {

     if (array == null || array1 == null || array.length == 0 && array1.length == 0) {
         return array;
     }
     int[] sumTwoArrays = new int[array.length + array1.length];
     for (int i = 0; i < array.length; i++) {
         sumTwoArrays[i] = array[i];
     }
     for (int i = 0; i < array1.length; i++) {
         sumTwoArrays[array.length + i] = array1[i];
     }

     return getUniqueArray(sumTwoArrays);
 }


    public static void main(String[] args) {
        Hw5.taskNumbere = 1;
        /** РЕШИТЬ !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
         *
         */
        Hw5.printTaskNumber();

        //  static Integer i_1 = new Integer(5);
        //  static Double d_1 = new Double(5.5);
        //  static String str_1 = new String("Hello");

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

        System.out.println(getCountNumbers(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println(getCountNumbers(new int[]{}));
        System.out.println(getCountNumbers(new int[]{0, 2, 3, 4, 5, 7}));
        System.out.println(getCountNumbers(new int[]{1, 2, 3, -4, 5, 7}));


        /** 12
         *  Написать метод, который принимает на вход массив целых положительных чисел,  и возвращает массив нечетных чисел
         */
        Hw5.printTaskNumber();

        System.out.println("Преобразование массива четных чисел в нечетный = "
                + Arrays.toString(getArrayOddNumbers(getArray(1, 2, 9, 13, 15))));

        System.out.println("Преобразование массива четных чисел в нечетный = "
                + Arrays.toString(getArrayOddNumbers(getArray(0, 2, 9, 13, 15))));

        System.out.println("Преобразование массива четных чисел в нечетный = "
                + Arrays.toString(getArrayOddNumbers(getArray(-1, 2, 9, 13, 15))));

        /** 13
         * Написать метод, который принимает на вход массив целых чисел,  и возвращает массив значений true или false,
         * если числа больше 10
         */
        Hw5.printTaskNumber();
        System.out.println(Arrays.toString(getBool(getArray(1, 12, -1, 3, 7))));
        System.out.println(Arrays.toString(getBool(getArray(1, 12, 0, 3, 7))));
        System.out.println(Arrays.toString(getBool(getArray(1, 12, 8, 3, 7))));

        /** 14
         * Написать метод, который принимает на вход массив слов,  и возвращает строку, состоящую из этих слов
         */
        Hw5.printTaskNumber();
        System.out.println((getStringFromArray(getArray("Привет", "как", "ты", "что", "нового"))));


        /** 15
         * Написать метод, который принимает массив целых чисел и считает сумму чисел во второй половине массива
         */
        Hw5.printTaskNumber();
        System.out.println(sumOfSecondHalfArray(getArray(22, 11, 88, 41, 9)));

        /** 16
         * Написать метод, который принимает на вход целое положительные число в пределах от 1 до 10 исключительно, и
         * возвращает таблицу умножения на это число в виде массива
         * Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
         */
        Hw5.printTaskNumber();
        System.out.println(Arrays.toString(getMultiplicationTable(5, 10)));
        System.out.println(Arrays.toString(getMultiplicationTable(3, 20)));
        System.out.println(Arrays.toString(getMultiplicationTable(-5, 10)));
        System.out.println(Arrays.toString(getMultiplicationTable(11, 10)));


        /** 17
         * Написать метод, который принимает массив целых чисел и возвращает массив четных чисел,
         * если четных чисел больше, или массив нечетных чисел, если нечетных чисел больше
         */
        Hw5.printTaskNumber();
        System.out.println(Arrays.toString(getArrayEvenNumbersOrOddNumbers(randomArrayInt(10, 100, 1))));


        /** 18
         *  Написать метод, который принимает на вход длину массива и генерирует массив случайных
         *  положительных чисел от 0 до 100 исключительно.
         */
        Hw5.printTaskNumber();

        System.out.println(Arrays.toString(randomArrayInt(10, 100, 1)));
        System.out.println(Arrays.toString(randomArrayInt(0, 100, 1)));

        /** 19
         * Написать метод, который принимает на вход длину массива l и количество знаков d
         * (однозначные, двузначные, трехзначные и тд числа), и генерирует массив
         * случайных целых положительных чисел длины l, в котором все числа имеют количество знаков d
         */
        Hw5.printTaskNumber();

        /** 20
         * Написать метод, который принимает на вход массив целых положительных чисел, и возвращает массив только
         * двузначных чисел. ПРоверить работу метода на массиве из задания 18.
         */
        Hw5.printTaskNumber();
        System.out.println(Arrays.toString(getDoubleFigures(randomArrayInt(10, 1000, 10))));

        /** 21
         *  Написать метод, который принимает на вход массив целых положительных двузначных чисел,
         *  и возвращает массив разниц между десятками и единицами
         */
        Hw5.printTaskNumber();
        System.out.println(Arrays.toString(getBetweenTensAndOnes(randomArrayInt(10, 100, 5))));

        /** 22
         * Написать метод, который принимает массив из 11 целых положительных чисел от 0 до 9, и возвращает массив,
         * который содержит номер телефона, состоящий из этих чисел,  и название страны, которой номер принадлежит.
         * Например:
         * method({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}
         */
        Hw5.printTaskNumber();

        int[] array1 = new int[]{1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(getArrayPhoneNomberAndCountryName(array1)));

        /** 23
         * Написать метод, который принимает массив целых положительных чисел больше 0,
         * и возвращает массив уникальных чисел.
         */
        Hw5.printTaskNumber();
        int[] array = new int[]{3, 4, 4, 5, 6, 9, 5, 1, 2, 1, 7};
        int[] array11 = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(getUniqueArray(array)));


        /**
         * 24 Написать метод, который принимает на вход массив целых положительных чисел,
         * и возвращает количество уникальных и неуникальных элементов в этом массиве
         */
        Hw5.printTaskNumber();
        int[] array34 = new int[]{3, 4, 4, 5, 6, 9, 5, 1, 2, 1, 7, 3, 4, 4, 5, 6, 9, 5, 1, 2, 1, 7, 3, 4, 4, 5, 6, 9, 5, 1, 2, 1, 7};
        int[] array2 = new int[]{1, 1, 1, 1, 1, 1, 1};
        int[] array3 = new int[]{1, 1, 1, 1, 1, 1, -1};
        int[] array4 = new int[]{};

        System.out.println(Arrays.toString(getCountUniqueNonUnique(array34)));

        /** 25
         *Написать метод, который принимает на вход массив целых положительных чисел,
         * и 2 целых положительных числа (значения индексов). Метод возвращает массив, который содержит
         * только числа из первого массива в промежутке между индексами.
         * Например:
         * method({1, 2, 3, 4, 5}, 1, 3) -> {2, 3, 4}
         */

        int[] array25 = new int[]{1, 2, 3, 4, 5};
        // int[] array1 = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(getArrayFromIndAtoIndB(array25, 1, 4)));

        /** 26
         *  Написать метод, который принимает на вход 2 массива int[] и возвращает объединенный массив
         *  уникальных неповторяющихся элементов
         */
        int[] array26 = new int[]{1, 2, 3, 4, 5, 13, 12, 7, 9};
        int[] array26_1 = new int[]{1, 2, 3, 4, 5,7, 9,8, 11 ,17};
        System.out.println(Arrays.toString(getUniqueSumArray(array26, array26_1)));


    }


}

