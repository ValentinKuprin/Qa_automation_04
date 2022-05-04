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

        if (str.isEmpty() == false) {

            str.trim();

            if (str.length() != str.trim().length()) {

                return "Лишние пробелы удалены";
            } else if (str.length() == str.trim().length()) {

                return "Пробелов не было";
            }

        }
        return "Строка пустая";
    }//1

/** 2
 * Написать алгоритм RemoveAlla.
 * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
 * то метод удаляет все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
 * Test Data:
 *  “    QA4Everyone   “ →  “QA4Everyone“
 * “panda   “ → “pnd”
 */
        public static String RemoveAlla(String str) {
            if (str.isEmpty()) {
             return "";
            }
            return str.trim().replace("a", "");
        }//2

/**3
 * Написать алгоритм RemoveAllZeros.
 * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр.
 * Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает
 * обработанную строку, в которой нет нулей.
 * Test Data:
 *  “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
 * “ 0000000111“ → “111”
 */

    public static String RemoveAllZeros(String str) {
        if (str.isEmpty()){
           return "";
        }
        return str.trim().replace("0","").replace(" ", "");

    }//3

/**4
 *  Написать алгоритм RemoveAllSpaces.
 * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
 * Test Data:
 *  “    QA   4  Everyone   “ →  “QA4Everyone“
 * “p a     n d a   “ → “panda”
 */






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

/**4
 *  Написать алгоритм RemoveAllSpaces.
 * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
 * Test Data:
 *  “    QA   4  Everyone   “ →  “QA4Everyone“
 * “p a     n d a   “ → “panda”
 */


    }
}
