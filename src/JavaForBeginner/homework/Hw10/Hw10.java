package JavaForBeginner.homework.Hw10;
// написать алгоритм CapitalizeWords, который принимает на вход предложения с единичным пробелом между словами,
// и возвращает предложение, в котором все слова написаны с большой буквы
// "   happy birthday!    " --> "Happy Birthday!"
// "   john jacob smith jr." --> "John Jacob Smith Jr."

import JavaForBeginner.homework.Hw5;

import java.sql.SQLOutput;

import static JavaForBeginner.homework.Hw5.printTaskNumber;
import static JavaForBeginner.homework.Hw5.taskNumbere;

public class Hw10 {

    public static String capitalizeWords(String sentence) {
        if (sentence != null) {
            sentence = sentence.trim();

            if (sentence.length() != 0) {
                sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);

                for (int i = 1; i < sentence.length(); i++) {
                    if (sentence.charAt(i) == ' ') {
                        sentence = sentence.substring(0, i + 1)
                                + sentence.substring(i + 1, i + 2).toUpperCase() + sentence.substring(i + 2);
                    }
                }

                return sentence;
            }

            return "длина 0";
        }

        return "null";
    }


    /**
     * 1
     * Написать метод, который принимает на вход строку.
     * Если строка не пустая (проверить методом из видео), то примените метод по удалению пробелов в начале строки и в конце строки.
     * Догадаться, каким методом из видео можно проверить, были ли пробелы.
     * Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
     * Если пробелов не было, вернуть сообщение “Пробелов не было”.
     * Если строка пустая, вернуть сообщение “Строка пустая”.
     * <p>
     * Test Data:
     * “    QA4Everyone   “ → “Лишние пробелы удалены”
     * “QA4Everyone“ → “Пробелов не было”
     * “” → “Строка пустая”
     */

    public static String getSay(String str) {
        if (str != null) {

            if (str.isEmpty() == false) {

                str.trim();

                if (str.length() != str.trim().length()) {

                    return "Лишние пробелы удалены";
                } else if (str.length() == str.trim().length()) {

                    return "Пробелов не было";
                }

            }

            return "Строка пустая";
        }
        return "null";
    }//1

    /**
     * 2
     * Написать алгоритм RemoveAlla.
     * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
     * то метод удаляет все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
     * Test Data:
     * “    QA4Everyone   “ →  “QA4Everyone“
     * “panda   “ → “pnd”
     */
    public static String RemoveAlla(String str) {
        if (str == null) {

            return "null";
        }
            if (str.isEmpty()) {

                return "Строка пустая";
            }


        return str.trim().replace("a", "");
    }//2

    /**
     * 3
     * Написать алгоритм RemoveAllZeros.
     * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр.
     * Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает
     * обработанную строку, в которой нет нулей.
     * Test Data:
     * “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
     * “ 0000000111“ → “111”
     */

    public static String RemoveAllZeros(String str) {
        if (str != null) {
            if (str.isEmpty()) {

                return "Строка пустая";
            }

            return str.trim().replace("0", "").replace(" ", "");
        }

        return "null";
    }//3

    /**
     * 4
     * Написать алгоритм RemoveAllSpaces.
     * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
     * то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
     * Test Data:
     * “    QA   4  Everyone   “ →  “QA4Everyone“
     * “p a     n d a   “ → “panda”
     */

    public static String RemoveAllSpaces(String str) {
        if (str != null) {
            if (str.isEmpty()) {

                return "Строка пустая";
            }

            return str.trim().replace(" ", "");
        }
        return "null";
    }//4

    /**
     * 5
     * Напишите метод, который принимает на вход строку и считает, сколько букв а или А содержится в строке.
     * Test Data:
     * “Abracadabra” → 5
     * “Homenum Revelio” → 0
     */

    public static int getCount(String str) {
        if (str != null) {
            if (str.isEmpty()) {

                return -1;
            }
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                    count++;
                }
            }

            return count;
        }

        return Integer.MIN_VALUE;

        }//5

    /** 6
     * Напишите метод, который принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java. */

    public static boolean getContains(String str) {
        if (str != null) {
            if (str.isEmpty()) {
                return false;
            }

            return str.contains("Java");
        }
        return false;
    }

    /** 7
     * Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки,
     * точку и кавычки в конце строки с помощью метода concat()
     * Test Data:
     * “One” → ““One.””
     * “    TWO  “ → ““TWO.””  */

    public static String addQuoteStartStrAndDotEndStr(String str) {
        if (str != null) {
            if (str.isEmpty()) {

                return "";
            }
            // str.concat(."");

            return "";
        }
        return "null";
    }

    /** 8
     * Напишите метод, который принимает на вход название города и исправляет написание:
     * Test Data:
     * “ташкент” → “Ташкент”
     * “ЧикаГО” → “Чикаго”
     */

    public static String getCorrectCity(String str) {
        if (str != null) {
            if (str.isEmpty()) {

                return  "Строка пустая";
            }

        String strLowerCase = str.toLowerCase();
        String newStr = strLowerCase.substring(0, 1).toUpperCase() + strLowerCase.substring(1);

            return newStr;
        }

        return "null";

    }




    public static void main(String[] args) {
        taskNumbere = 1;
// Пример с урока !
        System.out.println(capitalizeWords(" "));
        System.out.println(capitalizeWords(null));
        // System.out.println(capitalizeWords("   john jacob smith jr."));
        // System.out.println(capitalizeWords(""));
        // System.out.println(capitalizeWords("   happy birthday!    "));


/** 1
 *  Написать метод, который принимает на вход строку.
 * Если строка не пустая (проверить методом из видео), то примените метод по удалению пробелов в начале строки и в конце строки.
 * Догадаться, каким методом из видео можно проверить, были ли пробелы.
 * Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
 * Если пробелов не было, вернуть сообщение “Пробелов не было”.
 * Если строка пустая, вернуть сообщение “Строка пустая”.
 *
 * Test Data:
 * “    QA4Everyone   “ → “Лишние пробелы удалены”
 * “QA4Everyone“ → “Пробелов не было”
 * “” → “Строка пустая”
 */

        printTaskNumber();

        System.out.println(getSay("    QA4Everyone   "));
        System.out.println(getSay("QA4Everyone"));
        System.out.println(getSay(""));
        System.out.println(getSay(null));

/** 2
 * Написать алгоритм RemoveAlla.
 * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
 * то метод удаляет все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
 * Test Data:
 *  “    QA4Everyone   “ →  “QA4Everyone“
 * “panda   “ → “pnd”
 */

        printTaskNumber();

        System.out.println(RemoveAlla("    QA4Everyone   "));
        System.out.println(RemoveAlla("panda   "));
        System.out.println(RemoveAlla(""));
        System.out.println(RemoveAlla(null));

/**3
 * Написать алгоритм RemoveAllZeros.
 * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр.
 * Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает о
 * бработанную строку, в которой нет нулей.
 * Test Data:
 *  “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
 * “ 0000000111“ → “111”
 */
        printTaskNumber();

        System.out.println(RemoveAllZeros("   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 "));
        System.out.println(RemoveAllZeros(" 0000000111"));
        System.out.println(RemoveAllZeros(""));
        System.out.println(RemoveAllZeros(null));

/**4
 *  Написать алгоритм RemoveAllSpaces.
 * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
 * Test Data:
 *  “    QA   4  Everyone   “ →  “QA4Everyone“
 * “p a     n d a   “ → “panda”
 */

        printTaskNumber();
        System.out.println(RemoveAllSpaces("    QA   4  Everyone   "));
        System.out.println(RemoveAllSpaces("p a     n d a   "));
        System.out.println(RemoveAllSpaces(""));
        System.out.println(RemoveAllSpaces(null));

/**5
 *Напишите метод, который принимает на вход строку и считает, сколько букв а или А содержится в строке.
 * Test Data:
 * “Abracadabra” → 5
 * “Homenum Revelio” → 0
 */
        printTaskNumber();

        String str = "abcd";
        System.out.println(getCount("Abracadabra"));
        System.out.println(getCount("Homenum Revelio"));
        System.out.println(getCount(""));
        System.out.println(getCount(null));

 /** 6
  * Напишите метод, который принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java. */

   String str6 = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current" +
           " long-term support (LTS) versions. Oracle released the last zero-cost public update for the " +
           "legacy version Java 8 LTS in January 2019 for commercial use, although it will otherwise still " +
           "support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer " +
           "zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";

   String str6_1 = "As a decrepit father takes delight\n" +
           "To see his active child do deeds of youth,\n" +
           "So I, made lame by fortune’s dearest spite,\n" +
           "Take all my comfort of thy worth and truth.\n" +
           "For whether beauty, birth, or wealth, or wit,\n" +
           "Or any of these all, or all, or more,\n" +
           "Entitled in thy parts do crownèd sit,\n" +
           "I make my love engrafted to this store.\n" +
           "So then I am not lame, poor, nor despised,\n" +
           "Whilst that this shadow doth such substance give\n" +
           "That I in thy abundance am sufficed,\n" +
           "And by a part of all thy glory live.\n" +
           "Look what is best, that best I wish in thee.\n" +
           "This wish I have; then ten times happy me.";


        printTaskNumber();
        System.out.println(getContains(str6));
        System.out.println(getContains(str6_1));
        System.out.println(getContains(null));

        /** 7
         * Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки,
         * точку и кавычки в конце строки с помощью метода concat()
         * Test Data:
         * “One” → ““One.””
         * “    TWO  “ → ““TWO.””
         */

        printTaskNumber();


        /** 8
         * Напишите метод, кторый принимает на вход название города и исправляет написание:
         * Test Data:
         * “ташкент” → “Ташкент”
         * “ЧикаГО” → “Чикаго”
         */

        printTaskNumber();

        System.out.println(getCorrectCity("ташкент"));
        System.out.println(getCorrectCity("ЧикаГО"));
        System.out.println(getCorrectCity(null));








    }
}
