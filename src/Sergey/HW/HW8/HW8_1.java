package Sergey.HW.HW8;

import java.util.Locale;

public class HW8_1 {

// 1  Напишите функцию для преобразования имени в инициалы. Э
//На выходе должны быть две заглавные буквы с точкой, разделяющей их.

    public static String abbrevName(String name) {
        int index = name.indexOf(" ");
        name = (name.substring(0, 1) + "." + name.substring(index + 1, (index + 2))).toUpperCase();

        return name;
    }
//2 У всех животных праздник! Каждое животное приносит одно блюдо. Есть только одно правило:
//блюдо должно начинаться и заканчиваться теми же буквами, что и имя животного. Например,
//большая голубая цапля приносит чесночный наан, а синица приносит шоколадный торт.
//Напишите функцию feast, которая принимает имя животного и блюдо в качестве аргументов и возвращает
//true или false, чтобы указать, разрешено ли животному принести блюдо на пир.
//Предположим, что beast и dish всегда строчные строки, и каждая из них состоит как минимум из двух букв.
// beast и dish может содержать дефисы и пробелы, но они не будут отображаться в начале или конце строки.
// Они не будут содержать цифр.

    public static boolean feast(String beast, String dish) {
        if (beast.length() > 1 && dish.length() > 1) ; //УСЛОВИЕ НЕ РАБОТАЕТ !
        String firstSumbolBeast = beast.substring(0, 1);
        System.out.println(firstSumbolBeast);
        String firstSumbolDish = dish.substring(0, 1);
        System.out.println(firstSumbolDish);
        String lastSumbolDish = dish.substring(dish.length() - 1);
        System.out.println(lastSumbolDish);
        if (firstSumbolBeast.equals(firstSumbolDish) && firstSumbolBeast.equals(lastSumbolDish)) {

            return true;
        } else {

            return false;

        }
        }//2

//3 Создайте функцию, которая будет возвращать строку, объединяющую все буквы трех введенных строк в группы. Взяв
//первую букву всех входных данных и сгруппировав их рядом друг с другом.Сделайте это для каждой буквы,пример ниже!
//Например, ввод: "aa", "bb", "cc" => вывод: "abcabc"

        public static String tripleTrouble (String one, String two, String three) {
            String result = "";
            for (int i = 0; i < one.length(); i++) {
              //  (one.charAt(i) + two.charAt(i) + three.charAt(i));

            }
                return "qw";

        }

//4 Получив букву, верните ее положение в алфавите.
//Ввод :: "а"
//Вывод :: "Позиция алфавита: 1"

    public static String position(char alphabet) {
        return "";
    }

// 5 Я новичок в кодировании, и теперь я хочу получить сумму двух массивов... на самом деле сумму всех их элементов.
// Я буду признателен за вашу помощь.
//PS Каждый массив включает только целые числа. Выход - тоже число.

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < arr1.length; i ++) {
                sum+= arr1[i];
            }
        for (int i = 0; i < arr1.length; i ++) {
            sum1 += arr2[i];
        }

        return sum + sum1;
    }




    public static void main(String[] args) {

        System.out.println(abbrevName("stiv sigal"));

        System.out.println(feast("great blue heron","garlic nann"));
        System.out.println(feast("chickadee","chocolate cake"));
        System.out.println(feast("brown bear","bear claw"));


        System.out.println(tripleTrouble("aa", "bb", "cc"));

        String one = "absd";
        System.out.println(one.charAt(0));

        System.out.println(arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6,}));

    }
}
